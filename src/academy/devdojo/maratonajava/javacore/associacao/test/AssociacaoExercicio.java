package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Seminario;

import java.util.ArrayList;
import java.util.Scanner;

public class AssociacaoExercicio {
    public static void main(String[] args) {
        Local local = new Local("Rua das cerejeiras");
        Aluno aluno = new Aluno("Ichigo", 17);
        Professor professor = new Professor("Urahara", "Shinigami");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Encontrar Rukia", local);

        Seminario[] seminariosDisponíveis = {seminario};

        professor.setSeminarios(seminariosDisponíveis);

        professor.imprime();
    }
}
