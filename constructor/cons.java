public class cons {
    
    // cons(){ // non parameterized constructor
    //     System.out.println("constructor is called");
    // }
    int a;
    cons(int a){
        this.a = a;
    }
    // copy constructr
    cons(cons c ){
       this.a = c.a;
    }


    public static void main(String[] args) {
        // cons c = new cons(10); // object is created and constructor is called
        // System.out.println("value of c:" + c);
        // System.out.println("Value of a: " + c.a);
        cons c1 = new cons(10);
        cons c2 = new cons(c1); //copy constructor is called
        System.out.println("value of c1: " + c1.a);
        System.out.println("value of c2: " + c2.a);

    }
}
