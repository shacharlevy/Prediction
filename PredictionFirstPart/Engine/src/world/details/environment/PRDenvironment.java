package world.details.environment;

import java.util.List;

public class PRDenvironment {
    private List<PRDEnvProperty> properties;

    public boolean IsNameAlreadyExist(String name) {

        for(PRDEnvProperty p: this.properties) {

            if (p.GetName() == name){
                return true;
            }
        }

        return false;
    }
}
