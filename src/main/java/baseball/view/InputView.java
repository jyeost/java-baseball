package baseball.view;

import baseball.model.Balls;
import baseball.model.ReGame;
import camp.nextstep.edu.missionutils.Console;

public class InputView implements Input {
    @Override
    public Balls getUserBalls() {
        System.out.print("숫자를 입력해주세요 : ");
        try {
            return new Balls(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 숫자를 입력하셨습니다.");
            return getUserBalls();
        }
    }

    @Override
    public ReGame userReGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료" + System.lineSeparator() + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userInput = Console.readLine();
        if (ReGame.RE_GAME.getValue().equals(userInput)) return ReGame.RE_GAME;
        if (ReGame.QUIT.getValue().equals(userInput)) return ReGame.QUIT;
        // throw new IllegalArgumentException();
        System.out.println("1 또는 2만 입력가능 합니다.");
        return userReGame();
    }
}
