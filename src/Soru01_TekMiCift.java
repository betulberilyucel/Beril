import java.util.Scanner;

/** Soru 1: Tek mi, Çift mi? */
public class Soru01_TekMiCift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("sayi giriniz");
        int sayi=scanner.nextInt();
        if(sayi%2==0){
            System.out.println("sayiniz cifttir");}
        else{
            System.out.println("sayiniz tektir");} 

        scanner.close();
    }
}
