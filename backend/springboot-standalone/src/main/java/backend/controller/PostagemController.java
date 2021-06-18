package backend.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

import backend.model.entity.Postagem;
import backend.model.service.PostagemService;

@RestController
public class PostagemController {
	
	@Autowired
    private PostagemService service;
     
    @GetMapping("/api/Postagens")
	public List<Postagem> list() {
	    return service.listAll();
	}

	@GetMapping("/api/Postagens/{id}")
	public ResponseEntity<Postagem> get(@PathVariable Long id) {
		try {
			Postagem postagem = service.get(id);
			return new ResponseEntity<Postagem>(postagem, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Postagem>(HttpStatus.NOT_FOUND);
		}      
	}
}
