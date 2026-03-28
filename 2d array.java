public class TwoDArrayProgram {
    
    public static void main(String[] args) {
        // 1. Declare and initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // 2. Access elements
        System.out.println("\nElement at [1][2]: " + matrix[1][2]);
        
        // 3. Sum all elements
        System.out.println("Sum of all elements: " + sumMatrix(matrix));
        
        // 4. Find maximum
        System.out.println("Maximum element: " + findMax(matrix));
        
        // 5. Transpose the matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose(matrix));
        
        // 6. Another way to create and fill 2D array
        int[][] array2D = new int[3][3];
        fillMatrix(array2D);
        System.out.println("\nFilled Matrix:");
        printMatrix(array2D);
        
        // 7. Iterate using different methods
        System.out.println("\nUsing for-each loop:");
        forEachLoop(matrix);
        
        // 8. Calculate row sums
        System.out.println("\nSum of each row:");
        rowSums(matrix);
    }
    
    // Print 2D array
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Sum all elements
    static int sumMatrix(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
    // Find maximum element
    static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    
    // Transpose matrix
    static int[][] transpose(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] result = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }
    
    // Fill matrix with sequential values
    static void fillMatrix(int[][] arr) {
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
            }
        }
    }
    
    // For-each loop iteration
    static void forEachLoop(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    // Calculate sum of each row
    static void rowSums(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row " + i + ": " + sum);
        }
    }
}