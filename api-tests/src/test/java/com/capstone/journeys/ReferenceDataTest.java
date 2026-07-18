package com.capstone.journeys;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.capstone.clients.BookingApiClient;

import static io.restassured.RestAssured.given;

@Tag("journey")
public class ReferenceDataTest {
  @Test
  void shouldSearchFlightsAndBuses() {
    BookingApiClient client = new BookingApiClient();

    given()
        .spec(client.authSpec())
        .queryParam("from", "GOI")
        .queryParam("to", "PUN")
        .when()
        .get("/api/flights")
        .then()
        .statusCode(200)
        .body("flights", notNullValue())
        .body("flights.size()", greaterThan(0));

    given()
        .spec(client.authSpec())
        .queryParam("from", "GOI")
        .queryParam("to", "PUN")
        .when()
        .get("/api/buses")
        .then()
        .statusCode(200)
        .body("buses", notNullValue());
  }
}
