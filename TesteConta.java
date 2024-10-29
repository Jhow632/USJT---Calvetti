public class TesteConta {
    public static void main(String[] jho) {
        Pagamento pagamento = new Pagamento(null, null, 0);
        System.out.println(pagamento.toString());
        Cheque cheque = new Cheque(null, null, 0, null);
        System.out.println(cheque.toString());
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(null, null, 0, null);
        System.out.println(cartaoDeCredito.toString());
        Boleto boleto = new Boleto(null, null, 0, null, 0, 0, 0);
        System.out.println(boleto.toString());
    }
}
