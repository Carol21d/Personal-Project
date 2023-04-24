package ProjectPersonal.example.ProjectPersonal.services;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import ProjectPersonal.example.ProjectPersonal.models.User;
import ProjectPersonal.example.ProjectPersonal.repository.repositoryUser;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class ServiceUserTest {

    @InjectMocks
    ServiceUserImpl service;

    @Mock
    repositoryUser repository;
      
    ServiceUserTest(){
        this.service = new ServiceUserImpl();
    }

    @Test
    public void testFindById() {
         User notUser = new User();
         User cassie = new User(null,"Cassie","test de servicio");
         cassie.setId(1L);


         when(repository.findById(1L)).thenReturn(Optional.of(cassie));
         User user =service.findById(1L).orElse(notUser);


         assertThat(user.getId()).isEqualTo(1L);
         assertThat(user.getName()).isEqualTo("Cassie");
         assertThat(user.getComment()).isEqualTo("test de servicio");

    }
}
