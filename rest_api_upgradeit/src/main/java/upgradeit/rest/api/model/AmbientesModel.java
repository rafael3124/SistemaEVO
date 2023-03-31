package upgradeit.rest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ABMIENTES")
public class AmbientesModel {



    @Id
    @Column(name = "id_AMBIENTE", nullable = false)
    private Integer id_EMPRESA;
    @Column(length = 50, nullable = false)
    private String NOME_AM;
    @Column(length = 25, nullable = true)
    private String COR_AM;
    @Column(length = 25, nullable = true)
    private String ICONE_AM;
    @Column(length = 200, nullable = false)
    private String DESCRICAO_AM;
    @Column(name = "ENDERECO_EM", nullable = false)
    private Integer id_ENDERECO_EM;

    public Integer getId_EMPRESA() {
        return id_EMPRESA;
    }

    public void setId_EMPRESA(Integer id_EMPRESA) {
        this.id_EMPRESA = id_EMPRESA;
    }

    public String getNOME_AM() {
        return NOME_AM;
    }

    public void setNOME_AM(String NOME_AM) {
        this.NOME_AM = NOME_AM;
    }

    public String getCOR_AM() {
        return COR_AM;
    }

    public void setCOR_AM(String COR_AM) {
        this.COR_AM = COR_AM;
    }

    public String getICONE_AM() {
        return ICONE_AM;
    }

    public void setICONE_AM(String ICONE_AM) {
        this.ICONE_AM = ICONE_AM;
    }

    public String getDESCRICAO_AM() {
        return DESCRICAO_AM;
    }

    public void setDESCRICAO_AM(String DESCRICAO_AM) {
        this.DESCRICAO_AM = DESCRICAO_AM;
    }

    public Integer getId_ENDERECO_EM() {
        return id_ENDERECO_EM;
    }

    public void setId_ENDERECO_EM(Integer id_ENDERECO_EM) {
        this.id_ENDERECO_EM = id_ENDERECO_EM;
    }
}
