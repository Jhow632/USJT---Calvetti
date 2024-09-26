import javax.swing.JOptionPane;
public class Aula3Ex12
{
   public static void main(String[] Jho) 
   {
      int menor21 = 0;
      int maior50 = 0;

      while(true) {
      //Usuário digitar idade
      String sIdade = JOptionPane.showInputDialog
         ("Digite a idade: (Para sair digite um número fora de (0 - 120)");
      //Definindo
      int idade;
      try {
      idade = Integer.parseInt(sIdade);
       } catch (NumberFormatException e) {
       JOptionPane.showMessageDialog(null, "Não é uma idade válida.");
       continue; 
         }

        //Saindo  do loop
        if(idade < 0 || idade >= 121) {
        break; }

        //Contando menores de 21 e maiores de 50
        if(idade < 21) {
          menor21++;
        } else if(idade > 50) {
         maior50++;
            }
        }

        //Apresentando resultado
        JOptionPane.showMessageDialog(null, "Total de pessoas com menos de 21 anos: " + menor21);
        JOptionPane.showMessageDialog(null, "Total de pessoas com mais de 50 anos: " + maior50);
    }
}
