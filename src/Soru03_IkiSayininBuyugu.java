import java.util.Scanner;

/** Soru 3: İki Sayının Büyüğü */
public class Soru03_IkiSayininBuyugu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a sayisini girin");
        int asayi=scanner.nextInt();
        System.out.println("b sayisini girin");
        int bsayi=scanner.nextInt();
        if(asayi==bsayi){
        System.out.println(" a ile b esittir");}
        else if (asayi>bsayi){
        System.out.println("a b'den buyuktur");}
        else{
              System.out.println("b a'dan buyuktur");}

        scanner.close();
    }
}
