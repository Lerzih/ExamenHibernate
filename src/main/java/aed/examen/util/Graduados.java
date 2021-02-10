package aed.examen.util;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/* Alexis Francisco Díaz Fajardo */

@Entity
@Table(name = "graduados")
public class Graduados {
	
	@Id
	@Column(name="codGrad", columnDefinition="int(11)")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CodGrad;
	
	@ManyToOne(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	@JoinColumn(name="codTit")
	private int CodTit;
	
	@ManyToOne(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	@JoinColumn(name="DNI")
	private String DNI;
	
	@Column(name="fecha", columnDefinition="date")
	private Date fecha;
	
	@Column(name="nota", columnDefinition="decimal")
	private double nota;
	
	public Graduados() {}

	public int getCodGrad() {
		return CodGrad;
	}

	public void setCodGrad(int codGrad) {
		CodGrad = codGrad;
	}

	public int getCodTit() {
		return CodTit;
	}

	public void setCodTit(int codTit) {
		CodTit = codTit;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
