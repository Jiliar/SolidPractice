package dependency_inversion.models;

import dependency_inversion.repository.IKeyboard;

//Low Level Module
public class MechanicalKeyboard extends Device implements IKeyboard {
    public void plugIn(){
        System.out.println("¡Mechanical Keyboard is connected!");
    }

    @Override
    public void type() { System.out.println("¡Mechanical Keyboard has typed!");}
}
