package erp.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Cacheable("produto")
    public Produto findProdutoById(Long id) {
        // Simulate a slow service by sleeping
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Produto(id, "Produto " + id);
    }
}
