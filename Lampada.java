package desafios;

public class Lampada {

    //PROPRIEDADES
   private int potencia;
    private boolean estaLigado;

    //construtor
    Lampada(int potencia){
        this.potencia = potencia;
    }

    //METODOS
    public void acender() {
        estaLigado = true;
    }

   public void apagar() {
        estaLigado = false;
    }

    public String pegarEstado(){
        String texto = "A potência da sua lâmpada é: "+ potencia;
        if (estaLigado){
            texto = texto + " e ela está ligada";
        }else {
            texto = texto + " e ela não está ligada";
        }
        return texto;
    }


}
