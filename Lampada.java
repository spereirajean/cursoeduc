package desafios;

public class Lampada {

    //PROPRIEDADES
    int potencia;
    boolean estaLigado;

    //METODOS
    void acender() {
        estaLigado = true;
    }

    void apagar() {
        estaLigado = false;
    }

    String pegarEstado(){
        String texto = "A potência da sua lâmpada é: "+ potencia;
        if (estaLigado){
            texto = texto + " e ela está ligada";
        }else {
            texto = texto + " e ela não está ligada";
        }
        return texto;
    }


}
