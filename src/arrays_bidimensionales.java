public class arrays_bidimensionales {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 15, 20, 30, 40},
            {20, 30, 40, 50, 60},
            {30, 40, 50, 60, 30},
            {30, 40, 50, 60, 90}
        };


        /*for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            */
        for (int[] fila: matrix) {
            System.out.println();
            for (int z: fila) {
                System.out.print(z + " ");
            }
        }
    }
}
