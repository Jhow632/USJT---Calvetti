import javax.swing.JOptionPane;
public class Aula3Ex14
{
   public static void main(String[] Jho) 
   {
      //Definindo dados
      int quantidadePrimos = 0;

        while (true) {
            String sNumero = JOptionPane.showInputDialog
               ("Digite um número inteiro positivo: (ou um número negativo para sair):");
            int numero = Integer.parseInt(sNumero);

            //Parar o loop
            if (numero <= 0) {
                break; 
            }

            //Verificando se o número é ou não é primo
            boolean ePrimo = true;
            if (numero < 2) {
                ePrimo = false; 
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        ePrimo = false; 
                        break; 
                    }
                }
            }

            if (ePrimo) {
                quantidadePrimos++;
            }
        }

        //Apresentando resultado
        JOptionPane.showMessageDialog(null, "Quantidade de números primos: " + quantidadePrimos);
    }
}

          
