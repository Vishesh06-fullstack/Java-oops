class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }
    void eat(){
        System.out.println(name + " is Eating...");
    }
    void sleep(){
        System.out.println(name + " is Sleeping...");
    }
    void bark(){
        System.out.println(name + " is Barking...");
    }
}

class Dog extends Animal{
   Dog(String name){
        super(name);
   }

   void bark(){
       super.bark();
   }
    
}

class Breed extends Dog{
    String color;
    String breed;

    Breed(String breed , String color , String name){
        super(name);
        this.breed = breed;
        this.color = color;  
    }

    void displayInfo(){
        System.out.println("breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Name:" + name);
    }
}
public class inheritance {
    public static void main(String[] args) {
       
        Dog myDog = new Dog("Buddy");
        myDog.eat();
        myDog.bark();
        myDog.sleep();

        Breed myBreed = new Breed("pitbull" , "Brown" , "Roger");
       
        myBreed.displayInfo();
        myBreed.bark();
        myBreed.eat();
        
    }
}
