package upgradeit.rest.api.model;

import jakarta.persistence.*;

@Entity
@Table (name = "EPI")
public class EPIModel {

    @Id
    @Column(name = "id_EPI", nullable = false)
    private Integer id_EMPRESA;
    @Column(length = 50, nullable = false)
    private String CATEGORIA_EPI;
    @Column(length = 100, nullable = false)
    private String NOME_EPI;
    @Column (nullable = false)
    @Temporal(TemporalType.DATE)
    private String VALIDADE_EPI;
    @Column (nullable = false)
    @Temporal(TemporalType.DATE)
    private String VALIDADE_CA_EPI;
    @Column(length = 200, nullable = false)
    private String CA_EPI;
    @Column(length = 200, nullable = false)
    private String DESCRICAO_EPI;

    public Integer getId_EMPRESA() {
        return id_EMPRESA;
    }

    public void setId_EMPRESA(Integer id_EMPRESA) {
        this.id_EMPRESA = id_EMPRESA;
    }

    public String getCATEGORIA_EPI() {
        return CATEGORIA_EPI;
    }

    public void setCATEGORIA_EPI(String CATEGORIA_EPI) {
        this.CATEGORIA_EPI = CATEGORIA_EPI;
    }

    public String getNOME_EPI() {
        return NOME_EPI;
    }

    public void setNOME_EPI(String NOME_EPI) {
        this.NOME_EPI = NOME_EPI;
    }

    public String getVALIDADE_EPI() {
        return VALIDADE_EPI;
    }

    public void setVALIDADE_EPI(String VALIDADE_EPI) {
        this.VALIDADE_EPI = VALIDADE_EPI;
    }

    public String getVALIDADE_CA_EPI() {
        return VALIDADE_CA_EPI;
    }

    public void setVALIDADE_CA_EPI(String VALIDADE_CA_EPI) {
        this.VALIDADE_CA_EPI = VALIDADE_CA_EPI;
    }

    public String getCA_EPI() {
        return CA_EPI;
    }

    public void setCA_EPI(String CA_EPI) {
        this.CA_EPI = CA_EPI;
    }

    public String getDESCRICAO_EPI() {
        return DESCRICAO_EPI;
    }

    public void setDESCRICAO_EPI(String DESCRICAO_EPI) {
        this.DESCRICAO_EPI = DESCRICAO_EPI;
    }
}
