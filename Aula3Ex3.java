import javax.swing.JOptionPane;
public class Aula3Ex3
{
   public static void main(String[] Jho) 
   {
      //Lendo valores
      int soma = 0;
      int quantidade;
      
      //Lendo e definindo
      String sNumeros = JOptionPane.showInputDialog
         ("Quantos números deseja somar?");
      quantidade = Integer.parseInt(sNumeros);
      
      //Fazendo soma dos números digitados
      for(int numero = 0; numero < quantidade; numero++) {
      String sResultado = JOptionPane.showInputDialog("Digite o número: " + (numero + 1));
      int resultado = Integer.parseInt(sResultado);
      soma += resultado;
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Soma dos números: " + soma);
      }
   }
}