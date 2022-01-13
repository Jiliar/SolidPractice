package dependency_inversion.models;

import dependency_inversion.repository.IKeyboard;

//Low Level Module
public class TactileKeyboard extends Device implements IKeyboard {
    public void plugIn(){
        System.out.println("¡Tactile Keyboard is connected!");
    }

    @Override
    public void type() { System.out.println("¡Tactile Keyboard has typed!");}
}
