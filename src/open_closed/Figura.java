package open_closed;

public class Figura implements IPropiedades{

    private float base;
    private float altura;

    public Figura() {
    }

    public Figura(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public float area() {
        return 0;
    }
}
