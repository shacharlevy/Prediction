package world.details.environment;

public class PRDEnvProperty {
    public enum Type {INTEGER, REAL_NUMBER, BOOLEAN_VALUE, CHARACTER_STRING};

    private String name;
    private Type type;
    private PRDrange range;


    public String GetName(){
        return this.name;
    }

}
