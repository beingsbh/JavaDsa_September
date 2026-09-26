public class HoloTriangle {
    static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<= n;row++){
            if (row == 1 || row == 2 || row== n){
                for(int j = 1 ; j<= row ; j++){
                    System.out.print("* ");
                }
            }else {
                System.out.print("* ");
                for(int col = 1; col <= row -2;col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}
