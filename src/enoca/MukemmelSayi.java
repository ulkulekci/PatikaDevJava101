package enoca;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        mukemmelCagir();}
        private static void mukemmelCagir(){
        int i,top=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int  sayi= input.nextInt();
        for (i=1;i<sayi;i++){
            if (sayi%i==0){
               top=top+i;
            }
        }
        if (sayi==top){
            System.out.println(sayi+": Mükemmel sayidir!");
        }
        else {
            System.out.println(sayi+": Mükemmel sayi değildir!");
        }
    }}



