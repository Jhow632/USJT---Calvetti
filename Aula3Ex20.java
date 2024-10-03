import javax.swing.JOptionPane;
public class Aula3Ex20
{
   public static void main(String[] Jho) 
   {
      //Lendo dados e definindo
      String sLimite = JOptionPane.showInputDialog
         ("Digite o limite superior:");
      int superior = Integer.parseInt(sLimite);

      String sIncremento = JOptionPane.showInputDialog
         ("Digite o incremento:");
      int incremento = Integer.parseInt(sIncremento);

      //Armazenndo a sequência de números
      StringBuilder numeros = new StringBuilder("Números no intervalo:\n");

      //Cálculo
      for(int i = 0; i <= superior; i += incremento) {
          numeros.append(i).append("\n");
      }

      //Apresentando resultado
      JOptionPane.showMessageDialog(null, numeros.toString());
    }
}
