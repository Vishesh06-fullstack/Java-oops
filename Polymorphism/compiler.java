import java.util.*;

public class compiler {

    public static int add(int a , int b , int c){
        return a + b + c;
    }

    public static double add(double a , double b , double c){
        return a + b + c;
    }
    public static void main(String[] args) {
        // compiler c = new compiler();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(add(a , b , c));
    }
}
