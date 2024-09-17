import javax.swing.JOptionPane;
public class Ex2oa
{
    public static void main(String[] jho)
    {
       //Lendo base e altura
       String sBase = JOptionPane.showInputDialog
          ("Digite a medida de sua base: ");
       String sAltura = JOptionPane.showInputDialog
          ("Digite sua altura: ");
          
       //Definindo idade para interio
       double base = Double.parseDouble(sBase);
       double altura = Double.parseDouble(sAltura);
       
       //Calculando a area do retangulo
       double area = base * altura;

       //Apresentando resultado
       JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
    }
}