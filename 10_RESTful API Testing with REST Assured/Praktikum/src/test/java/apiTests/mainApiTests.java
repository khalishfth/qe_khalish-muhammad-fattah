package apiTests;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.IsEqual.equalTo;


public class mainApiTests {
    @Test
    public void getAllPosts() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get("/posts")
                .then()
                .log().all()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

    @Test
    public void getAllPostsFailed() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get("/posts/invalid_endpoint")
                .then()
                .log().all()
                .statusCode(404);
    }

    @Test
    public void createNewPosts() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId", 1);
        requestParams.put("title", "Test Post");
        requestParams.put("body", "This is a test post");

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(requestParams.toJSONString())
                .when()
                .log().all()
                .post("/posts")
                .then()
                .log().all()
                .statusCode(201)
                .body("userId", equalTo(1))
                .body("title", equalTo("Test Post"))
                .body("body", equalTo("This is a test post"))
                .body("id", notNullValue());
    }

    @Test
    public void createNewPostsFailed() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId", true);
        requestParams.put("title", "foo");
        requestParams.put("body", "1");
        requestParams.put("id", false);

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .header("Authorization", "invalid_token")
                .body(requestParams.toJSONString())
                .when()
                .log().all()
                .post("/posts/1")
                .then()
                .log().all()
                .statusCode(404);
    }

    @Test
    public void getPostsById() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get("/posts/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1))
                .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                .body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
    }

    @Test
    public void getPostsByIdFailed() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get("/posts/invalid_id")
                .then()
                .log().all()
                .statusCode(404);
    }

    @Test
    public void editPostsById() {
        String updatedTitle = "Updated Title";
        String updatedBody = "Updated Body";

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body("{\"id\":1,\"userId\":1,\"title\":\"" + updatedTitle + "\",\"body\":\"" + updatedBody + "\"}")
                .when()
                .log().all()
                .put("/posts/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1))
                .body("title", equalTo(updatedTitle))
                .body("body", equalTo(updatedBody));
    }

    @Test
    public void editPostsByIdFailed() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body("{\"id\":9999,\"userId\":1,\"title\":\"Updated Title\",\"body\":\"Updated Body\"}")
                .when()
                .log().all()
                .put("/posts/9999")
                .then()
                .log().all()
                .statusCode(500);
    }

    @Test
    public void deletePostsById() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .delete("/posts/1")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void deletePostsByIdFailed() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .delete("/posts")
                .then()
                .log().all()
                .statusCode(404);
    }

//    @Test
//    public void testingMethod() {
//
//    }

    // .baseUri("https://jsonplaceholder.typicode.com")
    // .log().all()
//    .body(matchesJsonSchemaInClasspath(""));
}
