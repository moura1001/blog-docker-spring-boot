package backend.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="\"Comentarios\"")
public class Comentario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"Id\"")
	public Long id;
	
	//public Postagem postagem;
	@NotNull
	@Column(name = "\"PostagemId\"")
    public Long postagemId;
	
	@NotNull
	@Column(name = "\"Conteudo\"", length = 128)
    public String conteudo;
	
	@NotNull
	@Column(name = "\"Autor\"", length = 16)
    public String autor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public long getPostagemId() {
		return postagemId;
	}
	public void setPostagemId(long postagemId) {
		this.postagemId = postagemId;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}	    

}
