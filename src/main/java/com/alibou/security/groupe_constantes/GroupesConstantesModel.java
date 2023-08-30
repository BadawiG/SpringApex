package com.alibou.security.groupe_constantes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GROUPE_CONSTANTES")
public class GroupesConstantesModel {

    @Id
    @Column(name = "CDGROUPE", length = 24, nullable = false)
    private String cdGroupe;

    @Column(name = "U_VERSION", length = 1, columnDefinition = "CHAR(1) DEFAULT '!'")
    private String uVersion;

    @Column(name = "\"DESC\"", length = 80)
    private String description;

    @Column(name = "CODE_USAG_AJT", length = 8)
    private String codeUsagAjt;

    @Column(name = "CODE_USAG_MOD", length = 8)
    private String codeUsagMod;

    @Column(name = "DH_AJT")
    private Date dhAjt;

    @Column(name = "DH_MOD")
    private Date dhMod;
 
}

