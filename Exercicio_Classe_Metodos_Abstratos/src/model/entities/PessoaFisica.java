package src.model.entities;

public class PessoaFisica extends Pessoa{

    private Double gastoComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastoComSaude) {
        super(name, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void gastoComSaude(Double gasto){
        gastoComSaude += gasto;
    }

    @Override
    public double imposto() {
        double impostoTotal = 0.0;
        if(getRendaAnual() < 20000.00){
            impostoTotal = getRendaAnual() * 0.15;
        }else{
            impostoTotal = getRendaAnual() * 0.25;
        }
        if(gastoComSaude > 0){
            impostoTotal -= gastoComSaude * 0.5;
        }

        return impostoTotal;
    }
}
