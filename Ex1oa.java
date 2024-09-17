import javax.swing.JOptionPane;
public class Ex1oa
{
    public static void main(String[] jho)
    {
       //Lendo idade
       String sIdade = JOptionPane.showInputDialog
          ("Digite sua idade: ");
          
       //Definindo idade para interio
       int idade = Integer.parseInt(sIdade);
       
       //Calculando dias vividos
       int dias = idade * 365;

       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "Você viveu aproximadamente: " + dias);
    }
}