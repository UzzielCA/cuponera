package uzziel.cervantes.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uzziel.cervantes.demo.dao.UsuarioDAO;
import uzziel.cervantes.demo.model.Usuario;
import uzziel.cervantes.demo.model.dto.Response;
import uzziel.cervantes.demo.model.dto.UsuarioAltaDto;
import uzziel.cervantes.demo.model.dto.UsuarioDto;

@Service
public class UsuarioBO {

	@Autowired
	private UsuarioDAO usuarioDao;
	
	public Response getUsuarios(){
		
		List<UsuarioDto> usuariosDTO = new ArrayList<>();
		
		for (Usuario usuario : usuarioDao.getUsuarios()) {
			
			UsuarioDto usuarioDto = new UsuarioDto(usuario.getNombre(),
													usuario.getApellido(), 
													usuario.getCorreo(), 
													usuario.getPassword());
			
			if (ObjectUtils.notEqual(usuario.getUsuarioReferenciado(), null)) {
				Usuario referenciado = usuarioDao.getUsuario(usuario.getUsuarioReferenciado());
				
				UsuarioDto referencia = new UsuarioDto(referenciado.getNombre(), 
														referenciado.getApellido(),
														referenciado.getCorreo(),
														referenciado.getPassword());
				
				usuarioDto.setReferencia(referencia);
			}
			
			usuariosDTO.add(usuarioDto);

		}
		return Response.ok(usuariosDTO, "").build();
	}
	
	public Response saveUsuario(UsuarioAltaDto dto) {
		try {
			
			Usuario usuario = new Usuario();
			usuario.setNombre(dto.getNombre());
			usuario.setApellido(dto.getApellido());
			usuario.setCorreo(dto.getCorreo());
			usuario.setPassword(dto.getPassword());
			usuario.setUsuarioReferenciado(dto.getReferencia());
			
			usuarioDao.saveUsuario(usuario);
			
			return Response.ok(null, "Operación exitosa").build();
		} catch (Exception e) {
			return Response.error(500, "Error al procesar la petición").build();
		}
		
	}
}
