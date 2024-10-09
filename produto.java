public class produto {
    //Atributos
    private String nome;
    private Double preco;
    private int quantidade;
    //Método construtor
    public produto(String n, Double p, int q) {
    nome = n;
    preco = p;
    quantidade = q;  
    }
    //Método de acesso 
    public String getNome() {
    return nome;
    }
    public Double getPreco() {
    return preco;
    }
    public int getQuantidade() {
    return quantidade;
    }
    //Método moodficador 
    public void setNome (String n) {
    nome = n;
    }
    public void setPreco (Double p) {
    preco = p;
    }
    public void setQuantidade (int q) {
    quantidade = q;
    }
}
