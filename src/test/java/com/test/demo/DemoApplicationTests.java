package com.test.demo;

import com.test.demo.controllers.PersonController;
import com.test.demo.models.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;



@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private PersonController controller;

    @Test
    public void controllerLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void getPersonURLReturnsURL() throws Exception {

        String res = controller.showPersonForm(new Person());
        assertThat(res).isEqualTo("person");
    }

//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void shouldReturnDefaultMessage() throws Exception {
//        this.mockMvc.perform(get("/person")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("person")));
//    }

}
