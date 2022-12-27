package diziMaxMin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int ky = -778;
        int by = 788;
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int numbers = input.nextInt();
        for (int i:list) {
           if (i<numbers){
               if (i>ky){
                 ky=i;
               }
           }
            if (i>numbers) {
               if(i<by){
                  by=i;
               }
            }
        }
        System.out.println("Dizi: "+Arrays.toString(list));
        System.out.println("Girilen Sayı :"+numbers);
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+ky);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+by);

    }
}
