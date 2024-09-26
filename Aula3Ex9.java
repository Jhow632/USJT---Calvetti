import javax.swing.JOptionPane;
public class Aula3Ex9
{
   public static void main(String[] Jho) 
   {
      //Definindo valores
      int numero = 1;
      int soma = 0;
      
      //Imprimindo na tela e fazendo soma dos números
      while(numero <= 100) {
      JOptionPane.showMessageDialog(null, numero);
      soma += numero;
      numero++;
      }
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Soma de 1 a 100 é: " + soma);
    }
}
      