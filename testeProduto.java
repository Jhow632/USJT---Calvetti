import javax.swing.JOptionPane;
public class testeProduto {
   public static void main(String[] jho) {
      //Dados Produto
      String nome = JOptionPane.showInputDialog("Nome:");
      Double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço:"));
      int quantidade= Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
      // cria um objeto produto
      produto produto = new produto(nome, preco, quantidade);
      String msg = "Nome: " + produto.getNome() + "\nPreço: "
       + produto.getPreco() + "\nQuantidade: " + produto.getQuantidade();
      //Mostrando Produto
      JOptionPane.showMessageDialog(null, msg);
      //Altrerando informações
      quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
      preco = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));
      //Muda usando os métodos modificadores
      produto.setQuantidade(quantidade);
      produto.setPreco(preco);
      //Montando string de saida chamando os metodos de acesso do Produto
      msg = "Nome: " + produto.getNome() + "\nPreço: "
      + produto.getPreco() + "\nQuantidade: " + produto.getQuantidade();
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, msg);
   }
}

