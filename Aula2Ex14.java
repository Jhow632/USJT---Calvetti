import javax.swing.JOptionPane;
public class Aula2Ex14
{
   public static void main(String[] jho) 
   {
      //Lendo número
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número inteiro de 4 dígitos:");
         
      //Definindo número
      int numero = Integer.parseInt(sNumero);

      // Verifica se o número tem 4 dígitos
      if (numero < 1000 && numero > 9999) {
          JOptionPane.showMessageDialog(null, "Digite um número de 4 dígitos.");
      } else {
      
          //Extraindoo algarismo da casa das unidades de milhar e das centenas
          int milhar = (numero / 1000) % 10; 
          int centena = (numero / 100) % 10; 

          //Formando o número com os algarismos da milhar e da centena
          int resultado = milhar * 10 + centena;

          // Verificar se o número formado é múltiplo de 4
          if (resultado % 4 == 0) {
              JOptionPane.showMessageDialog(null, "Número formado pelos algarismos " + milhar + centena + " (" + resultado + ") é múltiplo de 4.");
          } else {
              JOptionPane.showMessageDialog(null, "Número formado pelos algarismos " + milhar + centena + " (" + resultado + ") não é múltiplo de 4.");
          }
      }
   }
}
