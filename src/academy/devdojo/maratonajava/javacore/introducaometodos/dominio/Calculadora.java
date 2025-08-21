package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21-3);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1*num2);
    }

    public int divideDoisNumeros(double num1, double num2) {
        if(num2 == 0) {
            return 0;
        }
        return (int) (num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois números");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma+= num;
        }
        System.out.println(soma);
    }
}
