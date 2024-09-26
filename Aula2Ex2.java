import javax.swing.JOptionPane;
public class Aula2Ex2
{
   public static void main(String[] jho)
   {
      //Lendo números
      String sNumero1 = JOptionPane.showInputDialog
         ("Digite o número:");
      String sNumero2 = JOptionPane.showInputDialog
         ("Digite o número:");
      
      //Definindo números
      double numero1 = Double.parseDouble(sNumero1);
      double numero2 = Double.parseDouble(sNumero2);
      
      //Calculando números
      double soma = numero1 + numero2;
      if( soma <= 20);
      double resultado = soma - 5;
      
      //Apresentando resultado
      if(soma <= 20){
         JOptionPane.showMessageDialog(null, "Resultado subtraído por 5: " + resultado);
      }
   }
}