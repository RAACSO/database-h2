package basedatos.database.models.services;
import java.util.List;
import models.entity.Cliente;
public interface IclienteService {
    public List<Cliente> findAll();
    public void save(Cliente cliente);
    public Cliente findOne(Long id);
    public void delete(Long id);
}
