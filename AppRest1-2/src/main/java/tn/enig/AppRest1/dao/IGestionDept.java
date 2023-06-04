package tn.enig.AppRest1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.enig.AppRest1.model.Departement;
import tn.enig.AppRest1.model.Employe;

@Repository
public interface IGestionDept extends JpaRepository<Departement,Integer>{
	

}
