//import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        //int indices_array=0;

        Conta conta1 = new Conta();
        Leitura leitura = new Leitura();
        int opcao = 0;
        //ArrayList <Conta> lista_de_clientes = new ArrayList();

        do {

            System.out.println(Menus.imprime_cabecalho_principal());
            System.out.println(Menus.menu_01());
            
            opcao = Integer.parseInt(leitura.entDados("Insira a opcao desejada ..: "));
            
            switch (opcao) {
            
                case 1:
 
                    conta1.cliente.setNome_Completo(leitura.entDados(Menus.menu_cadastro()));
                    conta1.cliente.setCpf(leitura.entDados(Menus.menu_cadastro()));
                    conta1.cliente.setData_nascimento(leitura.entDados(Menus.menu_cadastro()));
                    conta1.cliente.setTelefone(leitura.entDados(Menus.menu_cadastro()));
                    conta1.cliente.setEmail(leitura.entDados(Menus.menu_cadastro()));
                    leitura.entDados("""
                        
                    Pressione uma tecla para retornar ao menu principal.
                    """);

                    //lista_de_clientes.add(new Conta());
                    break;
                case 2:
/*                  
                    indices_array = lista_de_clientes.size();
                    String msg_aviso = 
                    """
                        Ha %d contas registradas, insira o indice da conta desejada...: 
                    """;
                    System.out.println(msg_aviso.formatted(indices_array));
                    break;
*/
                    System.out.println(Menus.menu_02(conta1));
                    leitura.entDados("Digite uma tecla para retornar ao menu principal.");
                    break;
            
                case 3:

                    do{

                        opcao = Integer.parseInt(leitura.entDados(Menus.menu_03(conta1)));
                        
                        switch (opcao) {
                            
                            case 1:
                                conta1.setSaldo(conta1.getSaldo()+Float.parseFloat(leitura.entDados("Insira o valor a depositar..: ")));
                                leitura.entDados("Deposito realizado com sucesso! Pressione uma tecla para continuar");
                                break;

                            case 2: 
                                conta1.setSaldo(conta1.getSaldo()+Float.parseFloat(leitura.entDados("")));
                                break;
                        
                            default:
                                break;
                        }
                    }
                    
                    while (opcao!=4);
               
                case 4:
                    ;
                default:
                    ;
            }   
        }      
        while (opcao!=4);
    }
}
