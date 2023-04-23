package ProjectPersonal.example.ProjectPersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjectPersonal.example.ProjectPersonal.models.User;

public interface repositoryUser extends JpaRepository <User, Long> {
    
}
