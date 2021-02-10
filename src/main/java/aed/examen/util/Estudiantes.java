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
@Table(name = "estudiantes")
public class Estudiantes {
	
	@Id
	@Column(name="dni", columnDefinition="char(10)")
	private String DNI;
	
	@Column(name="nombre", columnDefinition="varchar(20)")
	private String nombre;
	
	@Column(name="telefono", columnDefinition="varchar(12)")
	private String telefono;
	
	@OneToMany(cascade=CascadeType.ALL,
	fetch=FetchType.EAGER, mappedBy="DNI")
	private List<Graduados> graduados = new ArrayList<Graduados>();
	
	public Estudiantes() {}
	
	public Estudiantes(String DNI, String nombre, String telefono) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
