import javax.swing.JOptionPane;
public class Ex3iA
{
   public static void main(String[] jho)
   {
      //Lendo números
      String sDia = JOptionPane.showInputDialog
         ("Digite o dia do seu nascimento:");
      String sMes = JOptionPane.showInputDialog
         ("Digite o mês do seu nascimento:");
      String sAno = JOptionPane.showInputDialog
         ("Digite o ano do seu nascimento:");
      
      //Definindo números
      int dia = Integer.parseInt(sDia);
      int mes = Integer.parseInt(sMes);
      int ano = Integer.parseInt(sAno);
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
   }
} 