package com.avalicaobeijaflore.web;

import com.avalicaobeijaflore.domain.MovimentoManual;
import com.avalicaobeijaflore.service.MovimentoManualService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movimento-manual")
public class MovimentoManualController {

    private MovimentoManualService movimentoManualService;

    @GetMapping("/{id}")
    public ResponseEntity<MovimentoManual> buscar(Integer id){
        return ResponseEntity.ok(this.movimentoManualService.buscar(id));
    }


}
