package aula06;

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.menosVolume();
        c.menosVolume();
        c.pause();
        c.play();
        c.desligar();
    }
}
