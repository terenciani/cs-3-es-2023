package br.edu.ifpr.conversao;

public class Impares {

    public int[] seisNumerosImpares(int inicio) {
        int[] impares = new int[6];

        for(int i = 0; i < 6; ){
            if(inicio % 2 != 0){
                impares[i] = inicio;
                i++;
            }
            inicio++;
        }
        return impares;
    }

}
