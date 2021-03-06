package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique;


import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * Especifica uma transação de pagamento que ocorreu por cartão.
 * 
 * Obs.: Essa entidade é imutável, qualquer modificação deve gerar uma nova instancia
 */
public class TransacaoCartao extends Transacao {
    
    /**
     * Número impresso no cartão
     */
    private final String numeroCartao;
    /**
     * Nome do cartão
     */
    private final String nomeDoCartao;
    /**
     * Validade do cartão
     */
    private final LocalDate validade;
    /**
     * Código de segurança do cartão
     */
    private final String cvv;

    

    // ------------------------------------------------------
    // Construtores
    // ------------------------------------------------------
    
    
    
    public TransacaoCartao(Long idTransacao, BigDecimal valor, TipoMetodoPagamento metodoPagamento, LocalDate dataPagamento, String numeroCartao, String nomeDoCartao, LocalDate validade, String cvv) {
        super(idTransacao, valor, metodoPagamento, dataPagamento);
        this.numeroCartao = numeroCartao;
        this.nomeDoCartao = nomeDoCartao;
        this.validade = validade;
        this.cvv = cvv;
    }

    

    // ------------------------------------------------------
    // Getters / Setters
    // ------------------------------------------------------
    
    

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeDoCartao() {
        return nomeDoCartao;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public String getCvv() {
        return cvv;
    }
}
