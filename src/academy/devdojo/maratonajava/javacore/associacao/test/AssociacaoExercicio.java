package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Seminario;

import java.util.ArrayList;
import java.util.Scanner;

public class AssociacaoExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Local> locais = new ArrayList<>();
        ArrayList<Seminario> seminarios = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();

        int resposta = 1;
        int index = 0;

        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Integer> idadesAlunos = new ArrayList<>();

        ArrayList<String> locaisSeminario = new ArrayList<>();
        ArrayList<String> titulosSeminario = new ArrayList<>();

        ArrayList<String> nomesProfessores = new ArrayList<>();
        ArrayList<String> especialidadesProfessores = new ArrayList<>();

        while (resposta == 1) {
            System.out.println("Digite o local do seminário: ");
            locaisSeminario.add(entrada.nextLine());

            System.out.println("Digite o titulo do seminário: ");
            titulosSeminario.add(entrada.nextLine());

            System.out.println("Digite o nome do aluno: ");
            nomesAlunos.add(entrada.nextLine());

            System.out.println("Digite a idade do aluno: ");
            idadesAlunos.add(entrada.nextInt());

            System.out.println("Digite o nome do professor: ");
            nomesProfessores.add(entrada.nextLine());

            System.out.println("Digite o nome do especialidade: ");
            especialidadesProfessores.add(entrada.nextLine());

//            seminarios.add(new Seminario(titulosSeminario.get(index), locaisSeminario.get(index), ));
//            alunos.add(new Aluno(nomesAlunos.get(index), idadesAlunos.get(index), ));

            System.out.println("Digite '1' se quiser registrar um novo seminário: ");
            resposta = entrada.nextInt();

            index++;
        }
    }
}
