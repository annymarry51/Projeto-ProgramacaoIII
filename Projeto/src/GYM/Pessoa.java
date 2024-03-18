package GYM;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private float peso;
    private float altura;
    private char sexo;

    public Pessoa(String nome, String cpf, int idade, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 110 || idade < 0)
            System.out.println("Erro! Idade inválida");
        else {
            this.idade = idade;
            System.out.println("Idade cadastrada com sucesso!");
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' ^ sexo == 'F')
            this.sexo = sexo;
        else
            System.out.println("Sexo informado inválido");
    }
    
}
