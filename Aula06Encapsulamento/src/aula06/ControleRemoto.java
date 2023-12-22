package aula06;

public class ControleRemoto implements Controlador {
    // Atributos - voltar (abstract) na classe
    private int volume;
    private boolean ligado;
    private boolean tocando;
    // Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = true;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Abstratos


    @Override // @java.lang.Override
    public void ligar() {
        System.out.println("--- Ligado -----");
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        System.out.println("\n---- Desligando -----\n");
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU ------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i=i+10) {
            System.out.print("|||||");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...\n");
    }

    @Override
    public void maisVolume() {
        if (getLigado()) {
            this.setVolume(this.getVolume() + 10);
            System.out.println("Volume " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i=i+10) {
                System.out.print("||||||");
            }
            System.out.println();
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 10);
            System.out.println("--- Apertou o menos volume -----");
            System.out.println("Volume " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i=i+10) {
                System.out.print("||||||");
            }
            System.out.println("\n");
        } else {
            System.out.println("Impossível diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0 ) {
            System.out.println("--- Apertou o mudo -----");
            this.setVolume(0);
            System.out.println("Volume " + this.getVolume());
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            System.out.println("\n--- Desligando o mudo -----\n");
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
            System.out.println("--- Apertou o PLAY -----");
            this.setVolume(50);
            System.out.println("Volume " + this.getVolume());
                for (int i = 0; i <= this.getVolume(); i=i+10) {
                    System.out.print("||||||");
                }
            System.out.println();
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            this.setVolume(0);
            System.out.println("--- Apertou o PAUSE ---- " );
            System.out.println("Volume " + this.getVolume());
            System.out.println("\n");
        } else {
            System.out.println("Não consegui pausar");
        }
    }
}
