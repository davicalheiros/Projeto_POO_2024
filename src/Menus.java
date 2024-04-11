public class Menus {

    static Leitura leitura = new Leitura();

    public static String imprime_cabecalho_principal () {
        return """

        ========== BANCO ==========
        """;
    }

    public static String menu_01 (){
        return
        """
            Opcoes:
            
            1- Criar conta
            2- Exibir dados cadastrais da conta
            3- Operacoes 
            4- Sair

        """; 
    }

    public static String menu_02 (Conta conta) {
        return """

        =============== DADOS CADASTRAIS ===============
        Nome do titular    : %s
        CPF do titular     : %s
        Data de nascimento : %s
        Telefone           : %s
        E-mail             : %s
        ================================================
        """.formatted(conta.cliente.getNome_Completo(),conta.cliente.getCpf(),conta.cliente.getData_nascimento(),conta.cliente.getTelefone(),conta.cliente.getEmail());
    }

    public static String menu_03 (Conta conta) {
        return """

            =============== OPERACOES ===============
            Saldo.............: %.2f
            Limite de saque...: %.2f

            1 - Deposito
            2 - Saque
            3 - Transferencia
            4 - Emprestimo
            5 - Retornar
            =========================================
        """.formatted(conta.getSaldo(),conta.getLimite_de_saque());
    }

    public static String menu_03_deposito () {
        return """
            
            =============== DEPOSITO ===============
            Insira o valor a depositar..: \s""";
    }

    public static String menu_04_transferencia () {
        return """

            =========== TRANSFERENCIA ===========
            Insira o valor da transferencia..: \s;
        """;
    }

    public static void menu_cadastro(Conta conta) {

        imprime_cabecalho_principal();
        conta.cliente.setNome_Completo(leitura.entDados("Insira o seu nome completo..: \s"));
        conta.cliente.setCpf(leitura.entDados("Insira o seu cpf..: \s"));
        conta.cliente.setData_nascimento(leitura.entDados("Insira a data do seu nascimento..: \s"));
        conta.cliente.setEmail(leitura.entDados("Insira o seu e-mail..: \s"));
        conta.cliente.setTelefone(leitura.entDados("Insira o seu telefone..: \s"));
        System.out.println("Cadastro realizado com sucesso!");

    }
}