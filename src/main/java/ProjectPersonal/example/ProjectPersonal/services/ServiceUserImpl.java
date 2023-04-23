package ProjectPersonal.example.ProjectPersonal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ProjectPersonal.example.ProjectPersonal.models.User;
import ProjectPersonal.example.ProjectPersonal.repository.repositoryUser;

@Service
public class ServiceUserImpl implements ServiceUser {
    @Autowired
    public repositoryUser repositoryUser;
    
    
    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        
        return repositoryUser.findAll();
    }
    
    @Transactional
    @Override
    public void deleteById(Long id) {
        repositoryUser.deleteById(id);;
        
    }

    @Transactional
    @Override
    public Optional<User> findById(Long id) {
       
        return repositoryUser.findById(id);
    }


    @Transactional
    @Override
    public User save(User user) {
       
        return repositoryUser.save(user);
    }
    
}
