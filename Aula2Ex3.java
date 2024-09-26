import javax.swing.JOptionPane;
public class Aula2Ex3
{
   public static void main(String[] jho)
   {
      //Lendo número
      String sNumero = JOptionPane.showInputDialog
         ("Digite um número:");
     
      //Definindo número 
      int numero = Integer.parseInt(sNumero);
      
      //Vendo se o número é positivo e fazendo raiz quadrada dele
      if(numero >= 0){
         double raiz = Math.sqrt(numero);
         JOptionPane.showMessageDialog(null, "Raiz quadrada de: " + numero + " " + "é: " + raiz);
      } else {
        double quadrado = Math.pow(numero, 2);
        JOptionPane.showMessageDialog(null, "O quadrado de: " + numero + " " + "é: " + " " +  quadrado);
      }
    }
}
        

        
      
      
      
       
         