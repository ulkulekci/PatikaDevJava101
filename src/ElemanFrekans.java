import java.util.Arrays;

public class ElemanFrekans {

    public static void main(String[] args) {
        int[] arr = {10,20,20,10,10,20,5,20};
        Arrays.sort(arr); //sayıları küçükten büyüğe sıraladık

        int counter = 0; //kaç kere tekrar etti
        int list = arr[0]; //yeni bir diziye atadık

        System.out.println("Tekrar sayıları");
        for(int i=0;i<arr.length;i++){
            if(i==0 || list!=arr[i]){
                for (int k : arr) {
                    if (k == arr[i]) {
                        counter++;
                        list = arr[i];
                    }
                }
                System.out.println(arr[i]+" sayısı "+counter+" kere tekrar edildi!");
                counter = 0;
            }
        }

    }
}
