public class PessoaFisica {
        private String nome;
        private String sobrenome;
        protected static String cpf;

        public PessoaFisica(String nome2, String sobrenome2, String cpf2, double salario) {
            this.nome = "Nome";
            this.sobrenome = "Sobrenome";
            this.cpf = "123.456.789-10";
        }

        public PessoaFisica() {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }
    
        public String getSobrenome() {
            return sobrenome;
        }
    
        public String getCpf() {
            return cpf;
        }
  
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }
  
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
    
        public String dados() {
            return "Nome: " + nome + ", Sobrenome: " + sobrenome + ", CPF: " + cpf;
        }
    }
    
