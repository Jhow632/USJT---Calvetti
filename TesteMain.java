public class TesteMain {
    public static void main(String[] jho) {
        PessoaFisica pessoa = new PessoaFisica("Jhonatan", "DE LIMA", "123.456.789-10", 0);
        System.out.println(pessoa.dados());

        Desempregado desempregado = new Desempregado("Calvetti", "Santos", "987.654.321-00", 5500.0);
        System.out.println(desempregado.dados());

        Empregado empregado = new Empregado("Lucas", "Duduchi", "456.789.123-00", 2000.0);
        System.out.println(empregado.dados());

        Mensalista mensalista = new Mensalista("Andreia", "Lima", "321.654.987-00", 4500.0);
        System.out.println(mensalista.dados());

        Tarifeiro tarifeiro = new Tarifeiro("Felipe", "Ghilhardi", "343.678.256-20", 7000.0);
        System.out.println(tarifeiro.dados());
        Vendedor vendedor = new Vendedor("Marcos", "Lima", "457.908.365-80", 1400.0);
        System.out.println(vendedor.dados());
    }
}
    
