import javax.swing.JOptionPane;
public class Aula2Ex7
{ 
   public static void main(String[] jho)
   {
      //Lendo idade, gênero e idade
      String sNome = JOptionPane.showInputDialog
         ("Digite seu nome: ");
      String sGenero = JOptionPane.showInputDialog
         ("Digite seu gênero (F ou M): ");
      String sIdade = JOptionPane.showInputDialog
         ("Digite sua idade: ");
      
      //Definindo idade
      int idade = Integer.parseInt(sIdade);
      
      //Verificando masculino ou feminino e apresentando resultado
      if ((sGenero.equalsIgnoreCase("F")) && (idade < 25)){
         JOptionPane.showMessageDialog(null, sNome + " " +  "ACEITA ");
      } else {
         JOptionPane.showInputDialog(null, sNome + " " + "NÃO ACEITA ");
      }
   }
}
      