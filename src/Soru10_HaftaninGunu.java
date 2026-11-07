import java.util.Scanner;

/** Soru 10: Haftanın Günü */
public class Soru10_HaftaninGunu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("1 ile 7 arasi sayi gir");
        int sayi=scanner.nextInt();
        switch (sayi) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6: 
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
                default :
                System.out.println(" gecersiz sayi");
        }

        scanner.close();
    }
}
