package org.woehlke.javaee7.petclinic.dao;

import java.util.List;
import org.woehlke.javaee7.petclinic.entities.Obra;

/**
 * Created with IntelliJ IDEA.
 * User: Fert
 * Date: 06.01.14
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
public interface ObraDao {
    
    
    List<Obra> getAll();

    void delete(long id);

    void addNew(Obra obra);

    Obra findById(long id);

    void update(Obra obra);
    

}
