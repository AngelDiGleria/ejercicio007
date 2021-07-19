package es.cic.bootcamp.ejercicio007;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 	 


@SpringBootTest
@AutoConfigureMockMvc
public class StatusIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateRetrieveWithMockMVC() throws Exception {
        this.mockMvc.perform(post("/arranque")).andExpect(status().is2xxSuccessful());
    }
}
