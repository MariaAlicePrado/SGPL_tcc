package sgpl.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Ocorrencia")
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    // FALTAM TRÊS CHAVES ESTRANGEIRAS
    @Column(nullable = false)
    public Date dataOcorrencia;
    @Column(nullable = false, length = 500)
    public String descricao;
    @Column(nullable = false, length = 10)
    public String periodo;
    @Column(nullable = false, length = 20)
    public String classificacao;

    @ManyToOne
    @JoinColumn(name = "ambiente_id")
    private Ambiente ambiente;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Usuario professor;

    @ManyToOne
    @JoinColumn(name = "maquina_id")
    private Maquina maquina;

    @Column(nullable = false)
    public String  statusOcorrencia;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }


    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) { this.ambiente = ambiente;}

    public Maquina getMaquina() { return maquina;}

    public void setMaquina(Maquina maquina) { this.maquina = maquina;}

    public Usuario getProfessor() {
        return professor;
    }

    public void setProfessor(Usuario professor) {
        this.professor = professor;
    }

    public String isStatusOcorrencia() {
        return statusOcorrencia;
    }

    public void setStatusOcorrencia(String statusOcorrencia) {
        this.statusOcorrencia = statusOcorrencia;
    }
}
