import javax.swing.JOptionPane;
public class Aula3Ex13
{
   public static void main(String[] Jho) 
   {
      //Lendo número e definindo
      String sNumero = JOptionPane.showInputDialog
         ("Digite um numero:");
        int numero = Integer.parseInt(sNumero);
        
        //Testando loop
        boolean primo = true;
        if (numero < 2) {
            primo = false;
        } else {
         for (int i = 2; i <= Math.sqrt(numero); i++) {
         if (numero % i == 0) {
         primo = false;
                    break;
                }
            }
        }
        //Apresentando resultado
        String resultado = primo ? numero + " é primo." : numero + " não é primo.";
        JOptionPane.showMessageDialog(null, resultado);
    }
}
          
