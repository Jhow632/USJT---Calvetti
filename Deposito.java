import java.util.ArrayList;

public class Deposito {
    private ArrayList<Caixa> caixas;

    public Deposito() {
        this.caixas = new ArrayList<>();
    }

    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    public boolean removerCaixaPorDono(String dono) {
        return caixas.removeIf(caixa -> caixa.getDono().equalsIgnoreCase(dono));
    }

    public int encontrarCaixaPorDono(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equalsIgnoreCase(dono)) {
                return i;
            }
        }
        return -1;
    }

    public boolean mudarLocalizacaoCaixa(String dono, String novoCorredor, int novaPosicao) {
        int indice = encontrarCaixaPorDono(dono);
        if (indice != -1) {
            Caixa caixa = caixas.get(indice);
            caixa.setCorredor(novoCorredor);
            caixa.setPosicao(novaPosicao);
            return true;
        }
        return false;
    }

    public ArrayList<Caixa> caixasComPesoMaiorQue(double peso) {
        ArrayList<Caixa> resultado = new ArrayList<>();
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > peso) {
                resultado.add(caixa);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        if (caixas.isEmpty()) {
            return "Nenhuma caixa cadastrada.";
        }
        StringBuilder resultado = new StringBuilder("Caixas no depósito:\n");
        for (Caixa caixa : caixas) {
            resultado.append(caixa).append("\n");
        }
        return resultado.toString();
    }
}

