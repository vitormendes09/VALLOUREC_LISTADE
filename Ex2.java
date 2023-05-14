public class Ex2 {
    public static void main(String[] args) {
        System.out.println(encontrarProximoPrimo(7));
    }
    
    public static int encontrarProximoPrimo(int numero) {
        if (numero < 2) {
            return 2; // o primeiro número primo é 2
        } else {
            int proximoPrimo = numero + 1;
            while (!primo(proximoPrimo)) {
                proximoPrimo++;
            }
            return proximoPrimo;
        }
    }
    
    public static boolean primo(int numero) {
        if (numero < 2) {
            return false;
        } else {
            for (int indice = 2; indice <= Math.sqrt(numero); indice++) {
                if (numero % indice == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

