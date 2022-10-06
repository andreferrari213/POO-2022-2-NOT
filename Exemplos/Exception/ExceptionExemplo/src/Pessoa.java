public class Pessoa {
    
    private String nome;
    private String cpf;

    public void setCpf(String cpf) {
        if (cpf != null){
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF não pode ser nulo");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
    }

    public String getNome() {
        return nome;
    }
}
