package com.vmttx.step_definitions;

import com.vmttx.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class PropertiesStepDefinitions {
    Pages pages = new Pages();

    @Then("following table headers should be displayed")
    public void following_table_headers_should_be_displayed(List<String> values) {
        Assert.assertEquals(values, pages.propertiesPage().getTableHeaders());
    }
}
