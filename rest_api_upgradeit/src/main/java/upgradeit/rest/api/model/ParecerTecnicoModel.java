package upgradeit.rest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table  (name = "PARECER_TECNICO")
public class ParecerTecnicoModel {

    @Id
    @Column (nullable = false)
    private Integer id_CARGO;
    @Column (length = 50, nullable = true)
    private String LTCAT_PAT;
    @Column (length = 50, nullable = true)
    private String PERICULOSIDADE_PAT;
    @Column (length = 50, nullable = true)
    private String INSALUBRIDADE_PAT;

    public Integer getId_CARGO() {
        return id_CARGO;
    }

    public void setId_CARGO(Integer id_CARGO) {
        this.id_CARGO = id_CARGO;
    }

    public String getLTCAT_PAT() {
        return LTCAT_PAT;
    }

    public void setLTCAT_PAT(String LTCAT_PAT) {
        this.LTCAT_PAT = LTCAT_PAT;
    }

    public String getPERICULOSIDADE_PAT() {
        return PERICULOSIDADE_PAT;
    }

    public void setPERICULOSIDADE_PAT(String PERICULOSIDADE_PAT) {
        this.PERICULOSIDADE_PAT = PERICULOSIDADE_PAT;
    }

    public String getINSALUBRIDADE_PAT() {
        return INSALUBRIDADE_PAT;
    }

    public void setINSALUBRIDADE_PAT(String INSALUBRIDADE_PAT) {
        this.INSALUBRIDADE_PAT = INSALUBRIDADE_PAT;
    }
}
