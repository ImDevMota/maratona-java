package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        calculadora.multiplicaDoisNumeros(31, 2);


        System.out.println(calculadora.divideDoisNumeros(20,22));

        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro do CalculadoraTest: ");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);

        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
