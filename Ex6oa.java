import javax.swing.JOptionPane;
public class Ex6oa
{
    public static void main(String[] jho) 
    {
       //Lendo número inteiro 
       String sNumero = JOptionPane.showInputDialog
          ("Digite um número inteiro de 3 dígitos: ");
        
       //Convertendo para número inteiro 
       int numero = Integer.parseInt(sNumero);
        
       //Definido dezenas
       int dezenas = (numero / 10) % 10;
        
       //Apresentando o resultado
       JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é: " + dezenas);
    }
}
