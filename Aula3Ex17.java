import javax.swing.JOptionPane;
public class Aula3Ex17
{
   public static void main(String[] Jho) 
   {
      //Definindo um double
      double resultado = 0;
      
      //Fazendo cálculo das polegadas
      for(double polegada = 1; polegada <= 20; polegada++)
      {    
          resultado = polegada * 2.54;
          
          //Apresentando resultado
          JOptionPane.showMessageDialog(null, "Polegadas convertidas de 1 a 20 em cm: " + "\n" + polegada + "\n " + resultado);
        }
    }
}