package baseball.view;

import baseball.model.Judge;
import baseball.model.JudgeResult;

public class OutputView implements OutPut {
    @Override
    public void printJudgeResult(Judge judge) {
        String result = "";
        if (judge.getStrikeResult() == 0 && judge.getBallResult() == 0) result += JudgeResult.NOTHING.getValue();
        if (judge.getBallResult() != 0) result += judge.getBallResult() + JudgeResult.BALL.getValue() + " ";
        if (judge.getStrikeResult() != 0) result += judge.getStrikeResult() + JudgeResult.STRIKE.getValue();
        System.out.println(result);
    }
}
