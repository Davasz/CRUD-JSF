package erp.dao.impl;

import erp.dao.EmpresaDAO;
import erp.model.Empresa;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class EmpresaDAOImpl implements EmpresaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Empresa empresa) {
        entityManager.persist(empresa);
    }

    @Override
    public Empresa findById(Long id) {
        return entityManager.find(Empresa.class, id);
    }

    @Override
    public List<Empresa> findAll() {
        return entityManager.createQuery("FROM Empresa", Empresa.class).getResultList();
    }

    @Override
    @Transactional
    public void update(Empresa empresa) {
        entityManager.merge(empresa);
    }

    @Override
    @Transactional
    public void delete(Empresa empresa) {
        if (entityManager.contains(empresa)) {
            entityManager.remove(empresa);
        } else {
            Empresa managedEmpresa = findById(empresa.getId());
            if (managedEmpresa != null) {
                entityManager.remove(managedEmpresa);
            }
        }
    }
}
