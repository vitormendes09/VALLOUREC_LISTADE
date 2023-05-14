public class Ex3 {
    public class Exemplo {

        public static void main(String[] args) {
            int[] x = {-1, 10, 8};
            int[] y = {3, 6, 15};
            int[] z = combinarListas(x, y);
        }

    }

    public static int[] combinarListas(int[] x, int[] y) {
        int[] z = new int[x.length + y.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < x.length && j < y.length) {
            if (x[i] <= y[j]) {
                z[k] = x[i];
                i++;
            } else {
                z[k] = y[j];
                j++;
            }
            k++;
        }
        
        while (i < x.length) {
            z[k] = x[i];
            i++;
            k++;
        }
        
        while (j < y.length) {
            z[k] = y[j];
            j++;
            k++;
        }
        
        return z;
    }
    
    
}
