package mayınTarlası;

import java.util.Random;
import java.util.Scanner;

public class MayınTarlası {
    int rowNumber,colNumber,size;
    int[][] map;
    int[][] board;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    public MayınTarlası(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber*colNumber;
    }
    public void run() {
      prepareGame();
      print(map);

    }
    public void prepareGame() { //Rasgele mayın yerleştirme
        int randRow,randCol,count=0;

        while (count != (size/4)){
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if(map[randRow][randCol] != -1){ //-1 varsa mayın var demek
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }
    public void print(int[][] arr){ //Mayınları ekrana bastırma
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[0].length; j++){
                if (arr[i][j]>=0)
                    System.out.print(" ");
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();

        }
    }
}
