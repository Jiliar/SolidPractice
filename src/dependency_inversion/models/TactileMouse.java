package dependency_inversion.models;

import dependency_inversion.repository.IMouse;

//Low Level Module
public class TactileMouse extends Device implements IMouse {

    public void plugIn(){
        System.out.println("¡Tactile Mouse is connected!");
    }

    @Override
    public void click() { System.out.println("¡Tactile Mouse has clicked!");}
}
