//Nome: Silvio Henrique Mendes dos Santos RA:a2618095

public class Caminhao extends Veiculo implements Calc{
    private String tipoCarga;
    private String injecao;
    

    public Caminhao(){
        super();
        tipoCarga = "";
        injecao = "";
    }

    public String getTipoCarga(){
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga){
        this.tipoCarga = tipoCarga;
    }

    public String getInjecao(){
        return injecao;
    }

    public void setInjecao(String injecao){
        this.injecao = injecao;
    }

    public void cadastrar(){
        System.out.println("Caminhao cadastrado \n");
    }

    public void abastecer(){
        if(getTipoCombustivel().equalsIgnoreCase("Diesel")){
            double r1 = getqtdLitrosComb() * 6.05;
            System.out.println("O valor do abastecimento resultou em" + r1 + "R$");
        }else if(getTipoCombustivel().equalsIgnoreCase("Gasolina")) {
           double r1 = getqtdLitrosComb() * 6.30;
            System.out.println("O valor do abastecimento resultou em" + r1 + "R$");
        }else if(getTipoCombustivel().equalsIgnoreCase("Etanol")){
           double r1 = getqtdLitrosComb() * 4.31;
            System.out.println("O valor do abastecimento resultou em" + r1 + "R$");
        }else{
            System.out.println("Combustivel não encontrado");
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
        }
    }

}
