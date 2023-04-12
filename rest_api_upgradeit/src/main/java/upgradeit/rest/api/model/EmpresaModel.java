package upgradeit.rest.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "EMPRESAS")
public class EmpresaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_EMPRESA;
    @Column (length = 14, nullable = false)
    private Integer CNPJ;
    @Column (length = 50, nullable = false)
    private String NOME_EM;
    @Column (length = 50, nullable = false)
    private String NOME_FANTASIA_EM;
    @Column (length = 200, nullable = true)
    private String OBS_EM;

    public Integer getId_EMPRESA() {
        return id_EMPRESA;
    }

    public void setId_EMPRESA(Integer id_EMPRESA) {
        this.id_EMPRESA = id_EMPRESA;
    }

    public Integer getCNPJ_EM() {
        return CNPJ;
    }

    public void setCNPJ_EM(Integer CNPJ_EM) {
        this.CNPJ = CNPJ_EM;
    }

    public String getNOME_EM() {
        return NOME_EM;
    }

    public void setNOME_EM(String NOME_EM) {
        this.NOME_EM = NOME_EM;
    }

    public String getNOME_FANTASIA_EM() {
        return NOME_FANTASIA_EM;
    }

    public void setNOME_FANTASIA_EM(String NOME_FANTASIA_EM) {
        this.NOME_FANTASIA_EM = NOME_FANTASIA_EM;
    }

    public String getOBS_EM() {
        return OBS_EM;
    }

    public void setOBS_EM(String OBS_EM) {
        this.OBS_EM = OBS_EM;
    }
}
