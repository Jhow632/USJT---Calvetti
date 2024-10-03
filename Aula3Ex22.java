import javax.swing.JOptionPane;
public class Aula3Ex22
{
   public static void main(String[] Jho) 
   {
      // Entrada do limite superior
      int limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog
          ("Digite o limite superior:"));
        
      //Imprimindo números ímpares e superiores
      for(int i = 1; i < limiteSuperior; i += 2) {
         JOptionPane.showMessageDialog(null, (i));
      }
    }
}
