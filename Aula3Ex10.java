import javax.swing.JOptionPane;
public class Aula3Ex10
{
   public static void main(String[] Jho) 
   {
     //Definindo número
     String sNumero;
     int numero;

     //Verificando loop
     while (true) {
     sNumero = JOptionPane.showInputDialog
      ("Digite um numero: (Digite -999 para sair):");
     numero = Integer.parseInt(sNumero);
            
            if (numero == -999) {
            break;
            }

            String divisores = "Divisores de " + numero + ": ";
            for(int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
            divisores += i + ", ";
                }
            }
            //Apresentando resultado
            JOptionPane.showMessageDialog(null, divisores);
        }
    }
}