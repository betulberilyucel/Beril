import java.util.Scanner;

/** Soru 2: Pozitif, Negatif veya Sıfır */
public class Soru02_PozitifNegatifSifir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("sayi giriniz");
        int sayi=scanner.nextInt();
        if(sayi==0){
            System.out.println("sayi sifira esittir");}
        else if(sayi>0){
            System.out.println("sayiniz pozitiftir");}
        else{
            System.out.println("sayiniz negatiftir");} 

        scanner.close();
    }
}
