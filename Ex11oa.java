import javax.swing.JOptionPane;
public class Ex11oa
{
   public static void main(String[] jho)
   {
      //Lendo data
      String sData = JOptionPane.showInputDialog
         ("Digite a data em formato ddmmaa:");
      
      //Definindo data
      int data = Integer.parseInt(sData);
      
      //Separando data
      String dia = sData.substring(0,2);
      String mes = sData.substring(2,4);
      String ano = sData.substring(4,6);
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Dia: " + dia); 
      JOptionPane.showMessageDialog(null, "Mês: " + mes); 
      JOptionPane.showMessageDialog(null, "Ano: " + ano); 
   }
}