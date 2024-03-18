package GYM;

import java.util.List;
import java.util.ArrayList;

public class Instrutor extends Funcionario {

    public Instrutor(String nome, String cpf, int idade, char sexo, float salario) {
        super(nome, cpf, idade, sexo, salario);
    }

    void prescreverTreino(Aluno aluno) {
        // Supondo que a classe Aluno tenha atributos como idade, sexo, etc.
        int idade = aluno.getIdade();
        char sexo = aluno.getSexo();

        // Supondo que o treino seja prescrito com base na idade e no sexo do aluno
        List<String> exercicios = new ArrayList<>();

        // Lógica para prescrição de treino
        if (idade <= 30) {
            exercicios.add("Levantamento de peso");
            exercicios.add("Corrida");
        } else {
            exercicios.add("Caminhada");
            exercicios.add("Alongamento");
        }

        // Supondo que a classe Aluno tenha um método para definir os exercícios prescritos
        aluno.setExerciciosPrescritos(exercicios);

        System.out.println("Treino prescrito para o aluno: " + aluno.getNome());
    }
    String gerarFichaDeTreino(Aluno aluno) {
        StringBuilder ficha = new StringBuilder();
        ficha.append("FICHA DE TREINO PARA: ").append(aluno.getNome()).append("\n\n");

        // Obtém os exercícios prescritos para o aluno
        List<String> exercicios = aluno.getExerciciosPrescritos();

        if (exercicios.isEmpty()) {
            ficha.append("Nenhum exercício prescrito ainda.\n");
        } else {
            ficha.append("EXERCÍCIOS PRESCRITOS:\n");
            for (String exercicio : exercicios) {
                ficha.append("- ").append(exercicio).append("\n");
            }
        }

        return ficha.toString();
    }
}
