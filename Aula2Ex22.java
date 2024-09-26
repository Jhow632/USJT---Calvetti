import javax.swing.JOptionPane;
public class Aula2Ex22
{
   public static void main(String[] jho)
   {
      //Lendo números
      String sNumero1 = JOptionPane.showInputDialog
         ("Digite úm número:" );
      String sNumero2 = JOptionPane.showInputDialog
         ("Digite úm número:" );
      String sNumero3 = JOptionPane.showInputDialog
         ("Digite úm número:" );
      
      //Definindo números e variável
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      int numero3 = Integer.parseInt(sNumero3);
      int maior; 
      
      //Vendo qual número é o maior
      if(numero1 > numero2 && numero1 > numero3) { 
         maior = numero1;
      } else if(numero2 > numero1 && numero2 > numero3) {
         maior = numero2;
      } else {
         maior = numero3;
      }
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
   }
}
      