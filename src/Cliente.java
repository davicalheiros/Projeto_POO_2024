//import java.util.Date;

public class Cliente {

    private String nome_Completo;
    private String cpf;
    private String data_nascimento;
    private String telefone;
    private String email;

    Endereco endereco = new Endereco();

    public String getNome_Completo() {
        return nome_Completo;
    }

    public void setNome_Completo(String nome_Completo) {
        this.nome_Completo = nome_Completo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    

}