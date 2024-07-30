package erp.dao;

import erp.model.RamoAtividade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RamoAtividadeDAO {
    void save(RamoAtividade ramoAtividade);
    RamoAtividade findById(Long id);
    List<RamoAtividade> findAll();
    Page<RamoAtividade> findAll(Pageable pageable);
    void update(RamoAtividade ramoAtividade);
    void delete(RamoAtividade ramoAtividade);
}
