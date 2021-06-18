package backend.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

import backend.model.entity.Comentario;
import backend.model.service.ComentarioService;

@RestController
public class ComentarioController {
	
	@Autowired
    private ComentarioService service;

	@GetMapping("/api/Comentarios/{postagemId}")
	public ResponseEntity<List<Comentario>> get(@PathVariable Long postagemId) {
		try {
			List<Comentario> comentarios = service.listAllByPostagem(postagemId);
			return new ResponseEntity<List<Comentario>>(comentarios, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<List<Comentario>>(HttpStatus.NOT_FOUND);
		}      
	}
}
