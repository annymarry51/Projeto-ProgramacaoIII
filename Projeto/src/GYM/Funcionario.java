package GYM;

import java.time.LocalTime;

public class Funcionario extends Pessoa {
    private float salario;
    private LocalTime horarioEntrada;
    private LocalTime horarioSaida;

    public Funcionario(String nome, String cpf, int idade, char sexo, float salario) {
        super(nome, cpf, idade, sexo);
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setHorarioEntrada(LocalTime horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public void setHorarioSaida(LocalTime horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public void baterPonto(LocalTime horario) {
        if (horario.isBefore(LocalTime.of(12, 0))) {
            setHorarioEntrada(horario);
            System.out.println("Ponto de entrada registrado às " + horario);
        } else {
            setHorarioSaida(horario);
            System.out.println("Ponto de saída registrado às " + horario);
        }
    }
}
