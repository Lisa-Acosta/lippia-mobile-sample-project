package com.crowdar.examples.services;
import com.crowdar.core.PropertyManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ApiHelperService {
    static String baseUrl = "https://api.clockify.me/api/v1";
    static String apiKey = PropertyManager.getProperty("x-api-key");
    public static String[] getWorkspace(){
        RestAssured.baseURI = baseUrl +"/workspaces";
        String response = RestAssured.given().log().all()
                .header("Content-type", "application/json")
                .header("x-api-key", apiKey)
                .when()
                .get()
                .then().assertThat().log().all().statusCode(200)
                .extract().response().body().prettyPrint();

        JsonPath jsonPathEvaluator = JsonPath.from(response.toString());
        String[] workspaceAndUser = {jsonPathEvaluator.get("[1].id"), jsonPathEvaluator.get("[1].memberships[0].userId")};
        return workspaceAndUser;
    }
    public static String getTimeEntrys(String[] workspaceIdUser, String nameTimeEntry){
        RestAssured.baseURI = baseUrl +"/workspaces/"+workspaceIdUser[0]+"/user/"+workspaceIdUser[1]+"/time-entries";
        String response = RestAssured.given().log().all()
                .header("Content-type", "application/json")
                .header("x-api-key", apiKey)
                .header("cache-control", "no-cache")
                .when()
                .get()
                .then().assertThat().log().all().statusCode(200)
                .extract().response().body().prettyPrint();

        String idTimeEntry = null;
        int i = 0;
        JsonPath jsonPathEvaluator = JsonPath.from(response.toString());
        while (jsonPathEvaluator.get("["+i+"].id")!=null){
            if(jsonPathEvaluator.get("["+i+"].description").toString().equalsIgnoreCase(nameTimeEntry)) idTimeEntry = jsonPathEvaluator.get("["+i+"].id");
            i++;
        }
        return idTimeEntry;
    }
    public static void deleteTimeEntry( ){
        String[] workspaceIdUser = getWorkspace();
        String workspaceId = workspaceIdUser[0];
        String nameTimeEntrie = "TP Final";
        String idTimeEntry = getTimeEntrys(workspaceIdUser, nameTimeEntrie);
        RestAssured.baseURI = baseUrl +"/workspaces/"+workspaceId+"/time-entries" +
                "/"+idTimeEntry;

        String response = RestAssured.given().log().all()
                .header("Content-type", "application/json")
                .header("x-api-key", apiKey)
                .header("cache-control", "no-cache")
                .when()
                .delete()
                .then().assertThat().log().all().statusCode(204)
                .extract().response().toString();

        JsonPath jsonPathEvaluator = JsonPath.from(response.toString());
        System.out.println(jsonPathEvaluator);
    }
}