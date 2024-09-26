import javax.swing.JOptionPane;
public class Aula2Ex17
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
      
      //Mostrando número memor
      if(numero1 < numero2){
         JOptionPane.showMessageDialog(null, "O menor número é: " + numero1);
      } else {
         JOptionPane.showMessageDialog(null, "O menor número é: " + numero2);
      }
   }
}