import javax.swing.JOptionPane;
public class Aula3Ex2
{
   public static void main(String[] Jho) 
   {
      //Lendo valores
      int contador = 0;
      int numero = 0;
      
      //Imprimindo 100 primerios números pares
      while(contador < 100) {
      numero += 2 ;
      contador ++;
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Os 100 primeiros números pares: " + "\n" + numero);}
   }
}
