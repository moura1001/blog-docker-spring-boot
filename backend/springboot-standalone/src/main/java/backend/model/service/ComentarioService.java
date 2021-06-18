package backend.model.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.model.dao.ComentarioRepository;
import backend.model.entity.Comentario;
 
@Service
@Transactional
public class ComentarioService {
 
    @Autowired
    private ComentarioRepository repo;
     
    public List<Comentario> listAllByPostagem(Long postagemId) {
        return repo.findByPostagemId(postagemId);
    }
     
    public void save(Comentario comentario) {
        repo.save(comentario);
    }
     
    public Comentario get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
