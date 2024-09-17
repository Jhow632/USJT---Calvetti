import javax.swing.JOptionPane;
public class Ex6iA
{
   public static void main (String[] jho)
   {
      //Lendo números
      char cMilhar = JOptionPane.showInputDialog        
        ("Digite a milhar:").charAt(0);
      char cCentena = JOptionPane.showInputDialog
         ("Digite a centena:").charAt(0);
      char cDezena = JOptionPane.showInputDialog
         ("Digite a dezena:").charAt(0);
      char cUnidade = JOptionPane.showInputDialog
         ("Digite a unidade:").charAt(0);
         
      //Juntando caracteres
      String resultado = "" + cMilhar + cCentena + cDezena + cUnidade;
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
   }
}
       