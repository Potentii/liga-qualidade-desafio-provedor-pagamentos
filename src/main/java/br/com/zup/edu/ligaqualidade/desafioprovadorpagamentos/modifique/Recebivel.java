package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Representa o que de fato o beneficiário (recebedor) do pagamento irá receber.
 * 
 * Obs.: Essa entidade é imutável, qualquer modificação deve gerar uma nova instancia
 */
public class Recebivel {

    /**
     * Transação de pagamento que gerou esse recebível
     */
    private final Transacao transacao;
    /**
     * Situação atual deste recebível
     */
    private TipoStatusRecebivel status;
    /**
     * Valor final liquido que o beneficiário deve receber, apos todas as taxas serem deduzidas
     */
    private BigDecimal valorAReceber;
    /**
     * Data que o beneficiário irá receber
     */
    private LocalDate dataRecebimento;


    
    // ------------------------------------------------------
    // Construtores
    // ------------------------------------------------------
    
    
    
    public Recebivel(Transacao transacao, TipoStatusRecebivel status, BigDecimal valorAReceber, LocalDate dataRecebimento) {
        this.transacao = transacao;
        this.status = status;
        this.valorAReceber = valorAReceber;
        this.dataRecebimento = dataRecebimento;
    }


    
    // ------------------------------------------------------
    // Métodos internos
    // ------------------------------------------------------

    

    /**
     * Cria um clone superficial (sem clonar os atributos) desta entidade
     * @return A entidade clonada
     */
    private Recebivel shallowClone(){
        return new Recebivel(transacao, status, valorAReceber, dataRecebimento);
    }



    // ------------------------------------------------------
    // Getters / Setters
    // ------------------------------------------------------



    public Transacao getTransacao() {
        return transacao;
    }
    
    public TipoStatusRecebivel getStatus() {
        return status;
    }

    public Recebivel withStatus(TipoStatusRecebivel status) {
        Recebivel recebivel = shallowClone();
        recebivel.status = status;
        return recebivel;
    }

    public BigDecimal getValorAReceber() {
        return valorAReceber;
    }

    public Recebivel withValorAReceber(BigDecimal valorAReceber) {
        Recebivel recebivel = shallowClone();
        recebivel.valorAReceber = valorAReceber;
        return recebivel;
    }

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public Recebivel withDataRecebimento(LocalDate dataRecebimento) {
        Recebivel recebivel = shallowClone();
        recebivel.dataRecebimento = dataRecebimento;
        return recebivel;
    }

}
