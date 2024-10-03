import javax.swing.JOptionPane;
public class Aula3Ex26
{
   public static void main(String[] jho)
   {
      //lendo os dados
      double numero1 = Double.parseDouble(JOptionPane.showInputDialog
           ("Digite o primeiro numero:"));
      double numero2 = Double.parseDouble(JOptionPane.showInputDialog
           ("Digite o segundo numero:"));
        
      int opcao;
        
      do {
          String menu = "Operacoes disponiveis:\n" +
                          "1. Adicao\n" +
                          "2. Subtracao\n" +
                          "3. Multiplicacao\n" +
                          "4. Divisao\n" +
                          "9. Sair do Programa\n" +
                          "Digite o número de ordem da opcao desejada:";
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            double resultado = 0;
            switch (opcao) {
                case 1:
                    resultado = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da Adicao: " + resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da Subtracao: " + resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da Multiplicacao: " + resultado);
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        JOptionPane.showMessageDialog(null, "Resultado da Divisao: " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: Divisao por zero não e permitida.");
                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida! Tente novamente.");
            }
        } while (opcao != 9);
    }
}