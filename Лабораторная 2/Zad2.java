//Дан массив b(n). Переписать в массив C(n) корни квадратные из положительных элементов массива b(n) делённые на 5 (со сжатием, без пустых элементов внутри). Затем упорядочить методом "выбора и перестановки" новый массив.

public class Zad2 {
    public static void main (String[] args) {
        int[] b = {100, -7, 4, 10, -3, -6};
        double p[] = new double[b.length];
        int i=0;
        for (int a: b) {
            if (a>0) {
                p[i] = Math.sqrt(a)/5;
                i++;
            }
        }
        i=0;
        int m=0;
        for (double a: p) {
            double min = p[i];
            for (int g=0; g<p.length; g++) {
                if (min<p[g]) {
                    p[i] = p[g];
                    p[g] = min;
                    break;
                }
            }
            i++;
            if (a!=0.0) {
                m++;
            }
        }
        i=0;
        double c[] = new double[m];
        for (double a: p) {
            if (a>0) {
                c[i]=a;
                i++;
            }
        }
        for (double a: c) {
            System.out.println(a);
        }
    }
}
