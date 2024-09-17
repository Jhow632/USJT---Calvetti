import javax.swing.JOptionPane;
public class Ex8oa
{
    public static void main(String[] jho)
    {
       //Lendo número
       String sNumero = JOptionPane.showInputDialog
          ("Digite um número: ");
          
       //Definindo número
       double numero = Double.parseDouble(sNumero);
       
       //Calculando logartmo na base 10
       numero = Math.pow(numero, 10);
       
       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "Número digitado elevado a 10: " + numero);
     }
}
          