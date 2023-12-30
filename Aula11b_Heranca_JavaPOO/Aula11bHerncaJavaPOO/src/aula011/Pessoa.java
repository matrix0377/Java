package aula011;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public void fazerAniversario() {
        this.idade ++;

    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public java.lang.String getSexo() {
        return sexo;
    }

    public void setSexo(java.lang.String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados { " +
                "nome=" + nome +
                ", idade=" + idade +
                ", sexo=" + sexo + " " +
                '}';
    }
}
