package aula04;

public class Aula04 {
    public static void main(String[] args) {
        //Caneta c1 = new Caneta();
        //c1.status(); // Para mostrar agora o Método Construtor
        //c1.setModelo("BIC");
        //c1.modelo = "BIC"
        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        //c1.status();
        //System.out.println("\nTenho uma caneta "+ c1.getModelo() + " de ponta " + c1.getPonta());
        System.out.println("Caneta 2");
        Caneta c2 = new Caneta("NIC", "Amarelo", 0.4f);
        c2.status();
        System.out.println("--------------");
        System.out.println("Caneta 3");
        Caneta c3 = new Caneta("FiberCastell", "Laranja", 1.5f);
        c2.status();
        System.out.println("--------------");
    }
}
