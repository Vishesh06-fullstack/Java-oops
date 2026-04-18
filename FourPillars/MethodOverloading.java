class MathsUtils{
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

     public int add(int a, int b, int c){
        return a+b+c;
    }
}

public  class MethodOverloading {
    public static void main(String[] args) {
        MathsUtils mu = new MathsUtils();
        System.out.println(mu.add(2, 3));
        System.out.println(mu.add(2.5, 3.5));
        System.out.println(mu.add(1, 2, 3));
    }
}
