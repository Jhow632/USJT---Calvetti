import javax.swing.JOptionPane;
public class Aula2Ex12
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número:");
      
      //Definindo numero
      int numero = Integer.parseInt(sNumero);
      
      //Vendo se o número é divisível por 10, 5 ou 2 e apresentando resultado
      if(numero % 10 ==0){
         JOptionPane.showMessageDialog(null, "É divisível de 10");
      } else if(numero % 5 ==0){
         JOptionPane.showMessageDialog(null, "É divisível de 5");
      } else if(numero % 2 ==0){
         JOptionPane.showMessageDialog(null, "É divisível de 2");
      } else {
         JOptionPane.showMessageDialog(null, "Não é divisível por 10, 5 e 2");
      }
   }
}