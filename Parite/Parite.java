package Parite;

public class Parite {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        
    }
}
