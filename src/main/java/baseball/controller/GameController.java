package baseball.controller;

import baseball.model.Balls;
import baseball.model.Judge;
import baseball.model.ReGame;
import baseball.view.Input;
import baseball.view.OutPut;

public class GameController {
    private final Input input;
    private final OutPut outPut;

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
        Judge judge;
        do {
            Balls userBalls = input.getUserBalls();
            judge = new Judge(userBalls, computerBalls);
            outPut.printJudgeResult(judge);
        } while (judge.getStrikeResult() != Balls.BALLS_LENGTH);
        if (input.getUserReGame() == ReGame.RE_GAME) play();
    }
}
