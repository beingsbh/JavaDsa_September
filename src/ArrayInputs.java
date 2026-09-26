import java.util.Scanner;

public class ArrayInputs {
    static void main(String[] args) {
        int [] arr = new int[4];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n;i++ ){
            System.out.println("Enter input for index no "+  i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array content is ");
        for(int val : arr){

            System.out.print( val+" ");
        }
    }
}
