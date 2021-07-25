package com.avalicao.domain;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class MovimentoManualId implements Serializable {

    private Integer datMes;

    private Integer datAno;

    private Long numLancamento;
}