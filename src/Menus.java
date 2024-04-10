public class Menus {
   
    private static int menu_counter = 0;

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

    public static String menu_cadastro() {

        if (menu_counter==0) {
            menu_counter++;
            return """

                ========================================
                Insira o seu Nome Completo..:\s""";
        }
        else if (menu_counter==1) {   
            menu_counter++;
            return """

                ========================================
                Insira o seu CPF..:\s""";
        }
        else if (menu_counter==2) {
            menu_counter++;
            return """

                ========================================
                Insira a data do seu nascimento..:\s""";
        }
        else if (menu_counter==3) {
            menu_counter++;
            return """

                ========================================
                Insira o seu telefone de contato..:\s""";
        }
        else if (menu_counter==4) {
            menu_counter++;
            return """

                ========================================
                Insira o seu e-mail..:\s""";
        }

        return "Cadastro finalizado!";
    }

}