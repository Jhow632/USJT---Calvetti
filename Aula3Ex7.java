import javax.swing.JOptionPane;
public class Aula3Ex7
{
   public static void main(String[] jho) 
   {
     
     //DEfinindo e vendo números múltiplos de 5
     StringBuilder multiplos = new StringBuilder();
     int numero = 1;
     while(numero <= 500) {
     if(numero % 5 == 0) {
        multiplos.append(numero).append(" ");
       }
         numero++;
     }

        //Apresentando resultado
        JOptionPane.showMessageDialog(null, "Múltiplos de 5 de 1 a 500:\n" + multiplos.toString());
    }
}
