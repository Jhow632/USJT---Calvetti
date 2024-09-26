import javax.swing.JOptionPane;
public class Aula2Ex10
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número:");
      
      //Definindo numero
      int numero = Integer.parseInt(sNumero);
      
      //Vendo se o número é divisível por 5 ou não e apresentando resultado
      if(numero % 5 == 0){
         JOptionPane.showMessageDialog(null, "É divisível de 5");
      } else {
         JOptionPane.showMessageDialog(null, "Não é divisível de 5");
      }
    }
}