package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Representa uma transação de pagamento realizada.
 * 
 * Obs.: Essa entidade é imutável, qualquer modificação deve gerar uma nova instancia
 */
public abstract class Transacao {

    /**
     * Identificador único da transação
     */
    protected final Long idTransacao;
    /**
     * Valor do pagamento
     */
    protected final BigDecimal valor;
    /**
     * Metodo utilizado para o pagamento
     */
    protected final TipoMetodoPagamento metodoPagamento;
    /**
     * Data que o pagamento foi realizado
     */
    protected final LocalDate dataPagamento;


    
    // ------------------------------------------------------
    // Construtores
    // ------------------------------------------------------
    
    
    
    public Transacao(Long idTransacao, BigDecimal valor, TipoMetodoPagamento metodoPagamento, LocalDate dataPagamento) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        this.dataPagamento = dataPagamento;
    }

    
    
    // ------------------------------------------------------
    // Getters / Setters
    // ------------------------------------------------------
    
    
    
    public Long getIdTransacao() {
        return idTransacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public TipoMetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

}
