package Trabalho;

public class ContaCorrente {
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(int n,int d, Agencia a, double s){
        this.numero = n;
        this.digito = d;
        this.agencia = a;
        this.saldo = s;
    }

    public void  Depositar(double deposito){
        deposito += saldo;
        System.out.println("Deposito realizado com sucesso");
    }

    public void Sacar(double saque){
        if (saldo > 0) {
            System.out.println("Saldo menor que zero");
        }
        else{
            saque -= saldo;
            System.out.println("Saque realizado com sucesso");
        }  
    }

    public void VerSaldo(){
       System.out.println(saldo);
    }

    public void ConsultarDados(){
        System.out.println("Numero: " + numero);
        System.out.println("Digito: " + digito);
        System.out.println("Agencia: " + agencia.getNumero());
        System.out.println("Saldo: " + saldo);
    }

    public int CalcularDigito(int n){
        int n4 = n % 10;
        int multi4 = n4 * 2 ;

        int n3 = n / 10;
        int numero3 = n3 % 10;
        int multi3 = numero3 * 8;

        int n2 = n / 100;
        int numero2 = n2 % 10;
        int multi2 = numero2 * 6;

        int n1 = n / 1000;
        int numero1 = n1 % 10;
        int multi1 = numero1 * 4;

        int soma = multi1 + multi2 + multi3 + multi4;
        int resultado = soma % 11;

        return resultado;
    }


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getDigito() {
        return digito;
    }
    public void setDigito(int digito) {
        this.digito = digito;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}