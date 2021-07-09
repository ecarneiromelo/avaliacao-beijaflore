package com.avalicaobeijaflore.repository;

import com.avalicaobeijaflore.domain.MovimentoManual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoManualRepository extends JpaRepository<MovimentoManual, Integer > {
}
