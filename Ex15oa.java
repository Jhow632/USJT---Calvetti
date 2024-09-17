import javax.swing.JOptionPane;
public class Ex15oa
{
    public static void main(String[] jho)
    { 
       //Lendo as três palavras 
       String sDividendo = JOptionPane.showInputDialog
          ("Digite o número dividendo: ");
       String sDivisor = JOptionPane.showInputDialog
          ("Digite o número divisor: ");
          
       //Definifo dividendo e divisor[
       int dividendo = Integer.parseInt(sDividendo);
       int divisor = Integer.parseInt(sDivisor);
       
       //Fazendo cálculo do quociente e resto
       int quociente = (dividendo / divisor);
       int resto = dividendo % divisor;
       
       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "O quociente e: " + quociente);
       JOptionPane.showMessageDialog(null, "O resto e: " + resto);
    } 
}

