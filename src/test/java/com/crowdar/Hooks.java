package com.crowdar;
import com.crowdar.examples.services.ApiHelperService;
import io.cucumber.java.After;

public class Hooks {
    @After(value="@DeleteTimeEntrie")
    public void delete(){
        ApiHelperService.deleteTimeEntry();
    }
}


