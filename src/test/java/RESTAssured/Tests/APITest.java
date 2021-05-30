package RESTAssured.Tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matcher.*;


public class APITest {

    @Test
   public void getAllBooksTest(){

        Response response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");

        System.out.println(response.getBody().asPrettyString());
        System.out.println(response.getStatusCode() );
        int statusCode = response.getStatusCode();

        assertFalse(   response.getBody().asPrettyString().isEmpty() );
        assertEquals(statusCode, 200);
    }

    @Test
    public void getBookTest(){

        given()
                .get("https://demoqa.com/BookStore/v1/Book?ISBN=9781593277574")
                .then()
                .log().all();

        Response response = RestAssured.get("https://demoqa.com/BookStore/v1/Book?ISBN=9781593277574");

        int statusCode = response.getStatusCode();

        assertFalse( response.getBody().asPrettyString().isEmpty() );
        assertTrue(  response.getBody().asPrettyString().contains("9781593277574") );
        assertEquals(statusCode, 200);

    }

    @Test
    public void getBookTestOneLiner(){

        given()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.first_name", hasItems("Michael") )
                .log().all();

    }

    @Test
    public void putTest(){
        JSONObject request = new JSONObject();

        request.put("name", "Lukasz");
        request.put("job", "Tester");

        System.out.println(request.toJSONString());

        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                    .when()
                .patch("https://reqres.in/api/users/2")
                    .then()
                .statusCode(200)
                .log()
                .all();

    }

    @Test
    public void deleteTest(){

                when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204)
                .log()
                .all();

    }

    @Test
    public void JsonServerTest(){
        baseURI = "http://localhost:3000/";

        given()
                .get("/users")
                .then()
                .statusCode(200)
                .log()
                .all();
    }

    @Test
    public void JsonServerTest2(){
        baseURI = "http://localhost:3000/";

        given()
                .param("name", "Pawel")
                .get("/users")
                .then()
                .statusCode(200)
                .log()
                .all();
    }


}
