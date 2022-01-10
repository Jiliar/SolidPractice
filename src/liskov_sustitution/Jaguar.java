package liskov_sustitution;

public class Jaguar extends Animal{

    public Jaguar(int age, float weight){
        super(age, weight);
    }

    public void sleep(){
        System.out.println("¡The Jaguar is sleeping!");
    }

    public void eat(){
        System.out.println("¡The Jaguar is eating!");
    }

}
