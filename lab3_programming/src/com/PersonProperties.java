package com;

public enum PersonProperties {
    TALL("Высокий"),
    SHORT("Низкий"),
    OLD("Старый"),
    YOUNG("Молодой"),
    TALKATIVE("Разговорчивый"),
    TACITURN("Неразговорчивый"),
    RUDE("Грубый");
    private String properties;
    PersonProperties(String properties){
        this.properties = properties;
    }

    public String getProperties() {
        return properties;
    }
}
