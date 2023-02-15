package desafios;

import desafios.Lampada;

public class ProjetoTesteLampada {
    public static void main(String[] args) {

        Lampada phillips = new Lampada();

        phillips.potencia = 15;
        phillips.estaLigado = false;

        phillips.acender();
        System.out.println(phillips.pegarEstado());

        phillips.potencia = 30;
        phillips.apagar();
        System.out.println(phillips.pegarEstado());




    }
}
