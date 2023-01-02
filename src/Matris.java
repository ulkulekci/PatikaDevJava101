import java.util.Arrays;
import java.util.Scanner;

public class Matris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısını girin:");
        int line = input.nextInt();
        System.out.println("sütün sayısını girin:");
        int column = input.nextInt();
        int[][] a = new int[line][column];
        System.out.println("Matris değerlerini girin:");
        for (int i = 0; i<a.length; i++){
            for (int j=0;j<a.length;j++){
                System.out.print("["+i+"]");
                System.out.println("["+j+"]"+":");
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Matris:");
        for (int i = 0; i < line; i++) {
            System.out.println("");
            for (int j = 0; j < column; j++) {
                System.out.print(a[i][j] + " ");
            }}
        System.out.println(" ");
        System.out.println("Transpoze:");
        for (int j = 0; j < line; j++) {
            System.out.println("");
            for (int i = 0; i < column; i++) {
                System.out.print(a[i][j] + " ");
            }}
    }
}
