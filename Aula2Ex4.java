import javax.swing.JOptionPane;
public class Aula2Ex4 
{
   public static void main(String[] jho) 
   {
      //Lendo números
      String sNumero1 = JOptionPane.showInputDialog
         ("Digite um número: ");
      String sNumero2 = JOptionPane.showInputDialog
         ("Digite um número diferente: ");
      String sNumero3 = JOptionPane.showInputDialog
         ("Digite um número diferente ");
      
      //Definindo números
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      int numero3 = Integer.parseInt(sNumero3);
      int menor, meio, maior;
      
      //Deixando em ordem crescente
       if(numero1 <= numero2 && numero1 <= numero3) {
          menor = numero1;
          if (numero2 <= numero3) {
          meio = numero2;
          maior = numero3;
        } else {
                meio = numero3;
                maior = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
            if (numero1 <= numero3) {
                meio = numero1;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 <= numero2) {
                meio = numero1;
                maior = numero2;
            } else {
                meio = numero2;
                maior = numero1;
            }
        }
        //Apresentando resultado
        JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}
