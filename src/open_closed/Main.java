package open_closed;

public class Main {
    public static void main (String[] args){
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle =  new Triangle(10,5);
        Presentacion presentacion = new Presentacion();
        //Presentation class can calculate specific area because implements Interface that define method
        presentacion.area(rectangle);
        presentacion.area(triangle);
    }
}
