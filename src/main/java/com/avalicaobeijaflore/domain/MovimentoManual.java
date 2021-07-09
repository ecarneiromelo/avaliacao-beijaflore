package com.avalicaobeijaflore.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@Table(name="MOVIMENTO_MANUAL")
public class MovimentoManual {

    private Integer datMes;

    @Column()
    private Integer datAno;

    @Column()
    private Long numLancamento;

    @Column()
    private String descricao;

    @Column()
    private Timestamp datMovimento;

    @Column()
    private String usuario;

    @Column()
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "COD_PRODUTO")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "COD_COSIF")
    private ProdutoCosif produtoCosif;


}
