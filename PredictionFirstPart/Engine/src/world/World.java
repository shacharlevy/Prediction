package world;

import world.details.entity.PRDentity;
import world.details.environment.PRDenvironment;
import world.details.rule.PRDrule;
import world.details.termination.PRDtermination;

import java.util.List;

public class World {
    private PRDenvironment environment;
    private List<PRDentity> entities;
    private List<PRDrule> rules;
    private PRDtermination termination;
}
