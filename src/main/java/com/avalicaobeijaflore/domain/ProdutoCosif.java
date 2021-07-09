package com.avalicaobeijaflore.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "PRODUTO_COSIF")
public class ProdutoCosif {

    @Id
    private String cosif;

    @Column(name = "COD_CLASSIFICACAO ")
    private String classificacao;

    @ManyToOne
    @JoinColumn(name = "COD_PRODUTO")
    private Produto produto;

}
