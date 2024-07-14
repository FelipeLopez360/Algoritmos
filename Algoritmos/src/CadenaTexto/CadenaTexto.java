package CadenaTexto;

import java.util.Scanner;

public class CadenaTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese una cadena de texto:");
        String texto = scanner.nextLine();

        String[] palabras = texto.split(" ");
        String textoInvertido = "";

        for (int i = palabras.length - 1; i >= 0; i--) {
            textoInvertido += palabras[i] + " ";
        }

        // Elimina el último espacio
        textoInvertido = textoInvertido.trim();

        System.out.println("La cadena invertida es: " + textoInvertido);
    }
}