import javax.swing.JOptionPane;
public class Aula3Ex15
{
   public static void main(String[] Jho) 
   {
      //Iniciando com menor valor possível 
        int maiorNumero = Integer.MIN_VALUE; 
      
      //Lendo número
      while (true) {
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número (Digite -9999 para sair):");
            
      //Definindo número e recomeçando loop se a entrada for inválida
      int numero;
      try {
      numero = Integer.parseInt(sNumero);
      } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Entrada inválida!.");
        continue; 
      }

        //Saindo do loop
        if(numero == -9999) {
          break;
        }

        //Verificando maior número digitado
        if(numero > maiorNumero) {
           maiorNumero = numero;
          }
       }

        //Apresentando resultado
        if (maiorNumero != Integer.MIN_VALUE) {
            JOptionPane.showMessageDialog(null, "O maior número digitado é: " + maiorNumero);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número válido foi digitado");
        }
    }
}
