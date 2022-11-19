package ortalamaBulmaDizi;

import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz");
        int numbers = input.nextInt();
        int[] a= new int[numbers];
        float harmonicmean=1;
        for (float i=2;i<=a.length;i++){
            harmonicmean=harmonicmean+1/i;
        }
        System.out.println("Harmonik Ortalam:"+harmonicmean);
    }
}
/*Ödev
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

Harmonik Seri Formülü :*/