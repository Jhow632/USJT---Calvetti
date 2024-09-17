import javax.swing.JOptionPane;
public class Ex4ia
{
   public static void main(String[] jho)
   {
      //Pedindo para o usuário colocar o peso
      String sPeso = JOptionPane.showInputDialog
         ("Digite seu peso em formato real: ");
       
      //Definindo peso
      double peso = Double.parseDouble(sPeso);
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "O peso informado foi: " + peso + "kg");
   }
} 
      
         
         