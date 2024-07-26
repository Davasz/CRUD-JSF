package erp.dao.impl;

import erp.dao.ProdutoDAO;
import erp.model.Produto;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class ProdutoDAOImpl implements ProdutoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Produto produto) {
        entityManager.persist(produto);
    }

    @Override
    public Produto findById(Long id) {
        return entityManager.find(Produto.class, id);
    }

    @Override
    public List<Produto> findAll() {
        return entityManager.createQuery("FROM Produto", Produto.class).getResultList();
    }

    @Override
    @Transactional
    public void update(Produto produto) {
        entityManager.merge(produto);
    }

    @Override
    @Transactional
    public void delete(Produto produto) {
        if (entityManager.contains(produto)) {
            entityManager.remove(produto);
        } else {
            Produto managedProduto = findById(produto.getId());
            if (managedProduto != null) {
                entityManager.remove(managedProduto);
            }
        }
    }
}
