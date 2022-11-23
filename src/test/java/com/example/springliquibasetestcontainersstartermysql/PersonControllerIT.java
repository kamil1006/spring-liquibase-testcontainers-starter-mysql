package com.example.springliquibasetestcontainersstartermysql;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

//@SpringBootTest
@AutoConfigureMockMvc
//@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PersonControllerIT extends BaseIT{

    @Autowired
    private MockMvc mockMvc;

    @Test
    @Order(1)
    public void getPeople() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(MockMvcResultMatchers.jsonPath("$",hasSize(4)));


    }

    @Test
    @Order(2)
    public void deletePeopleNo1() throws Exception {
        mockMvc.perform(delete("/"));
        mockMvc.perform(get("/"))
                .andExpect(MockMvcResultMatchers.jsonPath("$",hasSize(3)));


    }

}
