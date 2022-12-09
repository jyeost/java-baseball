package baseball.view;

import baseball.model.JudgeResult;

public class OutputView implements OutPut {
    @Override
    public void printJudgeResult() {
        String result = "";
        if (JudgeResult.STRIKE.getCount() == 0 && JudgeResult.BALL.getCount() == 0) result += "낫싱";
        if (JudgeResult.BALL.getCount() != 0) result += JudgeResult.BALL.getCount() + JudgeResult.BALL.getValue() + " ";
        if (JudgeResult.STRIKE.getCount() != 0) result += JudgeResult.STRIKE.getCount() + JudgeResult.STRIKE.getValue();
        System.out.println(result);
    }
}
