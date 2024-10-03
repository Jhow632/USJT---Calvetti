import javax.swing.JOptionPane;
public class Aula3Ex25
{
  public static void main(String[] jho)
  {
     int[] votos = new int[4];
     int totalVotos = 0;

     while (true) {
     String entrada = JOptionPane.showInputDialog("Vote no candidato (1, 2, 3 ou 4) ou digite -1 para encerrar:");
     int voto = Integer.parseInt(entrada);

         if (voto == -1) {
         break;
         } else if (voto >= 1 && voto <= 4) {
           votos[voto - 1]++;
                totalVotos++;
          } else {
            JOptionPane.showMessageDialog(null, "Voto invalido! Tente novamente.");
            }
         }

        String resultado = "Resultado da eleição:\n";
        for (int i = 0; i < votos.length; i++) {
            double percentual = totalVotos > 0 ? (votos[i] * 100.0 / totalVotos) : 0;
            resultado += "Candidato " + (i + 1) + ": " + votos[i] + " votos (" + String.format("%.2f", percentual) + "%)\n";
        }
        resultado += "Total de alunos eleitores: " + totalVotos;
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}