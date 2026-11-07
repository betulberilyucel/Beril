import java.util.Scanner;

/** Soru 9: Üçgen Türü Belirleme */
public class Soru09_UcgenTuru {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a kenari gir");
        int a=scanner.nextInt();
        System.out.println("b kenari gir");
        int b=scanner.nextInt();
        System.out.println("c kenari gir");
        int c=scanner.nextInt();
        if(a+b>c && a+c>b && b+c>a){
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
