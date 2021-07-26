package com.avalicao.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimentoManualDTO {
    @NotBlank(message = "Mês deve ser preenchido")
    private Integer datMes;
    @NotBlank(message = "Mês deve ser preenchido")
    private Integer datAno;
    private Long numLancamento;
    private String descricao;
    private LocalDateTime datMovimento;
    private String usuario;
    private BigDecimal valor;
    private ProdutoDTO produto;
    private ProdutoCosifDTO produtoCosif;

}
