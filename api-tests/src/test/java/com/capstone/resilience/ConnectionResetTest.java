package com.capstone.resilience;

import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class ConnectionResetTest {
  @Test
  public void shouldSurfaceConnectionResetFailure() {
    Response response = given()
        .when()
        .get("/api/bookings");

    response.then().statusCode(500).body("error", equalTo("connection reset"));
  }
}
