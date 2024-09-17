import javax.swing.JOptionPane;
public class Ex17
{
   public static void main(String[] jho)
   {
      //Lendo dados
      String sBase = JOptionPane.showInputDialog
         ("Digite a base do triângulo:");
      String sAltura = JOptionPane.showInputDialog
         ("Digite a altura do triângulo:");
      
      //Definindo base e altura   
      double base = Double.parseDouble(sBase);
      double altura = Double.parseDouble(sAltura);
      
      //Calculando base e altura
      double area = (base * altura);
      
      //Apresentando resultado 
      JOptionPane.showMessageDialog(null, "A área do retângulo e: " + area);
   }
}
      
      