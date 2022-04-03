public class Zad4 {
    public static void main (String[] args) {
        int[][] mas = {{1, 2, 3, 4, 5},
                      {-6, 4, -6, 7, 0},
                      {10, 4, 5, 6, 1},
                      {4, -7, 3, 2, 9},
                     {-1, -2, -3, -4, -5}};
        int sum = 0;
        int j = 1;
        for (int i = 4; i > 1; i--) {
            if (mas[i][j] > 0) {
                sum=sum+mas[i][j];
            }
            j++;
        }
        System.out.println(sum);
    }
}
