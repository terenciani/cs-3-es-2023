package br.edu.ifpr.conversao;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TesteNumerosImpares {
    @Test
    public void testaInicioValido(){
        Impares impares = new Impares();
        
        int[] retorno = impares.seisNumerosImpares(8);

        int [] esperado = {9, 11, 13, 15, 17, 19};

        assertArrayEquals(esperado, retorno);
    }
}
