package sgpl.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Ambiente")
public class Ambiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(nullable = false, length = 15)
    public String nome;
    @Column(nullable = false)
    public String localAmbiente;
    @Column(nullable = false)
    public String statusAmbiente;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalAmbiente() {
        return localAmbiente;
    }

    public void setLocalAmbiente(String localAmbiente) {
        this.localAmbiente = localAmbiente;
    }

    public String getStatusAmbiente() {
        return statusAmbiente;
    }

    public void setStatusAmbiente(String statusAmbiente) {
        this.statusAmbiente = statusAmbiente;
    }
}