package open_closed;

public class Rectangle extends Figure {

    public Rectangle(float base, float height) {
        super(base, height);
    }

    //overwriting of method area, we can avoid overwriting of methods implements interface in subclass
    public float area(){
        return this.getBase() * this.getHeight();
    }
}
