import javax.swing.JOptionPane;
public class Ex14oa
{
    public static void main(String[] jho)
    {
       //Lendo data de nascimento
       String sRaio = JOptionPane.showInputDialog
          ("Digite o raio do círculo:");
          
       //Definido área e raio
       double PI = (3.14159);
       double raio = Double.parseDouble(sRaio);
       
       //Calculano círculo
       double area = (PI * raio * raio);
       
       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "A área do círculo e: " + area);
    }
}
