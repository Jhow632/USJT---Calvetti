public class CartaoDeCredito extends Pagamento {
    private String numeroDoCartao;
    //Construtor
    public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCartao = numeroDoCartao;   
    }
    //Método de acesoo
    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }
    //Método modificador
    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
}

