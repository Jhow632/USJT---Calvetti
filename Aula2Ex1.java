import javax.swing.JOptionPane;
public class Aula2Ex1
{
   public static void main(String[] jho)
   {
      //Lendo valores númericos
      String sNumero1 = JOptionPane.showInputDialog
         ("Digite um número inteiro: "); 
      String sNumero2 = JOptionPane.showInputDialog
         ("Digite um número inteiro: ");
      
      //Definido números
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      
      //Calculando os valores númericos
      int soma = numero1 + numero2;
      if(soma > 10);
      
      //Apresentando resultado
      if(soma > 10){
         JOptionPane.showMessageDialog(null, "A soma é maior que 10: " + soma);
      }
    }
}