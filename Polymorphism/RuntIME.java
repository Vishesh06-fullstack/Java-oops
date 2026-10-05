// run time polymorphism

class Vehicle {
    public void start(){
        System.out.println("Vehicle is running");
    }
}

 class Car extends Vehicle{
    @Override 
    public void start(){
        System.out.println("Car is running");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is running");
    }
}

// i m asking u okay so 
// run time polymorphism is basically give a another class to the parent class and then we can call
//the method of the child class using the parent class reference variable.

public class RuntIME{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}