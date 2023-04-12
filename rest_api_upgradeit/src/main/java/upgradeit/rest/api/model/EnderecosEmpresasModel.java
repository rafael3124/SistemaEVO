package upgradeit.rest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENDERECOS_EM")
public class EnderecosEmpresasModel {


    @Id
    @Column(name = "ENDERECO_EM", nullable = false)
    private Integer id_EMPRESA;
    @Column(length = 8, nullable = false)
    private Integer CEP_EM;
    @Column(length = 25, nullable = false)
    private String CIDADE_EM;
    @Column(length = 25, nullable = false)
    private String ESTADO_EM;
    @Column(length = 25, nullable = false)
    private String BAIRRO_EM;
    @Column(length = 25, nullable = false)
    private String RUA_EM;
    @Column(length = 10, nullable = false)
    private Integer NUMERO_EM;
    @Column(length = 50, nullable = false)
    private String COMPLEMENTO_EM;

    public Integer getId_EMPRESA() {
        return id_EMPRESA;
    }

    public void setId_EMPRESA(Integer id_EMPRESA) {
        this.id_EMPRESA = id_EMPRESA;
    }

    public Integer getCEP_EM() {
        return CEP_EM;
    }

    public void setCEP_EM(Integer CEP_EM) {
        this.CEP_EM = CEP_EM;
    }

    public String getCIDADE_EM() {
        return CIDADE_EM;
    }

    public void setCIDADE_EM(String CIDADE_EM) {
        this.CIDADE_EM = CIDADE_EM;
    }

    public String getESTADO_EM() {
        return ESTADO_EM;
    }

    public void setESTADO_EM(String ESTADO_EM) {
        this.ESTADO_EM = ESTADO_EM;
    }

    public String getBAIRRO_EM() {
        return BAIRRO_EM;
    }

    public void setBAIRRO_EM(String BAIRRO_EM) {
        this.BAIRRO_EM = BAIRRO_EM;
    }

    public String getRUA_EM() {
        return RUA_EM;
    }

    public void setRUA_EM(String RUA_EM) {
        this.RUA_EM = RUA_EM;
    }

    public Integer getNUMERO_EM() {
        return NUMERO_EM;
    }

    public void setNUMERO_EM(Integer NUMERO_EM) {
        this.NUMERO_EM = NUMERO_EM;
    }

    public String getCOMPLEMENTO_EM() {
        return COMPLEMENTO_EM;
    }

    public void setCOMPLEMENTO_EM(String COMPLEMENTO_EM) {
        this.COMPLEMENTO_EM = COMPLEMENTO_EM;
    }
}