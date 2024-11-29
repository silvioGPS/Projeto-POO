//Nome: Silvio Henrique Mendes dos Santos RA:a2618095

public class Moto extends Veiculo implements Calc{
    private String qtdCilindrada;
    private String tipoCarburador;

    public Moto(){
        super();
        qtdCilindrada = "";
        tipoCarburador = "";
    }

    public String getCilindrada(){
        return qtdCilindrada;
    }

    public void setCilindrada(String qtdCilindrada){
        this.qtdCilindrada = qtdCilindrada;
    }

    public String getCarburador(){
        return tipoCarburador;
    }

    public void setCarburador(String tipoCarburador){
        this.tipoCarburador = tipoCarburador;
    }


    public void cadastrar(){
        System.out.println("Moto cadastrada");
    }


    public void abastecer(){
        if(getTipoCombustivel().equalsIgnoreCase("Gasolina")){
            double r1 = getqtdLitrosComb() * 6.10;
            System.out.println("O valor total resultou em" + r1 + "R$");
        }else if(getTipoCombustivel().equalsIgnoreCase("Gasolina Aditivada")) {
            double r1 = getqtdLitrosComb() * 6.50;
            System.out.println("O valor total resultou em" + r1 + "R$");
        }else if(getTipoCombustivel().equalsIgnoreCase("Etanol")){
            double r1 = getqtdLitrosComb() * 4.31;
            System.out.println("O valor total resultou em" + r1 + "R$");
        }else{
            System.out.println("Nao foi possivel encontrar nenhum combustivel");
        }
    
       
                
    }
    public void calcProxTrocOleo(){
        if(getKmAtual() > getKmUltimaTroc()){
            double diferenca = getKmAtual() - getKmUltimaTroc();
            if (diferenca > 10000) {
                System.out.println("O oleo do seu veiculo precisa ser trocado.");
            } else{
                System.out.println("O oleo de seu veiculo ainda nao precisa ser trocado");
            }
        }else{
            System.out.println("A quilometragem atual foi menor ou igual a quilometragem da ultima troca.");
        }
    }
}
