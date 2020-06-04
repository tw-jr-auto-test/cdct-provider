package com.thoughtworks.cdct;

import com.thoughtworks.cdct.domain.Person;
import com.thoughtworks.cdct.domain.PersonService;
import com.thoughtworks.cdct.user_interface.PersonRestController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ContractProviderApplication.class)
public abstract class PersonBase {

    @Autowired
    private PersonRestController personRestController;

    @MockBean
    private PersonService personService;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(personRestController);

        Mockito.when(personService.findPersonById(1L))
                .thenReturn(new Person(1L, "foo", "bee"));
    }

}