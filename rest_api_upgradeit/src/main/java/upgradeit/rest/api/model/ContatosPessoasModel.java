package upgradeit.rest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "CONTATOS_PE")
public class ContatosPessoasModel {

    @Id
    @Column(name = "id_CONTATOS_PE",nullable = false)
    private Integer CPF_PE;
    @Column (length = 14, nullable = false)
    private Integer TEL_PRINCIPAL_PE;
    @Column (length = 100, nullable = true)
    private Integer TEL_SECUNDARIO_PE;
    @Column (length = 100, nullable = false)
    private String EMAIL_PRINCIPAL_PE;
    @Column (length = 200, nullable = true)
    private String EMAIL_SECUNDARIO_PE;

    public Integer getCPF_PE() {
        return CPF_PE;
    }

    public void setCPF_PE(Integer CPF_PE) {
        this.CPF_PE = CPF_PE;
    }

    public Integer getTEL_PRINCIPAL_PE() {
        return TEL_PRINCIPAL_PE;
    }

    public void setTEL_PRINCIPAL_PE(Integer TEL_PRINCIPAL_PE) {
        this.TEL_PRINCIPAL_PE = TEL_PRINCIPAL_PE;
    }

    public Integer getTEL_SECUNDARIO_PE() {
        return TEL_SECUNDARIO_PE;
    }

    public void setTEL_SECUNDARIO_PE(Integer TEL_SECUNDARIO_PE) {
        this.TEL_SECUNDARIO_PE = TEL_SECUNDARIO_PE;
    }

    public String getEMAIL_PRINCIPAL_PE() {
        return EMAIL_PRINCIPAL_PE;
    }

    public void setEMAIL_PRINCIPAL_PE(String EMAIL_PRINCIPAL_PE) {
        this.EMAIL_PRINCIPAL_PE = EMAIL_PRINCIPAL_PE;
    }

    public String getEMAIL_SECUNDARIO_PE() {
        return EMAIL_SECUNDARIO_PE;
    }

    public void setEMAIL_SECUNDARIO_PE(String EMAIL_SECUNDARIO_PE) {
        this.EMAIL_SECUNDARIO_PE = EMAIL_SECUNDARIO_PE;
    }
}
