package baseball.model;

public enum JudgeResult {
    BALL("볼"), STRIKE("스트라이크"), NOTHING("낫싱");

    private final String value;

    JudgeResult(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
