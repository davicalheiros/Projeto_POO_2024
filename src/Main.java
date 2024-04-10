//import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        //int indices_array=0;

        Leitura leitura = new Leitura();
        //ArrayList <Conta> lista_de_clientes = new ArrayList();

        System.out.println(Menus.imprime_cabecalho());
        System.out.println(Menus.menu_01());
        
        int opcao = Integer.parseInt(leitura.entDados("Insira a opcao desejada ..: "));

        switch (opcao) {
            
            case 1:
                Conta conta1 = new Conta();
                conta1.cliente.setNome_Completo(leitura.entDados(Menus.menu_cadastro()));
                conta1.cliente.setCpf(leitura.entDados(Menus.menu_cadastro()));
                conta1.cliente.setData_nascimento(leitura.entDados(Menus.menu_cadastro()));
                conta1.cliente.setTelefone(leitura.entDados(Menus.menu_cadastro()));
                conta1.cliente.setEmail(leitura.entDados(Menus.menu_cadastro()));

                System.out.println(conta1.cliente.getNome_Completo());
                System.out.println(conta1.cliente.getCpf());
                System.out.println(conta1.cliente.getData_nascimento());
                System.out.println(conta1.cliente.getTelefone());
                System.out.println(conta1.cliente.getEmail());
            
                //lista_de_clientes.add(new Conta());
                break;
            case 2:
/*              indices_array = lista_de_clientes.size();
                String msg_aviso = 
                """
                    Ha %d contas registradas, insira o indice da conta desejada...: 
                """;
                System.out.println(msg_aviso.formatted(indices_array));
                break;
*/
            case 3:
                ;
               
            case 4:
                break;
        }   

    }
}
