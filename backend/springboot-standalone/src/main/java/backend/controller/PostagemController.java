package backend.controller;

import java.util.List;

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
}
