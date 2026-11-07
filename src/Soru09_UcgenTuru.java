import java.util.Scanner;

/** Soru 9: Üçgen Türü Belirleme */
public class Soru09_UcgenTuru {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. kenari gir");
        int kenar1=scanner.nextInt();
        System.out.println("2. kenari gir");
        int kenar2=scanner.nextInt();
        System.out.println("3. kenari gir");
        int kenar3=scanner.nextInt();
        if(kenar1+kenar2>kenar3 && kenar1+kenar3>kenar2 && kenar2+kenar3>kenar1){
            if (a == b && b == c ) {
                System.out.println("eskenar ucgen");
            }
            else if(a == b || a == c || b == c ){
                System.out.println("ikizkenar ucgen");
            }
            else {
                System.out.println("cesitkenar ucgen");
            }
        }
        else{
            System.out.println("ucgen olusamaz");
        }

        scanner.close();
    }
}
