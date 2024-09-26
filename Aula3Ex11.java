import javax.swing.JOptionPane;
public class Aula3Ex11
{
   public static void main(String[] Jho) 
   {
      //Definindo valores
      int codigo;
      double consumo, custo;
      double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
      int contadorResidencial = 0, contadorComercial = 0;
        
      while (true) {
      codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do consumidor (0 para sair):"));
      if (codigo == 0) break;

      consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:"));
      int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do consumidor (1-residencial, 2-comercial, 3-industrial):"));
            
           switch (tipo) {
           case 1:
           custo = consumo * 0.3;
           totalResidencial += consumo;
           contadorResidencial++;
           break;
           case 2:
           custo = consumo * 0.5;
           totalComercial += consumo;
           contadorComercial++;
           break;
           case 3:
           custo = consumo * 0.7;
           totalIndustrial += consumo;
               break;
           default:
           JOptionPane.showMessageDialog(null, "Tipo inválido!");
               continue;
            }
            
            JOptionPane.showMessageDialog(null, "Custo total para o consumidor " + codigo + ": R$ " + custo);
        }
        
        double mediaResidencial = (contadorResidencial > 0) ? totalResidencial / contadorResidencial : 0;
        double mediaComercial = (contadorComercial > 0) ? totalComercial / contadorComercial : 0;
        double totalGeral = totalResidencial + totalComercial + totalIndustrial;

        String resultado = String.format("Total Residencial: %.2f kWh\nTotal Comercial: %.2f kWh\nTotal Industrial: %.2f kWh\nMédia Residencial: %.2f kWh\nMédia Comercial: %.2f kWh",
                                          totalResidencial, totalComercial, totalIndustrial, mediaResidencial, mediaComercial);
        JOptionPane.showMessageDialog(null, resultado);
    }
}