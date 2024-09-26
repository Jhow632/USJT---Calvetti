import javax.swing.JOptionPane;
public class Aula3Ex5
{
   public static void main(String[] Jho) 
   {
      //Definindo nome
      String nome;
      
      //Lendo nomes e deicindo FIM 
      while(true) {
      nome = JOptionPane.showInputDialog("Digite um nome: (Para encerrar digite 'FIM')");
      if (nome.equalsIgnoreCase("FIM")) {
        break ; 
      }
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Nomes digitados: " + nome);
     }
   }
}