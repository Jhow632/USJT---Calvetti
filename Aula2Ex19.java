import javax.swing.JOptionPane;
public class Aula2Ex19
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero1 = JOptionPane.showInputDialog
         ("Digite um número:");
      String sNumero2 = JOptionPane.showInputDialog
         ("Digite um número diferente do primeiro:");
      
      //Definindo números
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      
      //Ordem decrescente e apresentando resultado
      if(numero1 > numero2){
         JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + numero1 + "," + numero2);
      } else {
         JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + numero2 + "," + numero1);
      }
   }
}