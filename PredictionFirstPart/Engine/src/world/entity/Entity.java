package entity;

import java.util.List;

/*An entity that represents one individual in the world.
The entity has a name, as well as how many instances of it exist in the world.
For each entity it will be possible to define a number of characteristics (assets) by which it is distinguished from others.
Each property will be defined using the following definitions:
• Unique name
• Type: integer, real number, boolean value, character string
• Limits on the possible values of the property (optional)
• Providing initial values*/
public class Entity {
    private static int numberOfEntities = 0;
    private String name;
    private int amount;
    private List<Property> properties;


    public Entity(String name, int amount, List<Property> properties) {
        this.name = name;
        this.amount = amount;
        this.properties = properties;
        numberOfEntities++;
    }



}
