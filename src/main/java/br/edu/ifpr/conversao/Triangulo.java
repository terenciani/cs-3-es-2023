package br.edu.ifpr.conversao;

public class Triangulo {

    public static String qualTriangulo(int a, int b, int c) {
        if( a <= 0 || b <= 0 || c <= 0)
            return "Invalido";
        else if( (b + a) < c || (b + c) < a || (a + c) < b )
            return "Invalido";
        else if (a == c && c == b)
            return "Valido-Equilatero";
        else if (a != b && a != c && b != c)
            return "Valido-Escaleno";
        return "Valido-Isosceles";
    }

}
