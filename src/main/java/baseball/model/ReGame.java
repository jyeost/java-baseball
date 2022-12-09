package baseball.model;

public enum ReGame {
    RE_GAME("1"), QUIT("2");

    private final String value;

    ReGame(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
