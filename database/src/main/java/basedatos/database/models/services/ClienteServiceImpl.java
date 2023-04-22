package basedatos.database.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basedatos.database.models.dao.IClienteDao;
import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IclienteService{
    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll(){
        return clienteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Cliente cliente){
        clienteDao.save(cliente);
    }

    @Override@Transactional(readOnly = true)
    public Cliente findOne(Long id){
        return clienteDao.findOne(id);
    }
    @Override
    @Transactional
    public void delete(Long id){
        clienteDao.delete(id);
    }

}
