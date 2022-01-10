package open_closed;

public class Rectangulo extends Figura {

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    //overwriting of method area, we can avoid overwriting of methods implements interface in subclass
    public float area(){
        return this.getBase() * this.getAltura();
    }
}
