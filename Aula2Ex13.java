import javax.swing.JOptionPane;
public class Aula2Ex13 
{
   public static void main(String[] jho) 
   {
      //Lendo um número inteiro de 3 dígitos
      String sNumero = JOptionPane.showInputDialog
     ("Digite um número inteiro de 3 dígitos:");
     
     //Definindo número
     int numero = Integer.parseInt(sNumero);
     
     //Verificando se o número tem 3 dígitos
     if (numero < 100 && numero > 999) {
         JOptionPane.showMessageDialog(null, "Por favor, insira um número de 3 dígitos.");
        } else {
         
          //Vendo o algarismo da casa das dezenas
          int dezena = (numero / 10) % 10;
         
          //Apresentando resultado
          if (dezena % 2 == 0) {
              JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas (" + dezena + ") é par.");
            } else {
              JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas (" + dezena + ") é ímpar.");
            }
        }
    }
}
