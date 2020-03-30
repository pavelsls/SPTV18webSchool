/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Journal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class JournalFacade extends AbstractFacade<Journal> {

    @PersistenceContext(unitName = "SPTV18webSchoolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JournalFacade() {
        super(Journal.class);
    }

    public List<Journal> findByReturnNull() {
        try {
            return em.createQuery("SELECT j FROM Journal j WHERE j.returnPerson = null")
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    
}
