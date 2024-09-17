import javax.swing.JOptionPane;
public class Ex1iA
{
    public static void main(String[] jho)
    {
       //Lendo as três palavras 
       String sPalavra1 = JOptionPane.showInputDialog
          ("Digite a primeira palavra: ");
       String sPalavra2 = JOptionPane.showInputDialog
          ("Digite a segunda palavra: ");
       String sPalavra3 = JOptionPane.showInputDialog
          ("Digite a terceira palavra: ");
       
       //Definindo palavras
       String palavra1 = (sPalavra1);
       String palavra2 = (sPalavra2);
       String palavra3 = (sPalavra3);
       
       //Apresentando resultado
       JOptionPane.showMessageDialog(null, palavra3 + "  " + palavra2+  "  " + palavra1);
    }
}