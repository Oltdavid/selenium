package web.app.api;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StudentService {

    private static final String BASE_URL = "http://localhost:8080/students";

    // Fetches all students.
    public Response getStudents() {
        return RestAssured.given().filter(new AllureRestAssured()).log().uri().when().get(BASE_URL);
    }

    // Fetches a student by ID.
    public Response getStudentById(int id) {
        return RestAssured.given().filter(new AllureRestAssured()).queryParam("id", id).log().uri().when().get(BASE_URL);
    }

    // Creates a student.
    public Response createStudent(Student body) {
        return RestAssured.given().filter(new AllureRestAssured()).header("Content-Type", "application/json").body(body).log().uri().when().post(BASE_URL);
    }

    // Updates a student with the given ID.
    public Response updateStudent(int id, Student body) {
        return RestAssured.given().filter(new AllureRestAssured()).header("Content-Type", "application/json").body(body).log().uri().when().put(BASE_URL + "/{id}", id);
    }

    // Deletes a student with the given ID.
    public Response deleteStudent(int id) {
        return RestAssured.given().filter(new AllureRestAssured()).log().uri().when().delete(BASE_URL + "/{id}", id);
    }
}