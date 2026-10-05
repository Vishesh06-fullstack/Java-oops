interface A{
    public void showA();
}


interface B extends A {
    public void showB();
}

interface C extends B {
    public  void showC();
}

class D implements C{
    public void showA(){
        System.out.println("This is A");
    }
    public void showB(){
        System.out.println("This is B");
    }
    public void showC(){
        System.out.println("This is C");
    }
}

public class hybrid {
    
    public static void main(String[] args) {
        D d = new D();
        d.showA();
        d.showB();
        d.showC();
    }
}
