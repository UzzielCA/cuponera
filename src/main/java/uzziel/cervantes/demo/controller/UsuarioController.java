package uzziel.cervantes.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import uzziel.cervantes.demo.model.dto.Response;
import uzziel.cervantes.demo.model.dto.UsuarioAltaDto;
import uzziel.cervantes.demo.service.UsuarioBO;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioBO usuarioBO;
	
	@GetMapping( value = "getUsuarios")
	public ResponseEntity<Response> getUsuarios(){
		return ResponseEntity.ok(usuarioBO.getUsuarios());
	}
	
	@PostMapping( value = "addUsuario")
	public ResponseEntity<Response> saveUsuario(UsuarioAltaDto usuario) {
		
		return ResponseEntity.ok(usuarioBO.saveUsuario(usuario));
	}
}
