import javax.swing.JOptionPane;
public class Ex13oa
{
    public static void main(String[] jho)
    {
       //Lendo as três palavras 
       String sNumero1 = JOptionPane.showInputDialog
          ("Digite um número inteiro: ");
       String sNumero2 = JOptionPane.showInputDialog
          ("Digite um número inteiro: ");
       String sNumero3 = JOptionPane.showInputDialog
          ("Digite um número inteiro: ");
          
       //Definindo os números
       int a = Integer.parseInt(sNumero1);
       int b = Integer.parseInt(sNumero2);
       int c = Integer.parseInt(sNumero3);
       
       //Calculando números
       int resultado = 2 * ((a-c) / 8) - b * 5;
       
       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "Resultado da expressâo: " + resultado);
    }
}
      