//Nome: Silvio Henrique Mendes dos Santos RA:a2618095

public class Principal {
    public static void main(String[] args) {
        Leitura l  = new Leitura();
        Carro c = new Carro();
        Caminhao ca = new Caminhao();
        Moto m = new Moto();
        Funcionario f = new Funcionario();
        int opt, opt1;

        do {
            System.out.println("\t=====MENU=====");
            System.out.println("1- Cadastrar Veiculo");
            System.out.println("2- Abastecer Veiculo");
            System.out.println("3- Verificar troca de oleo");
            System.out.println("4- Cadastrar Funcionario");
            System.out.println("0- Sair");
            opt = Integer.parseInt(l.entDados("Informe a opcao escolhida: "));
                switch (opt) {
                    case 1:
                     do {
                        System.out.println("\t=====Cadastrando Veiculos=====");
                        System.out.println("1- Cadastrar Carro");
                        System.out.println("2- Cadastrar Moto");
                        System.out.println("3- Cadastrar Caminhao");
                        System.out.println("0- Sair");
                        opt1 = Integer.parseInt(l.entDados("Informe a opcao escolhida: "));

                            switch (opt1) {
                                case 1:
                                    Carro cf = new Carro();
                                    c.setModelo(l.entDados("Digite o Modelo do carro: "));
                                    c.setTipoCombustivel(l.entDados("Digite o tipo de Combustivel do carro: "));
                                    c.setTipoOleo(l.entDados("Digite o tipo de Oleo que o carro utiliza: "));
                                    c.setTipoVeiculo(l.entDados("Digite o tipo do veiculo: "));
                                    c.setKmAtual(Integer.parseInt(l.entDados("Informe o KM atual do carro: ")));
                                    c.setKmUltimaTroc(Integer.parseInt(l.entDados("Informe o km da ultima troca de oleo do carro: ")));
                                    c.setQtdCvs(l.entDados("Informe a quantidade de cavalos do carro: "));
                                    c.setCapacTanque(Integer.parseInt(l.entDados("Informe a capacidade de ltiro do tanque de combustivel: ")));
                                    c.cadastrar();
                                    break;
                                case 2:
                                    m.setModelo(l.entDados("Digite o Modelo da Moto: "));
                                    m.setTipoCombustivel(l.entDados("Digite o tipo de Combustivel da Moto: "));
                                    m.setTipoOleo(l.entDados("Digite o tipo de Oleo que a moto utiliza: "));
                                    m.setTipoVeiculo(l.entDados("Digite o tipo do veiculo: "));
                                    m.setKmAtual(Integer.parseInt(l.entDados("Informe o KM atual da moto: ")));
                                    m.setKmUltimaTroc(Integer.parseInt(l.entDados("Informe o km da ultima troca de oleo da moto: ")));
                                    m.setCapacTanque(Integer.parseInt(l.entDados("Informe a capacidade do tanque de combustivel: ")));
                                    m.setCarburador(l.entDados("Informe o Carburador da Moto: "));
                                    m.setCilindrada(l.entDados("Informe a cilidrada que a moto tem: "));
                                    m.cadastrar();
                                    break;
                                      
                                case 3:
                                    ca.setModelo(l.entDados("Digite o Modelo do caminhao: "));
                                    ca.setTipoCombustivel(l.entDados("Digite o tipo de Combustivel do caminhao: "));
                                    ca.setTipoOleo(l.entDados("Digite o tipo de Oleo que o caminhao utiliza: "));
                                    ca.setTipoVeiculo(l.entDados("Digite o tipo do veiculo: "));
                                    ca.setKmAtual(Integer.parseInt(l.entDados("Informe o KM atual do caminhao: ")));
                                    ca.setKmUltimaTroc(Integer.parseInt(l.entDados("Informe o km da ultima troca de oleo do caminhao: ")));
                                    ca.setCapacTanque(Integer.parseInt(l.entDados("Informe a capacidade do tanque de combustivel: ")));
                                    ca.setInjecao((l.entDados("Informe o sistema de injecao do caminhao: ")));
                                    ca.setTipoCarga(l.entDados("Informe o tipo de carga do caminhao: ")); 
                                    break;  
                                    
                                case 0:
                                    break;
                                default: 
                                    System.out.println("Por favor, selecione uma opcao valida");        
                                }
                        }while (opt1 != 0);
                        break;
                

                    case 2:
                     do{
                        System.out.println("\t=====Abastecendo Veiculos=====");
                        System.out.println("1- Abastecer Carro");
                        System.out.println("2- Abastecer Moto");
                        System.out.println("3- Abastecer Caminhao");
                        System.out.println("0- Sair");
                        opt1 = Integer.parseInt(l.entDados("Informe a opcao escolhida: "));

                            switch (opt1) {
                                case 1:
                                        System.out.println("Tipo Combustivel: " + c.getTipoCombustivel());
                                        c.setqtdLitrosComb(Integer.parseInt(l.entDados("Digite a quantidade de litros que deseja abastecer: ")));
                                        c.abastecer();
                                    break;
                                case 2:
                                    System.out.println("Tipo combustivel: " + m.getTipoCombustivel());
                                    c.setqtdLitrosComb(Integer.parseInt(l.entDados("Digite a quantidade de litros que deseja abastecer: ")));
                                    m.abastecer();
                                    break;  
                                    
                                case 3:
                                    System.out.println("Tipo combustivel: " + ca.getTipoCombustivel());
                                    c.setqtdLitrosComb(Integer.parseInt(l.entDados("Digite a quantidade de litros que deseja abastecer: ")));
                                    ca.abastecer();
                                    break;
                                    
                                case 0:
                                    break;    
                                default:
                                System.out.println("Por favor, selecione uma opcao valida");  
                                    break;
                                }   
                        }while (opt1 != 0);
                        break;

                    case 3:
                     do {
                        System.out.println("\t=====Verificar troca de oleo de veiculos=====");
                        System.out.println("1- verificar oleo do Carro");
                        System.out.println("2- verificar oleo da Moto");
                        System.out.println("3- Verificar oleo do Caminhao");
                        System.out.println("0- Sair");
                        opt1 = Integer.parseInt(l.entDados("Informe a opcao escolhida: ")); 
                        
                            switch (opt1) {
                                case 1:
                                    System.out.println("Verificando oleo do carro: ");
                                    System.out.println("KM ultima troca: " + c.getKmUltimaTroc());
                                    System.out.println("KM atual: " + c.getKmAtual());
                                    c.calcProxTrocOleo();
                                    break;
                                case 2:
                                    System.out.println("Verificando oleo da Moto: ");
                                    m.getKmAtual();
                                    m.getKmUltimaTroc();
                                    m.calcProxTrocOleo();
                                    break;
                                case 3: 
                                    System.out.println("Verificando oleo do caminhao: ");
                                    ca.getKmAtual();
                                    ca.getKmUltimaTroc();
                                    ca.calcProxTrocOleo();
                                    break;
                                case 0:
                                    break;    

                                default:
                                System.out.println("Por favor, selecione uma opcao valida"); 
                                    break;
                                }
                        }while (opt1 != 0);
                        break;

                    case 4:
                     do{
                        System.out.println("\t=====Cadastrar Funcionarios=====");
                        System.out.println("1- Cadastrar Funcionario");
                        System.out.println("2- Listar Funcionarios");
                        System.out.println("0- Sair");
                        opt1 = Integer.parseInt(l.entDados("Informe a opcao escolhida: "));
                    
                            switch (opt1) {
                                case 1:
                                    f.setIdFunc(Integer.parseInt(l.entDados("ID: ")));
                                    f.setNome(l.entDados("Nome: "));
                                    break;
                                case 2:
                                    System.out.println("Id Funcionario: " + f.getIdFunc());
                                    System.out.println("Id Funcionario: " + f.getNome());
                                break;

                                case 0:
                                break;
                                default:
                                    System.out.println("Opcao nao encontrada");
                                    break;
                            }
                    }while (opt1 != 0);
                         
                            
                        
                        
                           
                        default:
                        break;
                }
        } while (opt != 0);
        
    }
}