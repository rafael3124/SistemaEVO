package upgradeit.rest.api.model;

import jakarta.persistence.*;

@Entity
@Table (name = "EPC")
public class EPCModel {

    @Id
    @Column(name = "id_EPC", nullable = false)
    private Integer id_EMPRESA;
    @Column(length = 50, nullable = false)
    private String CATEGORIA_EPC;
    @Column(length = 100, nullable = false)
    private String NOME_EPC;
    @Column (nullable = false)
    @Temporal(TemporalType.DATE)
    private String VALIDADE_EPC;
    @Column(length = 200, nullable = false)
    private String DESCRICAO_EPC;

    public Integer getId_EMPRESA() {
        return id_EMPRESA;
    }

    public void setId_EMPRESA(Integer id_EMPRESA) {
        this.id_EMPRESA = id_EMPRESA;
    }

    public String getCATEGORIA_EPC() {
        return CATEGORIA_EPC;
    }

    public void setCATEGORIA_EPC(String CATEGORIA_EPC) {
        this.CATEGORIA_EPC = CATEGORIA_EPC;
    }

    public String getNOME_EPC() {
        return NOME_EPC;
    }

    public void setNOME_EPC(String NOME_EPC) {
        this.NOME_EPC = NOME_EPC;
    }

    public String getVALIDADE_EPC() {
        return VALIDADE_EPC;
    }

    public void setVALIDADE_EPC(String VALIDADE_EPC) {
        this.VALIDADE_EPC = VALIDADE_EPC;
    }

    public String getDESCRICAO_EPC() {
        return DESCRICAO_EPC;
    }

    public void setDESCRICAO_EPC(String DESCRICAO_EPC) {
        this.DESCRICAO_EPC = DESCRICAO_EPC;
    }
}
