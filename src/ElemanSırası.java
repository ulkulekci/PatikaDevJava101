import java.util.Arrays;
import java.util.Scanner;

public class ElemanSırası {
    public static void main(String[] args) {
        int startIndex=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dizinin boyutunu giriniz: ");
        int dimension = input.nextInt();
        int[] element =new int[dimension];
        int[] order=new int[dimension];
        System.out.println("Lütfen dizinin elemanlarını giriniz: ");
        for (int i=0;i<dimension;i++){
            System.out.print(i+1+". elemanı: ");
        element[i]= input.nextInt();
        }
        for (int j=0;j<dimension;j++){
            order[startIndex++]=element[j];
        }
        Arrays.sort(order);
        System.out.println("Sıralama: " + Arrays.toString(order));
    }
        }



