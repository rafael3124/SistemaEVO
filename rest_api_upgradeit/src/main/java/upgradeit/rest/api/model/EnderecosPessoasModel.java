package upgradeit.rest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ENDERECOS_PE")
public class EnderecosPessoasModel {


    @Id
    @Column(name = "id_ENDERECO_PE",nullable = false)
    private Integer CPF_PE;
    @Column (length = 8, nullable = false)
    private Integer CEP_PE;
    @Column (length = 25, nullable = false)
    private String CIDADE_PE;
    @Column (length = 25, nullable = false)
    private String ESTADO_PE;
    @Column (length = 25, nullable = false)
    private String BAIRRO_PE;
    @Column (length = 25, nullable = false)
    private String RUA_PE;
    @Column (length = 10, nullable = false)
    private Integer NUMERO_PE;
    @Column (length = 50, nullable = false)
    private String COMPLEMENTO_PE;

    public Integer getCPF_PE() {
        return CPF_PE;
    }

    public void setCPF_PE(Integer CPF_PE) {
        this.CPF_PE = CPF_PE;
    }

    public Integer getCEP_PE() {
        return CEP_PE;
    }

    public void setCEP_PE(Integer CEP_PE) {
        this.CEP_PE = CEP_PE;
    }

    public String getCIDADE_PE() {
        return CIDADE_PE;
    }

    public void setCIDADE_PE(String CIDADE_PE) {
        this.CIDADE_PE = CIDADE_PE;
    }

    public String getESTADO_PE() {
        return ESTADO_PE;
    }

    public void setESTADO_PE(String ESTADO_PE) {
        this.ESTADO_PE = ESTADO_PE;
    }

    public String getBAIRRO_PE() {
        return BAIRRO_PE;
    }

    public void setBAIRRO_PE(String BAIRRO_PE) {
        this.BAIRRO_PE = BAIRRO_PE;
    }

    public String getRUA_PE() {
        return RUA_PE;
    }

    public void setRUA_PE(String RUA_PE) {
        this.RUA_PE = RUA_PE;
    }

    public Integer getNUMERO_PE() {
        return NUMERO_PE;
    }

    public void setNUMERO_PE(Integer NUMERO_PE) {
        this.NUMERO_PE = NUMERO_PE;
    }

    public String getCOMPLEMENTO_PE() {
        return COMPLEMENTO_PE;
    }

    public void setCOMPLEMENTO_PE(String COMPLEMENTO_PE) {
        this.COMPLEMENTO_PE = COMPLEMENTO_PE;
    }
}
