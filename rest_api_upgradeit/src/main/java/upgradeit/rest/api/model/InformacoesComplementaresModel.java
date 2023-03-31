package upgradeit.rest.api.model;

import jakarta.persistence.*;

@Entity
@Table (name = "INFORMACOES_COMPLEMENTARES")
public class InformacoesComplementaresModel {

    @Id
    @Column (nullable = false)
    private Integer id_CARGO;
    @Column (length = 200, nullable = true)
    private String RECOMENDACAO_SEG_CA;
    @Column (length = 200, nullable = true)
    private String LTCAT_CA;
    @Column (length = 200, nullable = true)
    private String RISCO_ERGONOMICO_CA;

    public Integer getId_CARGO() {
        return id_CARGO;
    }

    public void setId_CARGO(Integer id_CARGO) {
        this.id_CARGO = id_CARGO;
    }

    public String getRECOMENDACAO_SEG_CA() {
        return RECOMENDACAO_SEG_CA;
    }

    public void setRECOMENDACAO_SEG_CA(String RECOMENDACAO_SEG_CA) {
        this.RECOMENDACAO_SEG_CA = RECOMENDACAO_SEG_CA;
    }

    public String getLTCAT_CA() {
        return LTCAT_CA;
    }

    public void setLTCAT_CA(String LTCAT_CA) {
        this.LTCAT_CA = LTCAT_CA;
    }

    public String getRISCO_ERGONOMICO_CA() {
        return RISCO_ERGONOMICO_CA;
    }

    public void setRISCO_ERGONOMICO_CA(String RISCO_ERGONOMICO_CA) {
        this.RISCO_ERGONOMICO_CA = RISCO_ERGONOMICO_CA;
    }
}
