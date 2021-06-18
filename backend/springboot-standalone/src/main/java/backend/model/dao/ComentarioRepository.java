package backend.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.model.entity.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    public List<Comentario> findByPostagemId(Long postagemId);
}
