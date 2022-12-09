package baseball.controller;

import baseball.model.Balls;
import baseball.model.Judge;
import baseball.model.JudgeResult;
import baseball.model.ReGame;
import baseball.view.Input;
import baseball.view.OutPut;

public class GameController {

    Input input;
    OutPut outPut;

    public GameController(Input input, OutPut outPut) {
        this.input = input;
        this.outPut = outPut;
    }

    public void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        play();
        System.out.println("게임종료");
    }

    public void play() {
        Balls computerBalls = new Balls();
        computerBalls.makeRandomBalls();
        do {
            Balls userBalls = input.getUserBalls();
            new Judge(userBalls, computerBalls);
            outPut.printJudgeResult();
        } while (JudgeResult.STRIKE.getCount() != JudgeResult.STRIKE.getGoal());
        if (input.userReGame() == ReGame.RE_GAME) play();
    }


}
