package feature;

public enum FunctionKey {
    EDIT("edit");

    private String code;

    FunctionKey(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
