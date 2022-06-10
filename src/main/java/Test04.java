/**
 * @description: https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 * @author a
 */
public class Test04 {
    public static boolean find(int[][] matrix, int target) {
        //特殊情况判断
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1;
        //>=0时候才会把0判断算上
        while (row < rows && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]matrix = {
                {1, 2, 3, 6},
                {5, 7, 9, 10},
                {6, 8, 11, 15}};
        System.out.println(find(matrix, -5));
    }
}
