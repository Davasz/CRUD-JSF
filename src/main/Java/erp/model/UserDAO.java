package erp.model;

import erp.model.Usuario;
import java.util.List;

public interface UsuarioDAO {
    void save(Usuario usuario);
    Usuario findById(Long id);
    List<Usuario> findAll();
    void update(Usuario usuario);
    void delete(Usuario usuario);
}
