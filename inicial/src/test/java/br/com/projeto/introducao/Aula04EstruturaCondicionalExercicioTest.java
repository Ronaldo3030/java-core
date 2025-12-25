package br.com.projeto.introducao;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import br.com.projeto.introducao.utils.Format;
import org.junit.Test;

public class Aula04EstruturaCondicionalExercicioTest {
//                Bracket 1	Up to € 38.883	35.70%
//                Bracket 2	€ 38.883 to € 77.320	37,56%
//                Bracket 3	€ 77.320	49,50%

    @Test
    public void deveAplicarPrimeiraTaxaQuandoSalarioForMenorQue38883(){
        double salarioAnual = 28000.321;
        double result = Aula04EstruturaCondicionalExercicio.taxaAnualPorSalario(salarioAnual);

        assertThat(Format.formataNumero(result, 2), is("9996.11"));
    }

    @Test
    public void deveAplicarPrimeiraTaxaQuandoSalarioForExatamente38883(){
        double salarioAnual = 38883;
        double result = Aula04EstruturaCondicionalExercicio.taxaAnualPorSalario(salarioAnual);

        assertThat(Format.formataNumero(result, 2), is("13881.23"));
    }
}
