package interfaces_segregation;

//Liskov substitution Application
public class Main {
    public static void main (String args[]){

        Animal animal = new Jaguar(10, 120f);
        System.out.println(animal);
        animal.eat();
        animal.sleep();
        System.out.println("------------------------------");

        //Jaguar is an animal that capabilities to roar and kill because is a Wild Feline, but Not all can do it.
        Jaguar jaguar = new Jaguar(10, 120f);
        System.out.println(jaguar);
        jaguar.eat();
        jaguar.sleep();
        jaguar.kill();
        System.out.println("------------------------------");

        //Cat is an animal that capabilities to meow because is a Homemade Feline, but Not all can do it.
        Cat cat = new Cat(10, 120f);
        System.out.println(cat);
        cat.eat();
        cat.sleep();
        cat.meow();
        System.out.println("------------------------------");




    }
}
