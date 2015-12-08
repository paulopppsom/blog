package paulo.controllers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import paulo.persistence.JPAUtil;
import paulo.entities.Paulo; 

@ViewScoped
@ManagedBean
public class PauloBean implements Serializable{
	
	private static final long serialVersionUID =1L;
	private Paulo paulo;
	private List<Paulo> paulos;
	
	@PostConstruct
	public void init(){
		paulo = new Paulo();
	}
	
	public String salvar(Paulo paulo){
		EntityManager em = JPAUtil.getEntityManager();
		em.persist(paulo);
		
		return "principal";
	}
	
	public List<Paulo> getPaulos() {
		if (paulos == null) {
			paulos = JPAUtil.getEntityManager().createQuery("select p from Paulo p", Paulo.class).getResultList();
		}
		return paulos;
		}
	
	
	public Paulo getPaulo() {
		return paulo;
	}
	public void setPaulo(Paulo paulo) {
		this.paulo = paulo;
	}


}
