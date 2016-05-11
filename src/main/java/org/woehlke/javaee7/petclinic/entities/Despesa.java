/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.entities;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Store;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author 12104806
 */
@Entity
@Table(name = "despesas")
@Indexed
public class Despesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "desc")
    @NotEmpty
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String descricao;

    @Column(name = "custo")
    @NotEmpty
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private double lastName;

    @Column(name = "tipo")
    @NotEmpty
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String tipo;
    
    @Column(name = "data")
    @NotEmpty
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private LocalDateTime data;
    
    
    @Column(name = "visita")
    @NotEmpty
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private Visit visita;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getLastName() {
        return lastName;
    }

    public void setLastName(double lastName) {
        this.lastName = lastName;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Visit getVisita() {
        return visita;
    }

    public void setVisita(Visit visita) {
        this.visita = visita;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Despesa)) {
            return false;
        }
        Despesa other = (Despesa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Despesa[ id=" + id + " ]";
    }

}
