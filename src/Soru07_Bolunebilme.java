import java.util.Scanner;

/** Soru 7: Bölünebilme Kontrolü */
public class Soru07_Bolunebilme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi=scanner.nextInt();
        if(sayi%3==0 && sayi%5==0){
            System.out.println("sayi hem 3'e hem 5'e tam bolunur");
        }
        else if(sayi%3==0){
            System.out.println("sayi 3'e tam bolunur");
        }
        else if(sayi%5==0){
            System.out.println("sayi 5'e tam bolunur");
        }
        else{
            System.out.println("sayi 3'e ve 5'e tam bolunemez");
        }

        scanner.close();
    }
}
