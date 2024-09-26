import javax.swing.JOptionPane;
public class Aula2Ex8
{
   public static void main(String[] jho)
   {
      //Lendo números
      String sNumero1 = JOptionPane.showInputDialog
         ("Digite úm número:" );
      String sNumero2 = JOptionPane.showInputDialog
         ("Digite úm número diferente do primeiro:" );
      
      //Definindo números
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      
      //Apresentando resultado
      if (numero1 > numero2){
          JOptionPane.showMessageDialog(null, "O número maior é: " + " " + numero1);
      }  else {
          JOptionPane.showMessageDialog(null, "O número maior é: " + " " + numero2); 
      }
   }
}

      