class Animal{


    void eat(){
        System.out.println("eat");
    }

}

  class Dog extends Animal{
        void bark(){
            System.out.println("bark");
        }

        void sleep(){
            System.out.println("sleep");
        }
    }

     class Cat extends Animal{
        void meow(){
            System.out.println("meow");
        }
        void sleep(){
            System.out.println("sleep");
        }
    }

public class  Inheritance {
    
    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.bark();
       dog.sleep();
       dog.eat();

    }
}