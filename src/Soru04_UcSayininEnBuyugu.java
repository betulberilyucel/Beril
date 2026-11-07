import java.util.Scanner;

/** Soru 4: Üç Sayının En Büyüğü */
public class Soru04_UcSayininEnBuyugu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("a sayisini gir");
        int a=scanner.nextInt();
          System.out.println(" b sayisini gir");
              int b=scanner.nextInt();
          System.out.println("c sayisini gir");
        int c=scanner.nextInt();
        if (a==b && b==c){
              System.out.println(" a b c esit");}
        else if(a==b && a>c){
              System.out.println("a ile b esit ve en buyuktur");}
        else if(a==c && a>b){
              System.out.println("a ile c esit ve en buyuktur");}
        else if(b==c && b>a){
              System.out.println( "b ile c esit ve en buyuktur");}
        else if(a>b && a>c){
             System.out.println(" a en buyuktur");}
        else if(b>a && b>c){
             System.out.println("b en buyuktur");}
        else {
             System.out.println("c en buyuktur");}

        scanner.close();
    }
}
