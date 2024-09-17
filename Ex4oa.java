import javax.swing.JOptionPane;
public class Ex4oa
{
   public static void main(String[] jho)
   {
      //Leitura das strings
      String strg1 = JOptionPane.showInputDialog
         ("Digite a primeira string: ");
      String strg2 = JOptionPane.showInputDialog
         ("Digite a segunda string: ");
      String strg3 = JOptionPane.showInputDialog
         ("Digite a terceira string: ");
      
      //Soma do comprimento das strings
      int comprimento = strg1.length() + strg2.length() + strg3.length();
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "A soma dos comprimentos das String e: " + comprimento);
    }
}