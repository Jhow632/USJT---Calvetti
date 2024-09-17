import javax.swing.JOptionPane;
public class Ex3oa
{
   public static void main(String[] jho)
   {
      //Lendo dados
      String sNumero = JOptionPane.showInputDialog
         (  "Digite um número inteiro:  ");
         
      //Definindo string
      double numero = Double.parseDouble(sNumero);
      double numero2 = Math.pow(numero, 2);
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "O quadrado de :  " + numero +  " e:  " + numero2);
     }
}