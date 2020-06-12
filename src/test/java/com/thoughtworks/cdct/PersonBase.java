package com.thoughtworks.cdct;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public abstract class PersonBase {
    @BeforeEach
    public void setup() {
        RestAssured.baseURI = "http://oms:8000";
    }
}