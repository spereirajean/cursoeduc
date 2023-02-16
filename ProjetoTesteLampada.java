package desafios;

import desafios.Lampada;

public class ProjetoTesteLampada {
    public static void main(String[] args) {

        Lampada phillips = new Lampada(25);
        Lampada ge = new Lampada(15);


        phillips.acender();
        System.out.println(phillips.pegarEstado());
        System.out.println(ge.pegarEstado());






    }
}
