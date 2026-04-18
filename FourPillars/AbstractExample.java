abstract class Animal{
    abstract void sound();

    void eat(){
        System.out.println("eat");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("bark");
    }
}

public class AbstractExample {
    

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}
