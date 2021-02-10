package aed.examen.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/* Alexis Francisco Díaz Fajardo */

@Entity
@Table(name = "titulaciones")
public class Titulaciones {
	
	@Id
	@Column(name="codTit", columnDefinition="int(11)")
	private int CodTit;
	
	@Column(name="nombre", columnDefinition="varchar(100)")
	private String nombre;
	
	@Column(name="nivel", columnDefinition="char(1)")
	private char nivel;
	
	@OneToMany(cascade=CascadeType.ALL,
	fetch=FetchType.EAGER, mappedBy="CodTit")
	private List<Graduados> graduados = new ArrayList<Graduados>();
	
	public Titulaciones() {}

	public int getCodTit() {
		return CodTit;
	}

	public void setCodTit(int codTit) {
		CodTit = codTit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getNivel() {
		return nivel;
	}

	public void setNivel(char nivel) {
		this.nivel = nivel;
	}
	
	

}
