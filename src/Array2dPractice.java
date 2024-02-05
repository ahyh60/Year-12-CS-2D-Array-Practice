public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int [][] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }

    // 2. sumRowN
    public static int sumRowN (int [][] array, int row){
        int sum = 0;
        for(int j = 0; j < array[row].length; j++){
            sum += array[row][j];
        }
        return sum;
    }


    // 3. sumColN
    public static int sumColN(int [][] array, int col){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i][col];
        }
        return sum;
    }

    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] array, int row1, int col1, int row2, int col2) {
        int sum = 0;
        int startRow = row1 + 1;
        int endRow = row2 - 1;

        if (row1 == row2) {
            for (int col = col1; col <= col2; col++) {
                sum += array[row1][col];
            }
            return sum;
        }

        else {
            for (int row = startRow; row <= endRow; row++) {
                for (int col = 0; col < array[0].length; col++) {
                    sum += array[row][col];
                }
            }
            for (int col = col1; col < array[0].length; col++) {
                sum += array[row1][col];
            }
            
            for (int col = 0; col <= col2; col++) {
                sum += array[row2][col];
            }

            return sum;
        }
    }

}
