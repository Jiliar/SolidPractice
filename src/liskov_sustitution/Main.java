package liskov_sustitution;

//Liskov sustitution Application
public class Main {
    public static void main (String args[]){

        Jaguar jaguar = new Jaguar(10, 120f);
        System.out.println(jaguar);
        jaguar.eat();
        jaguar.sleep();
        System.out.println("------------------------------");

        //Animal is Super Clase (Base Class), this class can sustitute Sub clases (SubType Class)
        Animal animal = new Jaguar(10, 120f);
        System.out.println(animal);
        animal.eat();
        animal.sleep();

    }
}
