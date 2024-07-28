package erp.dao.impl;

import erp.dao.RamoAtividadeDAO;
import erp.model.RamoAtividade;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class RamoAtividadeDAOImpl implements RamoAtividadeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(RamoAtividade ramoAtividade) {
        entityManager.persist(ramoAtividade);
    }

    @Override
    public RamoAtividade findById(Long id) {
        return entityManager.find(RamoAtividade.class, id);
    }

    @Override
    public List<RamoAtividade> findAll() {
        return entityManager.createQuery("FROM RamoAtividade", RamoAtividade.class).getResultList();
    }

    @Override
    @Transactional
    public void update(RamoAtividade ramoAtividade) {
        entityManager.merge(ramoAtividade);
    }

    @Override
    @Transactional
    public void delete(RamoAtividade ramoAtividade) {
        if (entityManager.contains(ramoAtividade)) {
            entityManager.remove(ramoAtividade);
        } else {
            RamoAtividade managedRamoAtividade = findById(ramoAtividade.getId());
            if (managedRamoAtividade != null) {
                entityManager.remove(managedRamoAtividade);
            }
        }
    }
}
