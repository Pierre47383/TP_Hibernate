package org.planning.HibernateTutorial;

//import java.util.HashSet;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PRODUIT",
  uniqueConstraints = { @UniqueConstraint(columnNames = { "IdProduit" }) })
public class Produit {
	private Integer IdProduit;
	private Integer Prix;
	private String NomProduit;
	public Produit() {
	}
	
	public Produit(Integer IdProduit, Integer Prix, String NomProduit) {
		this.IdProduit = IdProduit;
		this.Prix = Prix;
		this.NomProduit = NomProduit;
	}
	
	@Id
	@Column(name = "IdProduit")
	public Integer getIdProduit() {
	   return IdProduit;
	}

	public void setIdProduit(Integer IdProduit) {
	   this.IdProduit = IdProduit;
	}
	
	@Column(name = "Prix")
	public Integer getPrix() {
	   return Prix;
	}

	public void setPrix(Integer Prix) {
	   this.Prix = Prix;
	}
	
	@Column(name = "NomProduit", length = 20, nullable = false)
	public String getNomProduit() {
	   return NomProduit;
	}

	public void setNomProduit(String NomProduit) {
	   this.NomProduit = NomProduit;
	}
	
}

