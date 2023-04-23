package ProjectPersonal.example.ProjectPersonal.services;

import java.util.Optional;

import java.util.List;

import ProjectPersonal.example.ProjectPersonal.models.User;

public interface ServiceUser {

    public User save(User user);
    public void deleteById(Long id);
    public List<User> findAll();
    public Optional<User> findById(Long id);
    
}
