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
@Table(name = "CLIENT",
  uniqueConstraints = { @UniqueConstraint(columnNames = { "NumClient" }) })
public class Client {
	private Integer NumClient;
	private String NomClient;
	private String PrenomClient;
	
	public Client() {
	}
	
	public Client(Integer NumClient, String NomClient, String PrenomClient) {
		this.NumClient = NumClient;
		this.NomClient = NomClient;
		this.PrenomClient = PrenomClient;
	}
	
	@Id
	@Column(name = "NumClient")
	public Integer getNumClient() {
	   return NumClient;
	}

	public void setNumClient(Integer NumClient) {
	   this.NumClient = NumClient;
	}
	
	@Column(name = "NomClient", length = 20, nullable = false)
	public String getNomClient() {
	   return NomClient;
	}

	public void setNomClient(String NomClient) {
	   this.NomClient = NomClient;
	}
	
	@Column(name = "PrenomClient", length = 20, nullable = false)
	public String getPrenomClient() {
	   return PrenomClient;
	}

	public void setPrenomClient(String PrenomClient) {
	   this.PrenomClient = PrenomClient;
	}
}

