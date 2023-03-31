package upgradeit.rest.api.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "PESSOAS")
public class PessoaModel {

    @Id
    @Column (length = 11, nullable = false)
    private Integer CPF_PE;
    @Column (length = 7, nullable = false)
    private Integer RG_PE;
    @Column (length = 50, nullable = false)
    private String NOME_PE;
    @Column (length = 10, nullable = false)
    private String SEXO_PE;
    @Column ( nullable = false)
    @Temporal(TemporalType.DATE)
    private Date NASCIMENTO;


    public Integer getCPF_PE() {
        return CPF_PE;
    }

    public void setCPF_PE(Integer CPF_PE) {
        this.CPF_PE = CPF_PE;
    }

    public Integer getRG_PE() {
        return RG_PE;
    }

    public void setRG_PE(Integer RG_PE) {
        this.RG_PE = RG_PE;
    }

    public String getNOME_PE() {
        return NOME_PE;
    }

    public void setNOME_PE(String NOME_PE) {
        this.NOME_PE = NOME_PE;
    }

    public String getSEXO_PE() {
        return SEXO_PE;
    }

    public void setSEXO_PE(String SEXO_PE) {
        this.SEXO_PE = SEXO_PE;
    }

    public Date getNASCIMENTO() {
        return NASCIMENTO;
    }

    public void setNASCIMENTO(Date NASCIMENTO) {
        this.NASCIMENTO = NASCIMENTO;
    }
}