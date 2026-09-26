public class Sum2Darray {
    static void main(String[] args) {
        int [][] matrix = {{10,20},{30,410},{50,60}};
        //int sum = 1;
        //int max =  matrix[0][0];
        int min =  matrix[0][0];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                //sum *=matrix[i][j];
//                if(max<matrix[i][j]){
//                    max=matrix[i][j];
                if(min>matrix[i][j]){
                  min=matrix[i][j];
//                }
            }

        }

    }
        System.out.println(min);
}}
