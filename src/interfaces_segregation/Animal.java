package interfaces_segregation;

public class Animal implements IAnimalActions{

    private int age;
    private float weight;

    public Animal() {
    }

    public Animal(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()+"{" +"age=" + age +", weight=" + weight + '}';
    }

    @Override
    public void sleep(){
        System.out.println("¡The animal is sleeping!");
    }

    @Override
    public void eat(){
        System.out.println("¡The animal is eating!");
    }

    @Override
    public void play() { System.out.println("¡Animal is playing!"); }

    @Override
    public void sex() { System.out.println("¡Animal is having sex!"); }
}
