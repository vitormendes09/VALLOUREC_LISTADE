public class Ex1{
    public static void main(String[] args) {

        System.out.println(CalcularFatorial(5));

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