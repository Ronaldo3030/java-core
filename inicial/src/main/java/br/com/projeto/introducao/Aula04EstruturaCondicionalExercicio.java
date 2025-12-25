package br.com.projeto.introducao;

public class Aula04EstruturaCondicionalExercicio {
    private static double FIRST_VALUE_IN_PERCENT = 35.70;
    private static double SECOND_VALUE_IN_PERCENT = 37.56;
    private static double THIRD_VALUE_IN_PERCENT = 49.50;

    public static void main(String[] args) {
//                Bracket 1	Up to € 38.883	35.70%
//                Bracket 2	€ 38.883 to € 77.320	37,56%
//                Bracket 3	€ 77.320	49,50%
    }

    public static double taxaAnualPorSalario(double salario) {
        double result = 0;
        if (salario <= 38883) {
            result = salario * (FIRST_VALUE_IN_PERCENT / 100);
        }

        if (salario > 38883 && salario <= 77320) {
            result = salario * (SECOND_VALUE_IN_PERCENT / 100);
        }

        if(salario > 77320) {
            result = salario * (THIRD_VALUE_IN_PERCENT / 100);
        }

        return result;
    }
}
