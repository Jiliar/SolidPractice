package interfaces_segregation;

public class Cat extends Animal implements IHomemadeFelineActions {

    public Cat(int age, float weight){
        super(age, weight);
    }

    @Override
    public void meow() {
        System.out.println("¡The cat is meowing!");
    }
}
