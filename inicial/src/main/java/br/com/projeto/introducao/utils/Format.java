package br.com.projeto.introducao.utils;

import java.util.Locale;

public class Format {
    public static String formataNumero(double numero, int quantidadeDeCasas) {
        return String.format(Locale.US, "%." + quantidadeDeCasas + "f", numero);
    }
}
