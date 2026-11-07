import java.util.Scanner;

/** Soru 5: Not Değerlendirme */
public class Soru05_NotDegerlendirme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.println(" notunuzu girin");
        int not=scanner.nextInt();
        if(not<0 || not>100){
             System.out.println("gecersiz not");}
        else if(not>=90 && not<=100){
             System.out.println(" not= AA");}
        else if(not>=80 && not<=89){
             System.out.println("not=BA");}
        else if(not>=70 && not<=79){
             System.out.println("not=BB");}
        else if(not>=60 && not<=69){
             System.out.println("not=CB");}
        else if( not>=50 && not<=59){
             System.out.println("not=CC");}
        else{
             System.out.println("not=FF");}

        scanner.close();
    }
}
