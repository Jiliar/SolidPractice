package open_closed;

public class Presentacion {

    /*If we need to agregate another class to our solution we need to modify this class
    adding another method*/
    /*public void area(Rectangulo rectangulo){
        System.out.println(rectangulo.getBase() * rectangulo.getAltura());
    }

    public void area(Triangulo triangulo){
        System.out.println((triangulo.getBase() * triangulo.getAltura())/2);
    }*/

    //The best solution is used IPropiedades like argument to method area
    public void area(IPropiedades figura){
        System.out.println(figura.area());
    }
}
