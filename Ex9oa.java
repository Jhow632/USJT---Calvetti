import javax.swing.JOptionPane;
public class Ex9oa
{
    public static void main(String[] jho)
    {
       //Lendo dados
       String sNumero = JOptionPane.showInputDialog
          ("Digite um número: ");
       String sBase = JOptionPane.showInputDialog
          ("Digite a base: ");
          
       //Definindo número e base
       double numero = Double.parseDouble(sNumero);
       double base = Double.parseDouble(sBase);
       
       //Calculando número e base
       double resultado = Math.pow(numero, base);
       
       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "Resultado do número elevado a base: " + resultado);
    }
}
