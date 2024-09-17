import javax.swing.JOptionPane;
public class Ex7oa
{
    public static void main(String[] jho)
    {
       //Lendo base e altura
       String sAngulo = JOptionPane.showInputDialog
          ("Digite um ângulo em graus: ");
          
       //Definindo cosseno e as outras que pede
       double angulo = Double.parseDouble(sAngulo);
       double seno = Math.sin(angulo);
       double cosseno = Math.cos(angulo);
       double tangente = Math.tan(angulo);
       double secante = (1 / cosseno);
       double cossecante = (1 / seno);
       double cotangente = (1 / tangente);
       
       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "O ângulo será: " + angulo);
       JOptionPane.showMessageDialog(null, "O seno será: " + seno);
       JOptionPane.showMessageDialog(null, "O cosseno será: " + cosseno);
       JOptionPane.showMessageDialog(null, "O tangente será: " + tangente);
       JOptionPane.showMessageDialog(null, "O secante será: " + secante);
       JOptionPane.showMessageDialog(null, "O cossecante será: " + cossecante);
       JOptionPane.showMessageDialog(null, "O cotangente será: " + cotangente);
     }
}