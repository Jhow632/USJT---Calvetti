import javax.swing.JOptionPane;
public class Aula3Ex16
{
   public static void main(String[] Jho) 
   {
       //Lendo número e definindo
       String sNumero = JOptionPane.showInputDialog
          ("Digite um número:");
       int numero = Integer.parseInt(sNumero);

       //Contagem para o fibonacci
       int a = 0, b = 1;
       int soma = 0;

       StringBuilder sequence = new StringBuilder("Sequência de Fibonacci: ");
       
       //Definindo que o número seja igual ou menor do inserido
       while (soma <= numero) {
            sequence.append(soma).append(" ");

       //Calculando próximo número
       soma = a + b;
       a = b;
       b = soma;
      }

       //Apresentando resultado
       JOptionPane.showMessageDialog(null, sequence.toString());
    }
}
