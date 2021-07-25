package com.avalicao.web;

import com.avalicao.domain.MovimentoManual;
import com.avalicao.domain.MovimentoManualId;
import com.avalicao.domain.dto.MovimentoManualDTO;
import com.avalicao.service.MovimentoManualService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movimento-manual")
public class MovimentoManualController {

    private MovimentoManualService movimentoManualService;

    @GetMapping("/movimentos-manuais")
    public ResponseEntity<List<MovimentoManual>> list() {
        return ResponseEntity.ok(this.movimentoManualService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovimentoManualDTO> buscar(MovimentoManualId id) {
        return ResponseEntity.ok(this.movimentoManualService.buscar(id));
    }

    @PostMapping("")
    public ResponseEntity<MovimentoManualDTO> buscar(@RequestBody MovimentoManualDTO movimentoManualDTO) {
        return ResponseEntity.ok(this.movimentoManualService.salvar(movimentoManualDTO));
    }


}
