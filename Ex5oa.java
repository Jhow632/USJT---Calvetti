import javax.swing.JOptionPane;
public class Ex5oa
{
    public static void main(String[] jho)
    {
       //Lendo dados
       double dValorInicial = 100.00;
       double dJuros = 10.0 / 100.0;
       int dMeses = 8;
     
       //Calculando juros
       double valorFinal = dValorInicial * Math.pow(1 + dJuros, dMeses);

       //Apresentando o resultado
       JOptionPane.showMessageDialog(null, "O valor final da dívida é: " + valorFinal);
    }
}