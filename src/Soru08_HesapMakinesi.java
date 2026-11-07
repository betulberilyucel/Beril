import java.util.Scanner;

/** Soru 8: Basit Hesap Makinesi */
public class Soru08_HesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayiyi gir");
        int sayi1=scanner.nextInt();
        System.out.println("islemi gir(+ - * / )");
        char islem=scanner.next().charAt(0);
        System.out.println("2. sayiyi gir");
        int sayi2=scanner.nextInt();
        if(islem=='+'){
              System.out.println(sayi1 + sayi2);
        }
        else if(islem=='-'){
              System.out.println(sayi1 - sayi2);
        }
        else if(islem=='*'){
              System.out.println(sayi1 * sayi2);
        }
        else if(islem=='/'){
            if(sayi2==0){
                  System.out.println("sifira bolme yapilamaz");
            }
            else{
                  System.out.println(sayi1 / sayi2);
            }
        }
        else{
              System.out.println("gecersiz islem");
        }
            
        // TODO: Girdileri alın

        // TODO: Girdileri kontrol edin (geçersiz giriş / sınır durumları)

        // TODO: Karar yapısını yazın

        // TODO: Sonucu ekrana yazdırın

        scanner.close();
    }
}
