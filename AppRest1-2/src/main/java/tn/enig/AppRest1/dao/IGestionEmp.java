package tn.enig.AppRest1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.enig.AppRest1.model.Employe;
@Repository
public interface IGestionEmp extends JpaRepository<Employe,Integer> {
	@Query("select e from Employe e where e.dpt.id=:x")
	public List<Employe> findByDept(@Param("x") int idDpt);



}
