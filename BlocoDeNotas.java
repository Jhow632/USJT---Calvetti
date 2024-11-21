import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<String> notas;

    public BlocoDeNotas() {
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(String nota) {
        notas.add(nota);
    }

    public boolean removerNota(int indice) {
        if (indice >= 0 && indice < notas.size()) {
            notas.remove(indice);
            return true;
        }
        return false;
    }

    public boolean alterarNota(int indice, String novaNota) {
        if (indice >= 0 && indice < notas.size()) {
            notas.set(indice, novaNota);
            return true;
        }
        return false;
    }

    public String buscarNota(int indice) {
        if (indice >= 0 && indice < notas.size()) {
            return notas.get(indice);
        }
        return null;
    }

    public String listarNotas() {
        if (notas.isEmpty()) {
            return "Nenhuma nota cadastrada.";
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < notas.size(); i++) {
            resultado.append(i).append(" - ").append(notas.get(i)).append("\n");
        }
        return resultado.toString();
    }
}
