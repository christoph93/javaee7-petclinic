package org.woehlke.javaee7.petclinic.entities;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 01.01.14
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "obras")
public class Obra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(name = "nome")
    private String nome; 
    
    @Column(name = "responsavelTecnico")
    private String responsavelTecnico;
    
    @Column(name = "responsavel")
    private String responsavel;
    
    @Column(name = "observacao")
    private String observacao;
    
    @Column(name = "diaSemana")
    private String diaSemana;
    
    @Column(name = "prazo")    
    private String prazo;
    
    @Column(name = "inicioObra")
    private String inicioObra;
    
    @Column(name = "terminoObra")
    private String terminoObra;
    
    @Column(name = "saldo")
    private double saldo;
    
    @Column(name = "tempoDecorrido")
    private long tempoDecorrido;

    public String getResponsavelTecnico() {
        return responsavelTecnico;
    }

    public void setResponsavelTecnico(String reposnsavelTecnico) {
        this.responsavelTecnico = reposnsavelTecnico;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getInicioObra() {
        return inicioObra;
    }

    public void setInicioObra(String inicioObra) {
        this.inicioObra = inicioObra;
    }

    public String getTerminoObra() {
        return terminoObra;
    }

    public void setTerminoObra(String terminoObra) {
        this.terminoObra = terminoObra;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getTempoDecorrido() {
        return tempoDecorrido;
    }

    public void setTempoDecorrido(long tempoDecorrido) {
        this.tempoDecorrido = tempoDecorrido;
    }
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Obra{" + "id=" + id + ", nome=" + nome + ", responsavelTecnico=" + responsavelTecnico + ", responsavel=" + responsavel + ", observacao=" + observacao + ", diaSemana=" + diaSemana + ", prazo=" + prazo + ", inicioObra=" + inicioObra + ", terminoObra=" + terminoObra + ", saldo=" + saldo + ", tempoDecorrido=" + tempoDecorrido + '}';
    }

    
}
