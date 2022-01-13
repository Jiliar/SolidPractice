package open_closed;

public class Figure implements IPropiedades{

    private float base;
    private float height;

    public Figure() {
    }

    public Figure(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "{" + "base=" + base + ", altura=" + height + '}';
    }

    @Override
    public float area() {
        return 0;
    }
}
