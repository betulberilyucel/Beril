import java.util.Scanner;

/** Soru 6: Artık Yıl Kontrolü */
public class Soru06_ArtikYil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yil gir");
        int yil=scanner.nextInt();
        if(yil%400==0 || (yil%4==0 && yil%100!=0)){
              System.out.println("yiliniz artik yildir");}
        else{
              System.out.println("yiliniz artik yil degildir");}

        scanner.close();
    }
}
