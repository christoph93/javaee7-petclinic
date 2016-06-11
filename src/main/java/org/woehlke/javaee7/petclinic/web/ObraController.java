package org.woehlke.javaee7.petclinic.web;


import org.richfaces.component.SortOrder;
import org.woehlke.javaee7.petclinic.dao.ObraDao;
import org.woehlke.javaee7.petclinic.entities.Obra;

import javax.ejb.EJB;
import javax.ejb.EJBTransactionRolledbackException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Fert
 * Date: 06.01.14
 * Time: 11:49
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class ObraController implements Serializable {

    @EJB
    private ObraDao obraDao;

    private Obra obra;

    private SortOrder obraSortOrder = SortOrder.ascending;
    private int scrollerPage;

    public SortOrder getObraSortOrder() {
        return obraSortOrder;
    }

    public void setObraSortOrder(SortOrder obraSortOrder) {
        this.obraSortOrder = obraSortOrder;
    }

    public void switchSortOrder(){
        if(obraSortOrder == SortOrder.ascending){
            obraSortOrder = SortOrder.descending;
        } else {
            obraSortOrder = SortOrder.ascending;
        }
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public List<Obra> getObras(){
        return obraDao.getAll();
    }

    public String getNewObraForm(){
        obra = new Obra();
        return "newObra.jsf";
    }

    public String saveNewObra(){
        obraDao.addNew(this.obra);
        return "obras.jsf";
    }

    public String getEditForm(long id){
        this.obra = obraDao.findById(id);
        return "editObra.jsf";
    }

    public String saveEditedObra(){
        obraDao.update(this.obra);
        return "obras.jsf";
    }

    public String delete(long id){
        try {
            obraDao.delete(id);
        } catch (EJBTransactionRolledbackException e) {
            FacesContext ctx = FacesContext.getCurrentInstance();
            ctx.addMessage(null, new FacesMessage("cannot delete, object still in use"));
        }
        return "obras.jsf";
    }

    public void setScrollerPage(int scrollerPage) {
        this.scrollerPage = scrollerPage;
    }

    public int getScrollerPage() {
        return scrollerPage;
    }
}
