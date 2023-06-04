package tn.enig.AppRest1.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.AppRest1.dao.IGestionDept;
import tn.enig.AppRest1.dao.IGestionEmp;
import tn.enig.AppRest1.model.Departement;
import tn.enig.AppRest1.model.Employe;

@RestController
public class AppRest {
	@Autowired
	IGestionDept daodpt;
	@Autowired 
	IGestionEmp daoEmp;
public void setDaoEmp(IGestionEmp dao) {
	this.daoEmp = dao;
}
public void setDaoDpt(IGestionDept dao) {
	this.daodpt = dao;
}
@GetMapping("/employes") 
public List<Employe>f1(){
	return daoEmp.findAll();
	
}
@GetMapping("/departements") 
public List<Departement>f2(){
	return daodpt.findAll();
}






@GetMapping("/employe/{id}" )
public String f2 (Model m,@PathVariable("id") int id) {
	List<Employe> lee=daoEmp.findByDept(id);
	
	m.addAttribute("lee", lee);
	
	return "matieres";
	}
@GetMapping("/employe1/{id}" )
public String f3 (Model m,@PathVariable("id") int id) {
	Optional<Employe> e=daoEmp.findById(id);
	
	m.addAttribute("e", e);
	
	return "employe";
	}


//*@PostMapping(Modee)

}
