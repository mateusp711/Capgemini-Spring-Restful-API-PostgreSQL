package com.logus.springrestfulapipostgresql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="cadusuarios")
public class cadusuariosEntity {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer idcadusuario;
	  
	  @Column(name = "dcr_usuario", nullable = false)
	    private String dcrUsuario;
	    
	    @Column(name = "dcr_login", nullable = false)
	    private String dcrLogin;
	    
	    @Column(name = "dcr_senha", nullable = false)
	    private String dcrSenha;
	    
	    @Column(name = "dat_desativacao", nullable = false)
	    private String datDesativacao;
	    
	    @Column(name = "dat_cadastro", nullable = false)
	    private String datCadastro;
	    
	 
	    public cadusuariosEntity() {
	    }
		 
	    public cadusuariosEntity(String dcrUsuario, String dcrLogin, String dcrSenha,String datDesativacao, String datCadastro) {
	         this.dcrUsuario = dcrUsuario;
	         this.dcrLogin = dcrLogin;
	         this.dcrSenha = dcrSenha;
	         this.datDesativacao = datDesativacao; 
	         this.datCadastro = datCadastro;
	    }
	 
	   
	        public Integer getIdCadusuario() {
	        return idcadusuario;
	    }
	    public void setId(Integer idcadusuario) {
	        this.idcadusuario = idcadusuario;
	    }
	 
	   	    public String getDcrUsuario() {
	        return dcrUsuario;
	    }
	    public void setDcrUsuario(String dcrUsuario) {
	        this.dcrUsuario = dcrUsuario;
	    }
	 
	   
	    public String getDcrLogin() {
	        return dcrLogin;
	    }
	    public void setDcrLogin(String dcrLogin) {
	        this.dcrLogin = dcrLogin;
	    }
	 
	   
	    public String getDcrSenha() {
	        return dcrSenha;
	    }
	    public void setDcrSenha(String dcrSenha) {
	        this.dcrSenha = dcrSenha;
	    }
	    
	    public String getDatDesativacao() {
	        return datDesativacao;
	    }
	    public void setDatDesativacao(String datDesativacao) {
	        this.datDesativacao = datDesativacao;
	    }
	    
	    public String getDatCadastro() {
	    	return datCadastro;
	    }
	    public void setDatCadastro(String datCadastro) {
	    	this.datCadastro = datCadastro;

	    }
	  
	    @Override
	    public String toString() {
	        return "Usuario [idcadusuario=" + idcadusuario + ", login=" + dcrLogin + ", Senha=" + dcrSenha
	       + "]";
	    
	    }

}
