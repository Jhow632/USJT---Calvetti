import javax.swing.JOptionPane;
public class Aula3Ex18
{
   public static void main(String[] Jho) 
   {
      //Lendo valores e definindo
      String sInferior = JOptionPane.showInputDialog
         ("Digite o limite inferior:");
      int inferior = Integer.parseInt(sInferior);

      String sSuperior = JOptionPane.showInputDialog
         ("Digite o limite superior:");
      int superior = Integer.parseInt(sSuperior);

      String sIncremento = JOptionPane.showInputDialog
         ("Digite o incremento:");
      int incremento = Integer.parseInt(sIncremento);

      //Armazenando tabela de coversão
      StringBuilder tabela = new StringBuilder("Celsius\tFahrenheit\n");

      //Fazendo cálculo
      for(int celsius = inferior; celsius <= superior; celsius += incremento) {
      double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
      tabela.append(celsius).append("\t").append(String.format("%.2f", fahrenheit)).append("\n");
      }

      //Apresentando resultado
      JOptionPane.showMessageDialog(null, tabela.toString());
    }
}
