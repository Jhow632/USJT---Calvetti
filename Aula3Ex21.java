import javax.swing.JOptionPane;
public class Aula3Ex21
{
   public static void main(String[] Jho) 
   {
      //Lendo dados e definindo
      String nome;
      int idade;
      String sexo;
        
      //Fazendo laço das 20 pessoas
      for(int pessoas = 1; pessoas <= 20; pessoas++) {
     
      //pedindo dados
      nome = JOptionPane.showInputDialog
         ("Digite o nome da pessoa: " + pessoas);
      idade = Integer.parseInt(JOptionPane.showInputDialog
         ("Digite a idade de: " + nome));
      sexo = JOptionPane.showInputDialog
         ("Digite o sexo de: " + nome + " (M/F)").toUpperCase();

      //Verificando se a pessoa tem mais de 21 e mostrando resultado
        if(sexo.equals("M") && idade > 21) {
           System.out.println("Nome: " + nome);
         }
      }
    }
}
