import javax.swing.JOptionPane;
public class Ex12oa
{
    public static void main(String[] jho)
    {
       //Lendo data de nascimento
       String sDataNasc = JOptionPane.showInputDialog
          ("Digite sua data de nascimento na forma dd/mm/aa: ");
       
       //Separando data de nascimento
       String dia = sDataNasc.substring(0,2);
       String mes = sDataNasc.substring(3,5);
       String ano = sDataNasc.substring(6,8);
       
       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "Dia do nascimento: " + dia);
       JOptionPane.showMessageDialog(null, "Mês do nascimento: " + mes);
       JOptionPane.showMessageDialog(null, "Ano do nascimento: " + ano);
    }
}
       
       