//Nome: Silvio Henrique Mendes dos Santos RA:a2618095

public abstract class Veiculo {
    private String modelo;
    private String tipoVeiculo;
    private String tipoCombustivel;
    private int capacTanque;
    private int kmAtual;
    private int kmUltimaTroc;
    private int qtdLitrosComb;
    private String tipoOleo;



    public Veiculo(){
        modelo = "";
        tipoVeiculo = "";
        tipoCombustivel = "";
        capacTanque = 0;
        kmAtual = 0;
        kmUltimaTroc = 0;
        qtdLitrosComb = 0;
        tipoOleo = "";
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getTipoVeiculo(){
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo){
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getTipoCombustivel(){
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getCapacTanque(){
        return capacTanque;
    }

    public void setCapacTanque(int capacTanque){
        this.capacTanque = capacTanque;
    }

    public int getKmAtual(){
        return kmAtual;
    }

    public void setKmAtual(int kmAtual){
        this.kmAtual = kmAtual;
    }

    public int getKmUltimaTroc(){
        return kmUltimaTroc;
    }

    public void setKmUltimaTroc(int kmUltimaTroc){
        this.kmUltimaTroc = kmUltimaTroc;
    }

    public int getqtdLitrosComb(){
        return qtdLitrosComb;
    }

    public void setqtdLitrosComb(int qtdLitrosComb){
        this.qtdLitrosComb = qtdLitrosComb;
    }

    public String getTipoOleo(){
        return tipoOleo;
    }

    public void setTipoOleo(String tipoOleo){
        this.tipoOleo = tipoOleo;
    }

    abstract void abastecer();
    abstract void cadastrar();


}

