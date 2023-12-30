package aula011;

public class Aula011 {
    public static void main(String[] args) {
        // Programa Principal
        // Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        System.out.println("\n-- Aluno -----------------------------");
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        System.out.println("\n-- Bolsista ------------------------------");
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        System.out.println("\n-- Técnico ------------------------------");
        Tecnico t1 = new Tecnico();
        t1.setNome("Clovis");
        t1.setRegistroProfissional(35400);
        t1.setMatricula(1115);
        t1.setCurso("Eletrônica");
        t1.setIdade(37);
        t1.setSexo("M");
        t1.pagarMensalidade();
        System.out.println(t1.toString());
    }

}
