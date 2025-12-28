package br.com.projeto.introducao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

@RunWith(Parameterized.class)
public class Aula04EstruturaCondicionalExercicioTest {

    private static final double MARGEM_ERRO = 0.01;

    @Parameterized.Parameters(name = "Salário {0} deve ter taxa {1}")
    public static Collection<Object[]> parametrosDeTeste() {
        return Arrays.asList(new Object[][]{
                {28000.32, 9996.11},   // Primeira faixa
                {38883.0, 13881.23},   // Limite primeira faixa
                {55000.0, 20658.00},   // Segunda faixa
                {77320.0, 29041.39},   // Limite segunda faixa
                {98346.0, 48681.27}    // Terceira faixa
        });
    }

    @Parameterized.Parameter(0)
    public double salarioAnual;

    @Parameterized.Parameter(1)
    public double taxaEsperada;

    @Test
    public void deveCalcularTaxaAnualCorretamente() {
        double taxaCalculada = Aula04EstruturaCondicionalExercicio
                .taxaAnualPorSalario(salarioAnual);

        assertThat(taxaCalculada, closeTo(taxaEsperada, MARGEM_ERRO));
    }
}