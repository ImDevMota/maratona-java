package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.Nome = "Corvette";
        carro01.Modelo = "C3 Stingray";
        carro01.ano = 1971;

        carro02.Nome = "Mustang";
        carro02.Modelo = "GT 500";
        carro02.ano = 2020;

        System.out.println("Carro 1:");
        System.out.println(carro01.Nome);
        System.out.println(carro01.Modelo);
        System.out.println(carro01.ano);

        System.out.println("\nCarro 2:");
        System.out.println(carro02.Nome);
        System.out.println(carro02.Modelo);
        System.out.println(carro02.ano);
    }
}
