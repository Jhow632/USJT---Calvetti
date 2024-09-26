import javax.swing.JOptionPane;
public class Aula2Ex6
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número:");
      
      //Definindo número
      int numero = Integer.parseInt(sNumero);
      
      //Apresentando resultado
      if (numero > 20){
       JOptionPane.showMessageDialog(null, "O número: " + numero + " " + "é maior que 20 ");
      }
      else if (numero == 20){
       JOptionPane.showMessageDialog(null, "O número: " + numero + " " + "é igual ao 20 ");
      } else {
       JOptionPane.showMessageDialog(null, "O número: " + numero + " " + "é menor que 20 ");
      }
   }
}
      