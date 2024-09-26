import javax.swing.JOptionPane;
public class Aula2Ex5
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número:");
      
      //Definindo número
      int numero = Integer.parseInt(sNumero);
      
      //Apresentando resultado
      if(numero >= 20 && numero <= 90){
         JOptionPane.showMessageDialog(null, "O númeo está entre 20 e 90: " + numero);
      } else {
         JOptionPane.showMessageDialog(null, "O número não está entre 20 e 90: " + numero);
      }
    }
}