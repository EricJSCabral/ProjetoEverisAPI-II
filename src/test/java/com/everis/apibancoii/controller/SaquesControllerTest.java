package com.everis.apibancoii.controller;

import com.everis.apibancoii.service.SaquesService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@WebMvcTest(SaquesController.class)
public class SaquesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private SaquesController saquesController;

    @MockBean
    private SaquesService saquesService;

    @BeforeEach
    public void setup(){
        standaloneSetup(this.saquesController);
    }

    @Test
    public void AlterarSaquesDeveAdicionarMaisUmSaque() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/conta/1234"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}