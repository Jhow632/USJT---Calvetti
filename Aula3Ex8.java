import javax.swing.JOptionPane;
public class Aula3Ex8
{
   public static void main(String[] Jho) 
   {
      //Definindo valor
      int contador = 0;
      int numero;
      String entrada;
      entrada = JOptionPane.showInputDialog
      ("Digite um número: (ou 'Sair' para finalizar)");
      
      //Ler números
      while(entrada != null && !entrada.equalsIgnoreCase("sair")) {
          numero = Integer.parseInt(entrada);
          if(numero >= 120 && numero <= 300) {
          contador++;
          }
          entrada = JOptionPane.showInputDialog
          ("Digite outro número: (ou 'sair' para finalizar)");
      }
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Você digitou: " + contador + " " + "números entre 120 e 300");
   }
}
      