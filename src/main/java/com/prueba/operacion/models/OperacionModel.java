package com.prueba.operacion.models;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "operacion")
public class OperacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String plataforma;
    private String evento;
    private Integer cantidad;
    private Double valor;
    private Double costo;
    @Temporal(TemporalType.DATE)
    private Calendar fecha;
    
    private OperacionModel() {
    	Calendar today = Calendar.getInstance();
		setFecha(today);
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double valor) {
		this.costo = getCantidad()*valor;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		setCosto(valor);
		this.valor = valor;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
}