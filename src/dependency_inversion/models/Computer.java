package dependency_inversion.models;

import dependency_inversion.repository.IKeyboard;
import dependency_inversion.repository.IMouse;

//High Level Module
public class Computer {

    //private Keyboard keyboard; //Concretion #1
    //private Mouse mouse; //Concretion #2

    private IKeyboard keyboard; //Abstraction #1
    private IMouse mouse; //Abstraction #2

    public Computer(IKeyboard keyboard, IMouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Computer() {
    }

    public IKeyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(IKeyboard keyboard) {
        this.keyboard = keyboard;
    }

    public IMouse getMouse() {
        return mouse;
    }

    public void setMouse(IMouse mouse) {
        this.mouse = mouse;
    }

    public void turnOn(){
        this.keyboard.plugIn();
        this.mouse.plugIn();
        System.out.println("¡Computer is On!");
    }
}
