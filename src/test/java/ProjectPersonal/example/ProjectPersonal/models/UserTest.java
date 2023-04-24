package ProjectPersonal.example.ProjectPersonal.models;



import java.util.List;
import static org.mockito.Mockito.when;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import ProjectPersonal.example.ProjectPersonal.controllers.controllerUser;
import ProjectPersonal.example.ProjectPersonal.services.ServiceUser;

@WebMvcTest(controllers = controllerUser.class)
public class UserTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ServiceUser service;

    @Test

    void test_return_all_user() throws Exception{
        List<User> users = new ArrayList<>();

        User userN = new User(null, "Cassie", "test de modelsUser");


        users.add(userN);

        when(service.findAll()).thenReturn(users);
        MockHttpServletResponse resp = mockMvc.perform(get("/api/user").accept("application/json"))
        .andExpect(status().isOk())
        .andReturn()
        .getResponse();


        assertThat(resp.getStatus()).isEqualTo(200);
        assertThat(resp.getContentAsString()).contains("Cassie");
        assertThat(resp.getContentAsString()).contains("test de modelsUser");


    }
}
