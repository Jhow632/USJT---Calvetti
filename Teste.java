import javax.swing.*;

public class Teste {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        while (true) {
            String descricao = JOptionPane.showInputDialog("Digite a descrição do item (ou 'sair' para finalizar):");
            if (descricao.equalsIgnoreCase("sair")) {
                break;
            }

            String precoStr = JOptionPane.showInputDialog("Digite o preço do item:");
            double preco = 0;
            try {
                preco = Double.parseDouble(precoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Preço inválido. Tente novamente.");
                continue;
            }

            Produto produto = new Produto(descricao, preco);
            carrinhoDeCompras.adicionaItem(produto);
        }

        JOptionPane.showMessageDialog(null, "Itens no carrinho:\n"+carrinhoDeCompras.exibeItens());



        double total = carrinhoDeCompras.calculaTotal();
        JOptionPane.showMessageDialog(null, "Total do carrinho: R$ " + total);
    }
}
