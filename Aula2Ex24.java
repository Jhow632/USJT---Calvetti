import javax.swing.JOptionPane;
public class Aula2Ex24 
{
   public static void main(String[] jho) 
   {
     
      // Lendo cinco números
      String sNumero1 = JOptionPane.showInputDialog
      ("Digite o primeiro número:");
      String sNumero2 = JOptionPane.showInputDialog
      ("Digite o segundo número:");
      String sNumero3 = JOptionPane.showInputDialog
      ("Digite o terceiro número:");
      String sNumero4 = JOptionPane.showInputDialog
      ("Digite o quarto número:");
      String sNumero5 = JOptionPane.showInputDialog
      ("Digite o quinto número:");
      
      //Definindo números
      int numero1 = Integer.parseInt(sNumero1);
      int numero2 = Integer.parseInt(sNumero2);
      int numero3 = Integer.parseInt(sNumero3);
      int numero4 = Integer.parseInt(sNumero4);
      int numero5 = Integer.parseInt(sNumero5);
       
      //Definindo maior e menor com o primeiro número
      int maior = numero1;
      int menor = numero1;

      //Encontrando o maior e o menor número
      if (numero2 > maior) maior = numero2;
      if (numero2 < menor) menor = numero2;

      if (numero3 > maior) maior = numero3;
      if (numero3 < menor) menor = numero3;

      if (numero4 > maior) maior = numero4;
      if (numero4 < menor) menor = numero4;

      if (numero5 > maior) maior = numero5;
      if (numero5 < menor) menor = numero5;

      //Apresentando resultado
      JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nO menor número é: " + menor);
    }
}
