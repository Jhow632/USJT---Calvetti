import javax.swing.JOptionPane;
public class Aula2Ex15
{
   public static void main(String[] jho)
   {
      //Lendo ano de nascimento e o ano atual
      String sAno = JOptionPane.showInputDialog
         ("Digite o ano do seu nascimento: ");
      String sAtual = JOptionPane.showInputDialog
         ("Digite o ano atual: ");
      
      //Definindo datas
      int nascimento =  Integer.parseInt(sAno);
      int ano =  Integer.parseInt(sAtual);
      
      //Conferindo se existe a data informada
      if (nascimento > ano && nascimento <= 0) {
          JOptionPane.showMessageDialog(null, "O ano digitado é invalido");
      } else {
          JOptionPane.showMessageDialog(null, "O ano digitado é válido");
          
      //Somando idade
      int idade = (ano - nascimento);
      
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "Você tem" + " " + idade + " " + "anos de vida");
     }
  }
}