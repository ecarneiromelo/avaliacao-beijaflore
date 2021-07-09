package com.avalicaobeijaflore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    private String id;

    @Column
    private String descricao;

    @Column
    private String status;

}
