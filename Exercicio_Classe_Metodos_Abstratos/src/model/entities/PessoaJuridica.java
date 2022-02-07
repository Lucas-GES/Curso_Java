package src.model.entities;

public class PessoaJuridica extends Pessoa{

    private Integer numero_de_funcionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numero_de_funcionarios) {
        super(name, rendaAnual);
        this.numero_de_funcionarios = numero_de_funcionarios;
    }

    public Integer getNumero_de_funcionarios() {
        return numero_de_funcionarios;
    }

    public void setNumero_de_funcionarios(Integer numero_de_funcionarios) {
        this.numero_de_funcionarios = numero_de_funcionarios;
    }

    @Override
    public double imposto() {
        double impostoTotal = 0.0;
        if(numero_de_funcionarios > 10){
            impostoTotal = getRendaAnual() * 0.14;
        }else{
            impostoTotal = getRendaAnual() * 0.16;
        }

        return impostoTotal;
    }
}
