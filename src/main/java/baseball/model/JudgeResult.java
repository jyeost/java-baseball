package baseball.model;

public enum JudgeResult {
    BALL("볼", 0, 0), STRIKE("스트라이크", 0, 3);

    private final String value;
    private final int goal;
    private int count;

    JudgeResult(String value, int count, int goal) {
        this.value = value;
        this.count = count;
        this.goal = goal;
    }

    public void initCount() {
        count = 0;
    }

    public void plusCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public String getValue() {
        return value;
    }

    public int getGoal() {
        return goal;
    }

    public void setBall() {
        BALL.count = BALL.count - STRIKE.count;
    }

}
