package backend.model.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.model.dao.PostagemRepository;
import backend.model.entity.Postagem;
 
@Service
@Transactional
public class PostagemService {
 
    @Autowired
    private PostagemRepository repo;
     
    public List<Postagem> listAll() {
        return repo.findAll();
    }
     
    public void save(Postagem postagem) {
        repo.save(postagem);
    }
     
    public Postagem get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
