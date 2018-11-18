package fatec.poo.model;

/**
 *
 * @author Wesley
 */
public class APrazo {
    private double Valor;
    private String dtVencimento;
    private double TaxaJuros;
    private int qtdeMensalidade;
  

    public void setValor(double valor) {
        this.Valor = valor;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.TaxaJuros = taxaJuros;
    }

    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
    }
    
}
