import javax.swing.JOptionPane;
public class Ex16
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número: ");
      
      //Definindo número
      double numero = Double.parseDouble(sNumero);
      
      //Imprimindo número digitado
      JOptionPane.showMessageDialog(null, "Número digitado: " + numero);
       
      //Fazendo cálculo do número
      JOptionPane.showMessageDialog(null, "Seu quadrado e: " + Math.pow(numero, 2));
      JOptionPane.showMessageDialog(null, "Sua raiz quadrada e: " + Math.sqrt(numero));
    }
}

      
      