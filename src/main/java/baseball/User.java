package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import camp.nextstep.edu.missionutils.Console;

public class User {

    public static List<Integer> inputBalls() {
        System.out.println("숫자야구 게임을 시작합니다.");
        System.out.print("숫자를 입력해주세요 : ");

        String userInput =Console.readLine();
        List<Integer> userBallsList = checkUserInput(userInput);

        return userBallsList;
    }


    public static List<Integer>checkUserInput(String userInput){

        if(userInput== null){
            throw new IllegalArgumentException("빈 값은 입력할 수 없습니다.");
        }

        if(userInput.length()!=3){
            throw new IllegalArgumentException(userInput.length()+"자리는 입력할 수 없습니다.");
        }

        int userInputNum = 0;

        try{
            userInputNum = Integer.parseInt(userInput);

        } catch (NumberFormatException e){
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }

        return makeUserBalls(userInputNum);
    }


    private static List<Integer> makeUserBalls(int userInputNum) {

        List<Integer> userBallsList = Arrays.asList(userInputNum/100, userInputNum%100/10, userInputNum%10);
        Stream<Integer> userBallStream = userBallsList.stream();

        int count = (int) userBallStream.distinct().count();
        if(count!=3){
            throw new IllegalArgumentException("중복된 숫자는 입력할수 없습니다.");
        }

        if(userBallsList.contains(0)){
            throw new IllegalArgumentException("볼은 1~9까지의 수 입니다.");
        }

        return userBallsList;

    }
}
