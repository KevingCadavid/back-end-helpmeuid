package co.edu.iudigital.app.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name= "casos")
public class Caso implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "fecha_hora")
	private LocalDateTime fechaHora; 
	
	private float latitud;
	
	private float longitud;
	
	private Boolean visible;
	
	private String descripcion;
	
	@Column (name = "url_map")
	private String urlMap;
	
    @Column ( name = "rmi_url")
	private String rmiUrl;

    @ManyToOne
    @JoinColumn (name = "usuarios_id")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn (name = "delitos_id")
    private Delito delito;

    @PrePersist
    public void prePersist () {
    	if(fechaHora ==null) {
    		fechaHora = LocalDateTime.now();
    		
    	}
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlMap() {
		return urlMap;
	}

	public void setUrlMap(String urlMap) {
		this.urlMap = urlMap;
	}

	public String getRmiUrl() {
		return rmiUrl;
	}

	public void setRmiUrl(String rmiUrl) {
		this.rmiUrl = rmiUrl;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Delito getDelito() {
		return delito;
	}

	public void setDelito(Delito delito) {
		this.delito = delito;
	}
    
    

    
}


