package Numeros1a100;

public class Bin_Go {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String resultado = "";
            if (i % 3 == 0) {
                resultado += "Bin";
            }
            if (i % 5 == 0) {
                resultado += "Go";
            }
            if(i % 3 != 0 && i % 5 != 0) {
                resultado = "";
            }
            System.out.println(i + " / " + resultado);
        }
    }
}
