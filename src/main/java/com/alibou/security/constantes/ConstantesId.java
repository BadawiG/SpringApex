package com.alibou.security.constantes;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class ConstantesId implements Serializable {  
	/**
	 * 
	 */
	private static final long serialVersionUID = 3729011240934625398L;
	private String cdgroupe;
    private String nom;

    public ConstantesId() {
    }

    public ConstantesId(String cdGroupe, String nom) {
        this.cdgroupe = cdGroupe;
        this.nom = nom;
    }

    public String getCdGroupe() {
        return cdgroupe;
    }

    public void setCdGroupe(String cdGroupe) {
        this.cdgroupe = cdGroupe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstantesId that = (ConstantesId) o;
        return Objects.equals(cdgroupe, that.cdgroupe) && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdgroupe, nom);
    }

    // Other methods, if needed
}

