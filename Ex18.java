import javax.swing.JOptionPane;
public class Ex18
{
   public static void main(String[] jho)
   {
      //Lendo dados
      String sBase = JOptionPane.showInputDialog
         ("Digite a base do losango: ");
      String sAltura = JOptionPane.showInputDialog
         ("Digite a altura do losango: ");
         
      //Definindo base e altura
      double base = Double.parseDouble(sBase);
      double altura = Double.parseDouble(sAltura);
      
      //Calculando área do losango
      double area = (base * altura) / 2;
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "A área do losango e: " + area);
   }
}
      
        