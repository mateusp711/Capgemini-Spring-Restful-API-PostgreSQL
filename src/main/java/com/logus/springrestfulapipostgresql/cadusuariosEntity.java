package com.logus.springrestfulapipostgresql;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.annotation.HttpConstraint;

import org.hibernate.annotations.Check;
import org.springframework.boot.convert.DataSizeUnit;


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
	    
	    @Column
		(name = "dcr_senha", nullable = false)
		private String dcrSenha;		
	    
	    @Column(name = "dat_desativacao", nullable = false)
	    private Date datDesativacao;
	    
	    @Column(name = "dat_cadastro", nullable = false)
	    private Date datCadastro;
	    
	 
	    public cadusuariosEntity() {
	    }
		 
	    public cadusuariosEntity(String dcrUsuario, String dcrLogin, String dcrSenha,Date datDesativacao, Date datCadastro) {
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
	    
	    public Date getDatDesativacao() {
	        return datDesativacao;
	    }
	    public void setDatDesativacao(Date datDesativacao) {
	        this.datDesativacao = datDesativacao;
	    }
	    
	    public Date getDatCadastro() {
	    	return datCadastro;
	    }
	    public void setDatCadastro(Date datCadastro) {
	    	this.datCadastro = datCadastro;

	    }
	  
	    @Override
	    public String toString() {
	        return "Usuario [idcadusuario=" + idcadusuario + ", login=" + dcrLogin + ", Senha=" + dcrSenha
	       + "]";
	    
	    }

}
