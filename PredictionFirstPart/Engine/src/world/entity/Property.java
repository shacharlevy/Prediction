package entity;
public enum Type = {INTEGER, REAL_NUMBER, BOOLEAN_VALUE, CHARACTER_STRING}
public enum class Property {
    private String name;
    private Type type;
    private int rangeFrom;
    private int rangeTo;
    private boolean isRandom;

    public Property(String name, String type, int rangeFrom, int rangeTo, boolean isRandom) {
        this.name = name;
        this.type = type;
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
        this.isRandom = isRandom;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getRangeFrom() {
        return rangeFrom;
    }

    public int getRangeTo() {
        return rangeTo;
    }

    public boolean isRandom() {
        return isRandom;
    }



}
