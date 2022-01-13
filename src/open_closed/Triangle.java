package open_closed;

public class Triangle extends Figure {

    public Triangle(float base, float height) {
        super(base, height);
    }

    //overwriting of method area, we can avoid overwriting of methods implements interface in subclass
    public float area(){
        return (this.getBase() * this.getHeight())/2;
    }
}
