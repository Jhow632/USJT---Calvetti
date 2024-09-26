import javax.swing.JOptionPane;
public class Aula2Ex20
{
   public static void main(String[] jho)
   {
      //Lendo números
      String sNumero1 = JOptionPane.showInputDialog
         ("Digite um número:");
      String sNumero2 = JOptionPane.showInputDialog
         ("Digite um número diferente do primeiro:");
      
      //Definindo números
      double numero1 = Double.parseDouble(sNumero1);
      double numero2 = Double.parseDouble(sNumero2);
      
      //Definindo maior e menor
      double maior = Double.parseDouble(sNumero1);
      double menor = Double.parseDouble(sNumero2);
      
      //Definindo qual número é maior menor
      if(numero1 > numero2) {
         maior = numero1;
         menor = numero2;
      } else {
        maior = numero2;
        menor = numero1;
      }
      
      //Fazendo cálculo do maior e menor número
      double dQuadrado = Math.pow(menor, 2);
      
      //Apresentando resultado
      if(maior >= 0) {
         double dRaiz = Math.sqrt(maior);
         JOptionPane.showMessageDialog(null, "Raiz quadrada do número maior: " + dRaiz);
      } else {
        JOptionPane.showMessageDialog(null, "Quadrado do número menor: " + dQuadrado);
      }
   }
}