import javax.swing.JOptionPane;
public class Aula2Ex11
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número:");
      
      //Definindo numero
      int numero = Integer.parseInt(sNumero);
      
      //Vendo se o número é divisível por 3 e por 7 ou não e apresentando resultado
      if(numero % 3 == 0 && numero % 7 ==0){
         JOptionPane.showMessageDialog(null, "É divisível de 3 e 7");
      } else {
         JOptionPane.showMessageDialog(null, "Não é divisível de 3 e 7");
      }
    }
}