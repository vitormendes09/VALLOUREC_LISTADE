public class Ex4{
    public static void main(String[] args) {
        System.out.println(tipoCarreta(1000, 3290, 700));
        
    }

    public static String tipoCarreta(int qtdTubo10_3_4, int qtdTubo10, int qtdTubo5_1_2) {
        int pesoTotal = qtdTubo10_3_4*1800 + qtdTubo10*1320 + qtdTubo5_1_2*480;
        if (pesoTotal <= 6000) {
            return "Carreta T6";
        } else if (pesoTotal <= 27000) {
            return "Carreta T27";
        } else if (pesoTotal <= 31000) {
            return "Carreta T31";
        } else {
            return "Carreta T35";
        }
    } 
}
