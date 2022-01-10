package interfaces_segregation;

public class Jaguar extends Animal implements IWildFelineActions {

    public Jaguar(int age, float weight){
        super(age, weight);
    }

    @Override
    public void sleep(){
        System.out.println("¡The Jaguar is sleeping!");
    }

    @Override
    public void eat(){
        System.out.println("¡The Jaguar is eating!");
    }

    @Override
    public void kill() {System.out.println("¡The Jaguar is killing!");}

    @Override
    public void roar() { System.out.println("¡The Jaguar is roaring!");}
}
