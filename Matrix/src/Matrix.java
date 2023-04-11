
public class Matrix
{
     public static int[][] MatrixY(int[][] matrix1, int[][] matrix2)  {
         int[][]matrix3 = new int [matrix1.length][matrix2[0].length];
         for (int i = 0; i < matrix3[0].length; i++)
             for (int j = 0; j < matrix3.length; j++)
                 for (int k = 0; k < matrix1[0].length; k++)
                     matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix1[k][j];
         return matrix3;
     }
     public static int[][] MatrixS(int[][] matrix1, int[][] matrix2){
          int[][]matrix3 = new int [matrix1.length][matrix2[0].length];
          for (int i = 0; i<matrix3[0].length; i++)
              for (int j=0; j<matrix3.length; j++)
                      matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
          return matrix3;
     }

     public static int[][] MatrixNumber(int[][] matrix1, int number){
        int[][]matrix3 = new int [matrix1.length][matrix1.length];
        for (int i = 0; i<matrix3[0].length; i++)
            for (int j=0; j<matrix3.length; j++)
                    matrix3[i][j] = matrix1[i][j] * number;
        return matrix3;
     }

      public static void MatrixVivod(int[][] matrix3){

         for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                System.out.print(" " + matrix3[i][j] + " ");
            }
            System.out.println();
        }
     }
}

