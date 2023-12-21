package aula05;

public class Aula05 {
    public static void main(String[] args) {
        // abrir a conta do Jubileu
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        // abrir a conta da Creusa
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");

        // depositar dinheiro nas contas
        p1.depositar(100);
        p2.depositar(500);

        //Creusa saca R$ 100
        p2.sacar(100);

        // Jubileu fecha conta
        p1.sacar(150);
        p1.fecharConta();

        // Creusa paga mensalidade
        p2.pagarMensal();
        p2.pagarMensal();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
