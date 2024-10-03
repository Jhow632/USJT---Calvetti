import javax.swing.JOptionPane;
public class Aula3Ex23
{
   public static void main(String[] Jho) 
   {
      //Lendo quantidade de números
      int quantidadePares = Integer.parseInt(JOptionPane.showInputDialog
          ("Digite a quantidade de números pares que deseja imprimir: "));

      //Armazenando número que se inicia
      int numero = 2;

      //Imrpimindo pares e apresentando resultado
      for(int i = 0; i < quantidadePares; i++) {
          System.out.println(numero);
          numero += 2; 
      }
    }
}
