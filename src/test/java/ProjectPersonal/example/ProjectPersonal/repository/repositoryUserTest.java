package ProjectPersonal.example.ProjectPersonal.repository;



import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;

import ProjectPersonal.example.ProjectPersonal.models.User;


@SpringBootTest
public class repositoryUserTest {

    //integracion

    @Autowired
   private  repositoryUser repository;

 
  @Test
  public void test_findAllUser(){

    User user1 = new User();
    user1.setName("Giaco");
    user1.setComment("Backend");
    repository.save(user1);


    User user2 = new User();
    user2.setName("Maria");
    user2.setComment("Frontend");
    repository.save(user2);


    List<User> users = repository.findAll();
    assertThat(users).isNotEmpty();
  }



   @Test
   public void save_users(){
    User user = new User();
    user.setName("Giaco");
    user.setComment("realizando test del repository");

    User savedUser = repository.save(user);
    assertThat(savedUser.getId()).isNotNull();
   }











  


}
