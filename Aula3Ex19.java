import javax.swing.JOptionPane;
public class Aula3Ex19
{
   public static void main(String[] Jho) 
   {  
      //lendo os valores e definindo
      int numero = Integer.parseInt(JOptionPane.showInputDialog
          ("Digite um numero para calcular o fatorial:"));  
      long fatorial = 1;

      // Calcula o fatorial
      for(int i = 1; i <= numero; i++) {
          fatorial *= i;
      }
        
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "Fatorial de " + numero + " é: " + fatorial);
    }
}