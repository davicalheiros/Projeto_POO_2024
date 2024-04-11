//import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        //int indices_array=0;

        Conta conta = new Conta();
        Leitura leitura = new Leitura();
        int opcao = 0;
        //ArrayList <Conta> lista_de_clientes = new ArrayList();

        do {

            System.out.println(Menus.imprime_cabecalho_principal());
            System.out.println(Menus.menu_01());
            
            opcao = Integer.parseInt(leitura.entDados("Insira a opcao desejada ..: "));
            
            switch (opcao) {
            
                case 1:
 
                    Menus.menu_cadastro(conta);
                    leitura.entDados("Pressione uma tecla para retornar ao menu principal.");

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
                    System.out.println(Menus.menu_02(conta));
                    leitura.entDados("Digite uma tecla para retornar ao menu principal.");
                    break;
            
                case 3:

                    do{

                        opcao = Integer.parseInt(leitura.entDados(Menus.menu_03(conta)));
                        
                        switch (opcao) {
                            
                            case 1:
                                conta.setSaldo(conta.getSaldo()+Float.parseFloat(leitura.entDados("Insira o valor a depositar..: ")));
                                leitura.entDados("Deposito realizado com sucesso! Pressione uma tecla para continuar.");
                                break;

                            case 2: 
                                
                                float valor_saque = Float.parseFloat(leitura.entDados("Insira o valor que deseja sacar..: "));
                                
                                if(conta.getLimite_de_saque() < valor_saque) {
                                    leitura.entDados("Nao foi possivel sacar, o valor ultrapassa seu limite de saque");
                                    break;
                                }

                                else if (conta.getSaldo() < valor_saque) {
                                    leitura.entDados("Nao foi possivel sacar, o valor ultrapassa o seu valor em saldo");
                                    break;
                                }   

                                else {
                                    conta.setSaldo(conta.getSaldo()-valor_saque);
                                    conta.setLimite_de_saque(conta.getLimite_de_saque()-valor_saque);
                                    leitura.entDados("Saque realizado com sucesso! Pressione uma tecla para continuar");
                                    break;
                                }
                        
                            case 3:

                                break;
                            
                            case 4:

                                break;

                            case 5:
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
