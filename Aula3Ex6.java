import javax.swing.JOptionPane;
public class Aula3Ex6
{
   public static void main(String[] Jho) 
   {
      //Definindo valor
      double numero;
      
      //Lendo números e dando opção pra encerrar
      while(true) {
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número: (Digite -999 para encerrar)");
      numero = Double.parseDouble(sNumero);
      if(numero == -999) {
      break;
      }
      
      //Imprimindo raiz quadrada e inverso de cada número
      double raiz = Math.sqrt(numero);
      double inverso = 1.0 / numero;
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Números digitados: " + numero + "\nRaiz quadrada: " + raiz + "\nInverso: " + inverso);
     }
   }
}
         