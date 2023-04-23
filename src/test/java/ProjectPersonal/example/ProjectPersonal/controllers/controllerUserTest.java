package ProjectPersonal.example.ProjectPersonal.controllers;

import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import ProjectPersonal.example.ProjectPersonal.models.User;
import ProjectPersonal.example.ProjectPersonal.services.ServiceUser;


@WebMvcTest (controllers = controllerUser.class)
public class controllerUserTest {
    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private ServiceUser service;
    

    /**
     * @throws Exception
     */
    @Test
    void test_return_all_user() throws Exception{
        List<User> users = new ArrayList<>();


    
        User userFemino  = new User(null, "Sophia", "realizando prueba de test");



      
        users.add(userFemino);

        when(service.findAll()).thenReturn(users);
        MockHttpServletResponse resp = mockMvc.perform(get("/api/user").accept("application/json"))
        .andExpect(status().isOk())
        .andReturn()
        .getResponse();


        assertThat(resp.getStatus()).isEqualTo(200);
        assertThat(resp.getContentAsString()).contains("Sophia");
        assertThat(resp.getContentAsString()).contains("realizando prueba de test");

    }


 
}
