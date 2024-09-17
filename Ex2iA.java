import javax.swing.JOptionPane;
public class Ex2iA
{
    public static void main(String[] jho)
    {
       //Lendo as três palavras 
       String sNumero = JOptionPane.showInputDialog
          ("Digite um número inteiro: ");
       
       //Definindo número
       int numero = Integer.parseInt(sNumero);
       
       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + numero);
    }
}
       
          