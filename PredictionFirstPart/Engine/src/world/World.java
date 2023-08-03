package world;

import world.details.entity.PRDentity;
import world.details.environment.PRDenvironment;
import world.details.rule.PRDrule;
import world.details.termination.PRDtermination;

import java.util.List;

public class World {
    private Environment environment;
    private List<Entity> entities;
    private List<Rule> rules;
    private Termination termination;
}
