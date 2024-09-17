import javax.swing.JOptionPane;
public class Ex5iA
{
   public static void main(String[] jho)
   {
      //Lendo caracteres
      char cUm = JOptionPane.showInputDialog        
        ("Digite o primeiro caractere:").charAt(0);
      char cDois = JOptionPane.showInputDialog
         ("Digite o segundo caractere:").charAt(0);
      char cTres = JOptionPane.showInputDialog
         ("Digite o terceiro caractere:").charAt(0);
      char cQuatro = JOptionPane.showInputDialog
         ("Digite o quarto caractere:").charAt(0);
      char cCinco = JOptionPane.showInputDialog
         ("Digite o quinto caractere:").charAt(0);
      char cSeis = JOptionPane.showInputDialog
         ("Digite o sexto caractere:").charAt(0);
      char cSete = JOptionPane.showInputDialog
         ("Digite o sétimo caractere:").charAt(0);
      char cOito = JOptionPane.showInputDialog
         ("Digite o oitavo caractere:").charAt(0);
      char cNove = JOptionPane.showInputDialog
         ("Digite o nono caractere:").charAt(0);
      char cDez = JOptionPane.showInputDialog
         ("Digite o décimo caractere:").charAt(0);
      
      //Juntando caracteres
      String resultado = "" + cUm + cDois + cTres + cQuatro + cCinco + cSeis + cSete + cOito + cNove + cDez;
      
      //Apresentando resultado
       JOptionPane.showMessageDialog(null, "A palavra formada é: " + resultado);
   }
}