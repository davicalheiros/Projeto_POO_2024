public class Menus {
   
    private static int menu_counter=0;

    public static String imprime_cabecalho () {
        return "========== BANCO ==========";
    }

    public static String menu_01 (){
        return
        """
            Opcoes:
            
            1- Criar conta
            2- Exibir conta
            3- Operacoes 
            4- Sair

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

        return "Erro";
    }
}