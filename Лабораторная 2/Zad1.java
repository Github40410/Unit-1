//Данн массив b(n). Переписать в массив C(n) положительные элементы массива b(n) умноженные на 5.(сжатие массива)

public class Zad1 {
    public static void main (String[] args) {
        int[] b = {1, 4, -5, 50, 3, -6};
        int c[] = new int [b.length];
        int i=-1;
        for (int a: b) {
            if (a>0) {
                i++;
                c[i] = a*5;
            }
        }
        for (int v: c) {
            System.out.println(v);
        }
    }
}
