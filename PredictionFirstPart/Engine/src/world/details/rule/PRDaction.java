package world.details.rule;

import world.details.entity.PRDentity;
import world.details.entity.PRDproperty;

public class PRDaction {
    public enum Type {INCREASE, DECREASE, CALCULATION, CONDITION, SET, KILL, REPLACE, PROXIMITY};

    private PRDentity entity;
    private PRDproperty property;
    private Type type;
    private String by;
    private float probability;

}
