import javax.swing.JOptionPane;
public class Ex10oa
{
   public static void main (String[] jho)
   {
      //Lendo frases
      String sFrase1 = JOptionPane.showInputDialog        
         ("Digite a primeira frase:");
      String sFrase2 = JOptionPane.showInputDialog
         ("Digite a segunda frase:");
      String sFrase3 = JOptionPane.showInputDialog
         ("Digite a terceira frase:");
      
      //Definindo e separando as frase
      String metade1frase = sFrase1.substring(0, sFrase1.length() / 2);
      String fim1frase = sFrase1.substring(sFrase1.length() / 2);
      String metade2frase = sFrase2.substring(0, sFrase2.length() / 2);
      String fim2frase = sFrase2.substring(sFrase2.length() / 2);
      String metade3frase = sFrase3.substring(0, sFrase3.length() / 2);
      String fim3frase = sFrase3.substring(sFrase3.length() / 2);
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Frase inicial: " + sFrase1 + " " + sFrase2 + " " + sFrase3);
      JOptionPane.showMessageDialog(null, "Frase embaralhada: " + metade2frase + fim3frase + fim2frase + " " + metade1frase + " " + metade3frase + " " + fim1frase);
   }
}
      
      