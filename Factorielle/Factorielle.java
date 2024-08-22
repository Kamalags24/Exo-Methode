package Factorielle;

public class Factorielle {

    static void factorial(int n) {
        int factor = 1;
        
        for (int i = 1; i <= n; i++) {
            factor*=i;
        }
        System.out.println("La factorielle de " + n + " est " + factor);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}
