package org.woehlke.javaee7.petclinic.dao;

import org.woehlke.javaee7.petclinic.entities.PetType;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.logging.Logger;
import org.woehlke.javaee7.petclinic.entities.Obra;

/**
 * Created with IntelliJ IDEA.
 * User: Fert
 * Date: 06.01.14
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class ObraDaoImpl implements ObraDao {

    private static Logger log = Logger.getLogger(ObraDaoImpl.class.getName());

    @PersistenceContext(unitName="javaee7petclinic")
    private EntityManager entityManager;

    /**
     *
     * @return
     */
    @Override
    public List<Obra> getAll() {
        TypedQuery<Obra> q = entityManager.createQuery("select ob from obras pt order by ob.nome",Obra.class);
        List<Obra> list =  q.getResultList();
        return list;
    }

    @Override
    public void delete(long id) {
        Obra obra = entityManager.find(Obra.class, id);
        entityManager.remove(obra);
    }

    public void addNew(Obra obra) {
        log.info("addNewObra: "+obra.toString());
        entityManager.persist(obra);
    }

    @Override
    public Obra findById(long id) {
        Obra obra = entityManager.find(Obra.class, id);
        return obra;
    }

    @Override
    public void update(Obra obra) {
        entityManager.merge(obra);
    }
}
