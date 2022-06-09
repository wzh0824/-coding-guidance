/**
 * @author a
 */
public class Test03 {
    public static boolean find(int[][] arr, int target) {
        //特殊情况判断
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return false;
        }
        int rows = arr.length;
        int cols = arr[1].length;
        int row = 0;
        int col = cols - 1;
        //>=0时候才会把0判断算上
        while (row < rows && col >= 0) {
            if (arr[row][col] > target) {
                col--;
            } else if (arr[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]arr = {
                {1, 2, 3, 6},
                {5, 7, 9, 10},
                {6, 8, 11, 15}};
        System.out.println(find(arr, 11));
    }
}
