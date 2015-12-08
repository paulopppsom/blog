package paulo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paulo")
public class Paulo implements Serializable {
	
	private static final long serialVersionUID =1L;
	
	@Id @GeneratedValue
	private Long id;
	@Column(nullable =false)
	private String nome;
	@Column(nullable = false)
	private String comentario;
	
	public Paulo (){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Paulo [id=" + id + ", nome=" + nome + ", comentario="
				+ comentario + "]";
	}

	public Paulo(Long id, String nome, String comentario) {
		super();
		this.id = id;
		this.nome = nome;
		this.comentario = comentario;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Paulo))
			return false;
		Paulo other = (Paulo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
