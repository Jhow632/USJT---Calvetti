import javax.swing.JOptionPane;
public class Aula3Ex4
{
   public static void main(String[] Jho) 
   {
      //Lendo valores
      int contador = 0;
      int numero;
      
      //Falando a forma de encerrar e contando números entre 100 e 200
      while(true) {
      String entrada = JOptionPane.showInputDialog
          ("Digite um número:(Para encerrar digite 0)");
      numero = Integer.parseInt(entrada);
      if (numero == 0) {
        break ; 
      } if(numero>= 100 && numero <= 200) {
      contador ++;
        }
      }
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Números digitados entre 100 e 200: " + contador);
   }
}