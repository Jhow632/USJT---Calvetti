public class CondicionadorDeAr{
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr(){
        this.termostato = new Termostato();
        this.ligado = false;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void aumentarTemperatura(){
        if(this.ligado = true){
            if(this.termostato.getTemperatura() < 28){
                this.termostato.setTemperatura(this.termostato.getTemperatura() + 1);
            }
            else{
                System.out.println("A temperatura não pode ser maior que 28 graus.");
            }
        }
        else{
            System.out.println("O condicionador de ar está desligado.");
        }
    }

    public void diminuirTemperatura(){
        if(this.ligado = true){
            if(this.termostato.getTemperatura() > 15){
                this.termostato.setTemperatura(this.termostato.getTemperatura() - 1);
            }
            else{
                System.out.println("A temperatura não pode ser menor que 15 graus.");
            }
        }
        else{
            System.out.println("O condicionador de ar está desligado.");
        }
    }

    public void mostrarTemperatura(){
        if(this.ligado = false){
            System.out.println("O condicionador de ar está desligado.");
        }
        else{
            System.out.println("A temperatura atual é: " + this.termostato.getTemperatura());
        }
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public boolean getLigado() {
        return ligado;
    }
}