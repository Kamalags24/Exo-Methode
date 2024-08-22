package Surchage;

public class Surchage {
    
    static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    static double multiply(double a, double b) {
        double result = a * b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply(2, 6));
        System.out.println(multiply(2.5, 3.5));
    }

}
