package wraith.waystones.util;

public enum SearchType {
    CONTAINS("contains"),
    STARTS_WITH("starts_with");

    private final String configValue;

    SearchType(String configValue) {
        this.configValue = configValue;
    }

    public static SearchType fromConfigValue(String configValue) {
        return switch (configValue) {
            case "start" -> STARTS_WITH;
            default -> CONTAINS;
        };
    }

    public String getConfigValue() {
        return configValue;
    }
}
