import javax.swing.JOptionPane;
public class Aula3Ex24
{
   public static void main(String[] Jho) 
   {  
      //Definindo dados
      double preco;
      int quantidade;
      double total = 0;

      //Repetindo mercadorias e lendo preço válido
      do {
      do {
          preco = Double.parseDouble(JOptionPane.showInputDialog
            ("Digite o preço da mercadoria (positivo):"));
          if(preco < 0) {
             JOptionPane.showMessageDialog(null, "O preço deve ser positivo. Digite novamente.");
             }
          } while(preco < 0);

            //Lendo quantidade válida
            do {
               quantidade = Integer.parseInt(JOptionPane.showInputDialog
                 ("Digite a quantidade de itens (para finalizar digite 0):"));
               if(quantidade < 0) {
                  JOptionPane.showMessageDialog(null, "A quantidade não pode ser negativa. Digite novamente.");
               }
            } while(quantidade < 0); 

            //Calculando valor total a ser pago
            if(quantidade > 0) {
               total += preco * quantidade;
            }

        } while(quantidade != 0);  

        //Apresentando resultado
        JOptionPane.showMessageDialog(null, "O total a ser pago é: R$ " + String.format("%.2f", total));
    }
}
