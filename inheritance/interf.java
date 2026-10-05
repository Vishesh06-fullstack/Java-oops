
interface Ani{
      void eat();
   }

   interface pet{
      void play();
}

class Dog implements Ani , pet{
      public void eat(){
         System.out.println("Dog is eating");
      }
      public void play(){
         System.out.println("Dog is playing");
      }
      public void sleep(){
        System.out.println("Dog is sleeping");
      }
}
public class interf{
   public static void main(String args[]){
    //   interf obj = new interf();
    //   interf.Dog d = obj.new Dog();
    //   d.eat();
    //   d.play()
    // ;
     Dog d = new Dog();
     d.eat();
     d.play();
     d.sleep();
   }
}