package com.alibou.security.constantes;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@JsonIgnoreProperties(value = "id")
@AllArgsConstructor
@NoArgsConstructor 
@Table(name = "CONSTANTES")
public class ConstantesModel implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1255287905715702301L;


	
	
	@EmbeddedId
    private ConstantesId id;


	@Transient
    private String cdgroupe;
	@Transient
    private String nom;
	
	
    @Column(name = "U_VERSION", length = 1, columnDefinition = "CHAR(1) DEFAULT '!'")
    private String uVersion;

    @Column(name = "\"DESC\"", length = 80)
    private String description;

    @Column(name = "TYP_DATA", length = 40)
    private String typData;

    @Column(name = "CODE_USAG_AJT", length = 8)
    private String codeUsagAjt;

    @Column(name = "CODE_USAG_MOD", length = 8)
    private String codeUsagMod;

    @Column(name = "DH_AJT")
    private Date dhAjt;

    @Column(name = "DH_MOD")
    private Date dhMod;

    
    
	public ConstantesId getId() {
		return id;
	}

	public void setId(ConstantesId id) {
		this.id = id;
	}

	public String getCdgroupe() {
		return this.id.getCdGroupe();
	}

	public void setCdgroupe(String cdgroupe) {
		this.cdgroupe = cdgroupe;
	}

	public String getNom() {
		return this.id.getNom();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getuVersion() {
		return uVersion;
	}

	public void setuVersion(String uVersion) {
		this.uVersion = uVersion;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypData() {
		return typData;
	}

	public void setTypData(String typData) {
		this.typData = typData;
	}

	public String getCodeUsagAjt() {
		return codeUsagAjt;
	}

	public void setCodeUsagAjt(String codeUsagAjt) {
		this.codeUsagAjt = codeUsagAjt;
	}

	public String getCodeUsagMod() {
		return codeUsagMod;
	}

	public void setCodeUsagMod(String codeUsagMod) {
		this.codeUsagMod = codeUsagMod;
	}

	public Date getDhAjt() {
		return dhAjt;
	}

	public void setDhAjt(Date dhAjt) {
		this.dhAjt = dhAjt;
	}

	public Date getDhMod() {
		return dhMod;
	}

	public void setDhMod(Date dhMod) {
		this.dhMod = dhMod;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    // Constructors, getters, setters, and other methods 
   
}
