package com.avalicao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @Column(name = "COD_PRODUTO")
    private String id;

    @Column(name = "DES_PRODUTO")
    private String descricao;

    @Column(name = "STA_STATUS")
    private String status;

}
