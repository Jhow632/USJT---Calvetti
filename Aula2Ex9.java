import javax.swing.JOptionPane;
public class Aula2Ex9
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número:");
      
      //Definindo numero
      int numero = Integer.parseInt(sNumero);
      
      //Vendo se o número é multiplicado por 3 ou não e apresentando resultado
      if(numero % 3 == 0){
         JOptionPane.showMessageDialog(null, "É múltiplo de 3");
      } else {
         JOptionPane.showMessageDialog(null, "Não é múltplo de 3");
      }
    }
}