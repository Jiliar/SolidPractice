package single_responsability;

public class Rectangle {

    private float base;
    private float altura;

    public Rectangle() {
    }

    public Rectangle(float base, float altura) {
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

    /*This method generate low cohesion and this method is violating of Single Responsibility principle.
    We need to move this method to another class that express Presentation to users*/
    /*public void imprimir(){
        System.out.println(this);
    }*/
}
