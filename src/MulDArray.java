import java.util.Scanner;

public class MulDArray {
    static void main(String[] args) {
        int [][] arr = new int [3][4];
        Scanner sc = new Scanner(System.in);


        for(int i=0;i<arr.length;i++){
            for(int  j = 0;j<arr[i].length;j++){
                System.out.println("Enter values of "+i+" "+j);
                arr[i][j] = sc.nextInt();

            }
        }


        for(int [] rowOut : arr){
           for(int  colOut:rowOut){
               System.out.print(colOut+ " ");
           }
            System.out.println();
        }

        }
}
