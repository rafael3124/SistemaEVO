package upgradeit.rest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONTATOS_EM")
public class ContatosEmpresasModel {

    @Id
    @Column(name = "id_CONTATOS_EM", nullable = false)
    private Integer id_EMPRESA;
    @Column(length = 14, nullable = false)
    private Integer TEL_PRINCIPAL_EM;
    @Column(length = 100, nullable = true)
    private Integer TEL_SECUNDARIO_EM;
    @Column(length = 100, nullable = false)
    private String EMAIL_PRINCIPAL_EM;
    @Column(length = 200, nullable = true)
    private String EMAIL_SECUNDARIO_EM;

    public Integer getId_EMPRESA() {
        return id_EMPRESA;
    }

    public void setId_EMPRESA(Integer id_EMPRESA) {
        this.id_EMPRESA = id_EMPRESA;
    }

    public Integer getTEL_PRINCIPAL_EM() {
        return TEL_PRINCIPAL_EM;
    }

    public void setTEL_PRINCIPAL_EM(Integer TEL_PRINCIPAL_EM) {
        this.TEL_PRINCIPAL_EM = TEL_PRINCIPAL_EM;
    }

    public Integer getTEL_SECUNDARIO_EM() {
        return TEL_SECUNDARIO_EM;
    }

    public void setTEL_SECUNDARIO_EM(Integer TEL_SECUNDARIO_EM) {
        this.TEL_SECUNDARIO_EM = TEL_SECUNDARIO_EM;
    }

    public String getEMAIL_PRINCIPAL_EM() {
        return EMAIL_PRINCIPAL_EM;
    }

    public void setEMAIL_PRINCIPAL_EM(String EMAIL_PRINCIPAL_EM) {
        this.EMAIL_PRINCIPAL_EM = EMAIL_PRINCIPAL_EM;
    }

    public String getEMAIL_SECUNDARIO_EM() {
        return EMAIL_SECUNDARIO_EM;
    }

    public void setEMAIL_SECUNDARIO_EM(String EMAIL_SECUNDARIO_EM) {
        this.EMAIL_SECUNDARIO_EM = EMAIL_SECUNDARIO_EM;
    }
}