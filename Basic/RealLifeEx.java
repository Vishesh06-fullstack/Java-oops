public class RealLifeEx {

    static class Car{
        private String color;
        private String model;


        void drive(){
            System.out.println("Driving a " + color + " " + model);
        }
    }

    public static void main(String[] args){
        Car car1 = new Car();
        car1.color = "red";
        car1.model = "Toyota";
        System.out.println(car1.color);
        car1.drive();
    }
}