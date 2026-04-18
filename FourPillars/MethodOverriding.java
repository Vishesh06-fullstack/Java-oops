class Animal {
    void eat() {
        System.out.println("eat");
    }
    
}
class Dog extends Animal{
    void eat(){
        System.out.println("dog eat");
    }
}

public class MethodOverriding {
    // Animal a = new Dog();


    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat(); // dog eat

        // if new Animal() is created then it will print eat
    }
   
}