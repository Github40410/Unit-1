//Определить матрицу(двумерный массив) и её заполнить случайными значениями. Построить вектор B который возвращает количество положительных элементов в каждом столбце матрицы.

import java.util.*;
public class Zad3 {
    public static void main (String[] args) {
        int[][] mas = { {1, 2, 3, 4, 5}, {-6, 4, -6, 7, 0}, {10, 4, 5, 6, 1},
                {4, -7, 3, 2, 9}, {-1, -2, -3, -4, -5}};
        Vector v = new Vector(5);
        for (int j = 0; j < 5; j++) {
            int kol = 0;
            for (int i = 0; i < 5; i++) {
                if (mas[i][j]>0) {
                    kol++;
                }
            }
            v.add(j, kol);
        }
        for(int i = 0; i < 5; i++)
            System.out.print(v.get(i) + " ");
    }
}
