package world.simulation;

import java.sql.Time;
import world.factors.environment.Range;

public class Simulation {
    private static int nextId = 0;
    private int id;
    private Time date;
    private String name;
    private String type; //TODO: check type
    private Range range;
    private boolean isFinished;


}
