import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // p = pear; a = apple; t = tomato; b = banana; e = eggplant
        int p,a,t,b,e;
        double pPrice = 2.14 , aPrice = 3.67 , tPrice = 1.11 , bPrice = 0.95 , ePrice = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Kilos of Pears: ");
        p = input.nextInt();

        System.out.print("How Many Kilos of Apples: ");
        a = input.nextInt();

        System.out.print("How Many Kilos of Tomatoes: ");
        t = input.nextInt();

        System.out.print("How Many Kilos of Bananas: ");
        b= input.nextInt();

        System.out.print("How Many Kilos of Eggplant: ");
        e = input.nextInt();

        double totalPrice = ( pPrice * p ) + ( aPrice * a ) + ( tPrice * t ) + ( bPrice * b ) + ( ePrice * e );
        System.out.print("Total Price: "+ totalPrice + " TL");



    }
}
