package ru.korndev.apitest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

class ApiTest1 {
  @Test
// код теста
      .then()
          .statusCode(200)
          // static import для JsonSchemaValidator.matchesJsonSchemaInClasspath
          .body(matchesJsonSchemaInClasspath("accounts.schema.json"))
      ;
}
