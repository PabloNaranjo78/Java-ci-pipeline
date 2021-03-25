import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void sumaTest1(){
        int resultado = Calculadora.sumar(10,20);
        int esperado = 30;
        assertEquals(esperado,resultado);
    }

    @Test
    public void sumarTest2(){
        int resultado = Calculadora.sumar(20,5);
        int esperado = 25;
        assertEquals(esperado,resultado);
    }
    @Test
    public void restarTest1(){
        int resultado = Calculadora.restar(30,5);
        int esperado = 25;
        assertEquals(esperado,resultado);
    }
    @Test
    public void restarTest2(){
        int resultado = Calculadora.restar(20,5);
        int esperado = 15;
        assertEquals(esperado,resultado);
    }
    @Test
    public void divTest1(){
        int resultado = Calculadora.div(20,5);
        int esperado = 4;
        assertEquals(esperado,resultado);
    }
    @Test
    public void divTest2(){
        int resultado = Calculadora.div(100,2);
        int esperado = 50;
        assertEquals(esperado,resultado);
    }
    @Test
    public void multTest1(){
        int resultado = Calculadora.mult(9,3);
        int esperado = 27;
        assertEquals(esperado,resultado);
    }
    @Test
    public void multTest2(){
        int resultado = Calculadora.mult(10,10);
        int esperado = 100;
        assertEquals(esperado,resultado);
    }


}