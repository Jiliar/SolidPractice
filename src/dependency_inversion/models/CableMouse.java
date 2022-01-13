package dependency_inversion.models;

import dependency_inversion.repository.IMouse;

//Low Level Module
public class CableMouse extends Device implements IMouse {

    public void plugIn(){
        System.out.println("¡Cable Mouse is connected!");
    }

    @Override
    public void click() { System.out.println("¡Cable Mouse has clicked!");}
}
