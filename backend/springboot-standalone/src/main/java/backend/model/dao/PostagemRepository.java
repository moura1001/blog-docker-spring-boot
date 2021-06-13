package backend.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.model.entity.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
