package com.avalicaobeijaflore.service;

import com.avalicaobeijaflore.domain.MovimentoManual;
import com.avalicaobeijaflore.repository.MovimentoManualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentoManualService {

    @Autowired
    private MovimentoManualRepository movimentoManualRepository;

    public MovimentoManual buscar(Integer id){
        return this.movimentoManualRepository.getById(id);
    }

}
