package world.details.rule;

import world.details.entity.PRDentity;
import world.details.entity.PRDproperty;

public class Action {
    public enum Type {INCREASE, DECREASE, CALCULATION, CONDITION, SET, KILL, REPLACE, PROXIMITY};

    private Entity entity;
    private Property property;
    private Type type;
    private String by;
    private float probability;

}
