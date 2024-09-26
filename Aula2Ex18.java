import javax.swing.JOptionPane;
public class Aula2Ex18
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero1 = JOptionPane.showInputDialog
         ("Digite um número:");
      String sNumero2 = JOptionPane.showInputDialog
         ("Digite um número diferente do primeiro:");
      
      //Definindo numero
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      
      //Ordem crescente e apresentando resultado
      if(numero1 < numero2){
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero1 + "," + numero2);
      } else {
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero2 + "," + numero1);
      }
   }
}