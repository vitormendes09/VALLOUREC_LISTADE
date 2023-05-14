public class Ex1{
    public static void main(String[] args) {

        long fatorial = CalcularFatorial(5);
        if (fatorial == 0) {
            System.out.println("O cálculo do fatorial falhou.");
        } else {
            System.out.println("Este é o fatorial do número proposto: " + fatorial);
        }

    }



    public static long CalcularFatorial(int numero){

        if(numero < 0){

            return 0;

        } else if(numero <= 1){

            return 1; 

        } else {
            return numero * CalcularFatorial( numero -1);
        }


    }
}