package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user shold see fruits I like")
    public void user_shold_see_fruits_ı_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }

}
