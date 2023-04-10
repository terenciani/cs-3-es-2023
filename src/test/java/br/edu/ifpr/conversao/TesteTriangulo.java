package br.edu.ifpr.conversao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteTriangulo {

    @Test
    public void testaTrianguloInvalido(){
        assertEquals("Invalido", Triangulo.qualTriangulo(10, 5, 25));
        assertEquals("Invalido", Triangulo.qualTriangulo(5, 10, 25));
        assertEquals("Invalido", Triangulo.qualTriangulo(25, 10, 5));
    }

    @Test
    public void testaTrianguloEquilatero(){
        assertEquals("Valido-Equilatero", Triangulo.qualTriangulo(10, 10, 10));
    }

    @Test
    public void testaTrianguloEscaleno() {
        assertEquals("Valido-Escaleno", Triangulo.qualTriangulo(3, 4, 5));
    }

    @Test
    public void testaTrianguloIsosceles() {
        assertEquals("Valido-Isosceles", Triangulo.qualTriangulo(4, 3, 3));
        assertEquals("Valido-Isosceles", Triangulo.qualTriangulo(3, 3, 4));
        assertEquals("Valido-Isosceles", Triangulo.qualTriangulo(3, 4, 3));
    }

    @Test
    public void testaTrianguloZero() {
        assertEquals("Invalido", Triangulo.qualTriangulo(0, 3, 3));
        assertEquals("Invalido", Triangulo.qualTriangulo(3, 0, 4));
        assertEquals("Invalido", Triangulo.qualTriangulo(3, 4, 0));
        assertEquals("Invalido", Triangulo.qualTriangulo(0, 0, 0));
    }
    
    @Test
    public void testaTrianguloNumerosNegativos() {
        assertEquals("Invalido", Triangulo.qualTriangulo(4, 3, -3));
        assertEquals("Invalido", Triangulo.qualTriangulo(3, -3, 4));
        assertEquals("Invalido", Triangulo.qualTriangulo(-3, 4, 3));
    }
}
