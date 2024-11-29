//Nome: Silvio Henrique Mendes dos Santos RA:a2618095

public class Carro extends Veiculo {
    private String qtdCv;
    private String tipoVeiculo;

    public Carro(){
        super();
        qtdCv = "";
        tipoVeiculo = "";
    }


    public String getQtdCv(){
        return qtdCv;
    }

    public void setQtdCvs(String qtdCv) {
        this.qtdCv = qtdCv;
    }

    public String getTipoVeiculo(){
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void cadastrar(){
        System.out.println("Carro cadastrado\n");
    }

    public void abastecer(){
        if(this.getTipoCombustivel().equalsIgnoreCase("Gasolina")){
           double r1 = getqtdLitrosComb() * 6.30;
            System.out.println("Valor do abastecimento: " + r1 + "R$");
        }else if(getTipoCombustivel().equalsIgnoreCase("Etanol")) {
           double r1 = getqtdLitrosComb() * 4.31;
            System.out.println("Valor do abastecimento: " + r1+ "R$");
        }else if(getTipoCombustivel().equalsIgnoreCase("Diesel")){
           double r1 = getqtdLitrosComb() * 6.05;
            System.out.println("Valor do abastecimento: " + r1+ "R$");
        }else{
            System.out.println("Nao foi possivel encontrar nenhum combustivel");
        }
    }

    public void calcProxTrocOleo(){
        if(getKmAtual() > getKmUltimaTroc()){
            double diferenca = getKmAtual() - getKmUltimaTroc();
            if (diferenca > 10000) {
                System.out.println("O oleo do seu veiculo precisa ser trocado.\n");
            } else{
                System.out.println("O oleo de seu veiculo ainda nao precisa ser trocado\n");
            }
        }
    }

}
