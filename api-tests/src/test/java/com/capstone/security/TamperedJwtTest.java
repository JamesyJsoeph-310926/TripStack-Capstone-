package com.capstone.security;

import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class TamperedJwtTest {
  @Test
  public void shouldRejectTamperedJwt() {
    Response response = given()
        .header("Authorization", "Bearer tampered-token")
        .when()
        .get("/api/auth/me");

    response.then().statusCode(401).body("error", equalTo("unauthorized"));
  }
}
