package aula011;

public class Tecnico extends Aluno {
    public int registroProfissional;

    public void praticar() {
        System.out.println("Técnico praticando...");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome()  + " é técnico! Pagamento reduzido!");
    }

    @Override
    public String toString() {
        return "Dados { " +
                "\n  registro Profissional = " + registroProfissional +
                "\n  nome = " + nome +
                "\n  idade = " + idade +
                "\n  sexo = " + sexo + "  " +
                '}';
    }
}
