package br.gov.sp.etecsebrae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etecsebrae.entity.IntencaoEntity;

@Repository
public interface IntencaoRepository extends JpaRepository<IntencaoEntity, Integer> {

}
