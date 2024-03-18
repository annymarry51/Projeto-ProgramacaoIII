package GYM;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<String> exerciciosPrescritos;
    private List<Date> frequencia;


    public Aluno(String nome, String cpf, int idade, char sexo) {
        super(nome, cpf, idade, sexo);
        this.exerciciosPrescritos = new ArrayList<>();
        this.frequencia = new ArrayList<>();
    }

    public List<Date> getFrequencia() {
        return frequencia;
    }

    public void adicionarFrequencia(Date data) {
        this.frequencia.add(data);
    }

    public List<String> getExerciciosPrescritos() {
        return exerciciosPrescritos;
    }

    public void setExerciciosPrescritos(List<String> exerciciosPrescritos) {
        this.exerciciosPrescritos = exerciciosPrescritos;
    }

    public void adicionarExercicioPrescrito(String exercicio) {
        this.exerciciosPrescritos.add(exercicio);
    }

    public void limparExerciciosPrescritos() {
        this.exerciciosPrescritos.clear();
    }
}
