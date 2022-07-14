package com.logus.springrestfulapipostgresql;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cadusuarios")

public class cadusuariosController {
	
	
	@Autowired
	cadusuariosRepository cadusuariosrepository;
	
	@GetMapping("/get-all-usuarios")
	public List<cadusuariosEntity> getAllUsuarios(){
			List<cadusuariosEntity> allUsuarioslist = cadusuariosrepository.findAll();
			return allUsuarioslist;
		
	}
	
	@GetMapping("/get-usuarios/{id}")
	public cadusuariosEntity getUsuariosId(@PathVariable(value = "id") Integer idcadusuario)
      
	{
		cadusuariosEntity usuariosentity = cadusuariosrepository.findById(idcadusuario).get();
		
		return usuariosentity;	
	}
	
    @PostMapping("/create-usuarios")
    public cadusuariosEntity createUsuario(@RequestBody cadusuariosEntity usuarios) {
       
    	 cadusuariosEntity savedUsuarios = cadusuariosrepository.save(usuarios);
    	 
    	 return savedUsuarios;
    }
    
    @PutMapping("/update-/{id}")
    public ResponseEntity<cadusuariosEntity> updateUsuario(@PathVariable(value = "id") Integer idcadusuario,
         @RequestBody cadusuariosEntity usuariosDetails) {
        cadusuariosEntity usuarios = cadusuariosrepository.findById(idcadusuario).get();

        usuarios.setId(usuariosDetails.getIdCadusuario());
        usuarios.setDcrUsuario(usuariosDetails.getDcrUsuario());
        usuarios.setDcrLogin(usuariosDetails.getDcrLogin());
        usuarios.setDcrSenha(usuariosDetails.getDcrSenha()); 
        usuarios.setDatDesativacao(usuariosDetails.getDatDesativacao());
        usuarios.setDatCadastro(usuariosDetails.getDatCadastro());
       
        final cadusuariosEntity updatedUsuario = cadusuariosrepository.save(usuarios);
        return ResponseEntity.ok(updatedUsuario);
    }
    
    @DeleteMapping("/delete-usuarios/{id}")
    public Map<String, Boolean> deleteUsuario(@PathVariable(value = "id") Integer idcadusuario)
    {
     cadusuariosEntity usuarios = cadusuariosrepository.findById(idcadusuario).get();

        cadusuariosrepository.delete(usuarios);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}