import javax.swing.JOptionPane;
public class Aula2Ex16
{
   public static void main(String[] jho)
   {
      //Lendo números
      String sNumero1 = JOptionPane.showInputDialog
         ("Digite úm número:" );
      String sNumero2 = JOptionPane.showInputDialog
         ("Digite úm número:" );
      
      //Definindo números
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      
      //Vendo se são iguais ou diferentes 
      if(numero1 == numero2) {
         JOptionPane.showMessageDialog(null, "Os números são iguais");
      } else {
         JOptionPane.showMessageDialog(null, "Os número são diferentes");
      }
   }
}
      