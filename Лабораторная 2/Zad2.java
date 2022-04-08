public class Zad2 {
    public static void main (String[] args) {
        int[] b = {100, -7, 4, 10, -3, -6};
        double p[] = new double[b.length];
        int i=0;
        int m = 0;
        for (int a: b) {
            if (a>0) {
                p[i] = Math.sqrt(a)/5;
                i++;
            }
            if (a>0) {
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
        i=0;
        for (double a: c) {
            double min = c[i];
            for (int g=0; g<c.length; g++) {
                if (min<c[g]) {
                    c[i] = c[g];
                    c[g] = min;
                    break;
                }
            }
            i++;
        }
        for (double a: c) {
            System.out.println(a);
        }
    }
}
