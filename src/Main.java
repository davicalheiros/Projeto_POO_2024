//import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        //int indices_array=0;

        Conta conta1 = new Conta();

        Leitura leitura = new Leitura();
        //ArrayList <Conta> lista_de_clientes = new ArrayList();

        System.out.println(Menus.imprime_cabecalho_principal());
        System.out.println(Menus.menu_01());
        
        int opcao = Integer.parseInt(leitura.entDados("Insira a opcao desejada ..: "));

        do { 
            switch (opcao) {
            
                case 1:
 
                    conta1.cliente.setNome_Completo(leitura.entDados(Menus.menu_cadastro()));
                    conta1.cliente.setCpf(leitura.entDados(Menus.menu_cadastro()));
                    conta1.cliente.setData_nascimento(leitura.entDados(Menus.menu_cadastro()));
                    conta1.cliente.setTelefone(leitura.entDados(Menus.menu_cadastro()));
                    conta1.cliente.setEmail(leitura.entDados(Menus.menu_cadastro()));

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
            
                case 3:
                    ;
               
                case 4:
                    ;
                default:
                    ;
            }   
        }      
        while (opcao!=4);
    }
}
