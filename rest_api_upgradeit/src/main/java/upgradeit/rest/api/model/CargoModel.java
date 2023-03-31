package upgradeit.rest.api.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "CARGOS")
public class CargoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_CARGO;
    @Column (length = 50, nullable = false)
    private String NOME_CA;
    @Column (length = 10, nullable = true)
    private String COR_CA;
    @Column (length = 10, nullable = true)
    private String ICONE_CA;
    @Column (length = 50, nullable = false)
    private String CBO;
    @Column (nullable = false)
    @Temporal(TemporalType.DATE)
    private Date DATA_INICIO_CA;
    @Column (length = 50, nullable = false)
    private String APTIDAO_CA;
    @Column (length = 50, nullable = false)
    private String AMBIENTES_CA;
    @Column (length = 50, nullable = false)
    private String ATIVIDADE_CA;

    public Integer getId_CARGO() {
        return id_CARGO;
    }

    public void setId_CARGO(Integer id_CARGO) {
        this.id_CARGO = id_CARGO;
    }

    public String getNOME_CA() {
        return NOME_CA;
    }

    public void setNOME_CA(String NOME_CA) {
        this.NOME_CA = NOME_CA;
    }

    public String getCOR_CA() {
        return COR_CA;
    }

    public void setCOR_CA(String COR_CA) {
        this.COR_CA = COR_CA;
    }

    public String getICONE_CA() {
        return ICONE_CA;
    }

    public void setICONE_CA(String ICONE_CA) {
        this.ICONE_CA = ICONE_CA;
    }

    public String getCBO() {
        return CBO;
    }

    public void setCBO(String CBO) {
        this.CBO = CBO;
    }

    public Date getDATA_INICIO_CA() {
        return DATA_INICIO_CA;
    }

    public void setDATA_INICIO_CA(Date DATA_INICIO_CA) {
        this.DATA_INICIO_CA = DATA_INICIO_CA;
    }

    public String getAPTIDAO_CA() {
        return APTIDAO_CA;
    }

    public void setAPTIDAO_CA(String APTIDAO_CA) {
        this.APTIDAO_CA = APTIDAO_CA;
    }

    public String getAMBIENTES_CA() {
        return AMBIENTES_CA;
    }

    public void setAMBIENTES_CA(String AMBIENTES_CA) {
        this.AMBIENTES_CA = AMBIENTES_CA;
    }

    public String getATIVIDADE_CA() {
        return ATIVIDADE_CA;
    }

    public void setATIVIDADE_CA(String ATIVIDADE_CA) {
        this.ATIVIDADE_CA = ATIVIDADE_CA;
    }
}

