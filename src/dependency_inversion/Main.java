package dependency_inversion;

import dependency_inversion.models.*;
import dependency_inversion.repository.IKeyboard;
import dependency_inversion.repository.IMouse;

public class Main {

    public static void main (String[] args){

        //Desktop Computer creating
        IMouse mouse1 = new CableMouse();
        IKeyboard keyboard1 = new MechanicalKeyboard();
        Computer computer = new Computer(keyboard1, mouse1);

        //Tactile laptop creating
        IMouse mouse2 = new TactileMouse();
        IKeyboard keyboard2 = new TactileKeyboard();
        Computer laptop = new Computer(keyboard2, mouse2);

        computer.turnOn();
        laptop.turnOn();
    }
}
