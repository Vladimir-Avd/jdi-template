package org.mytests.tests.example;

import com.epam.commons.map.MapArray;
import com.epam.jdi.uitests.core.interfaces.complex.tables.interfaces.ICell;
import org.mytests.uiobjects.example.site.epam.sections.JobTitle;
import org.testng.annotations.Test;
import static org.mytests.uiobjects.example.site.JDIExampleSite.supportPage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.complexTablePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.homePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.login;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;

import com.epam.web.matcher.testng.Assert;
import static com.epam.web.matcher.testng.Assert.areEquals;
import static org.mytests.uiobjects.example.site.epam.EpamSite.jobDescriptionPage;
import static org.mytests.uiobjects.example.site.epam.EpamSite.jobListingPage;

import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;

public class TableTest extends TestsBase {
    private Table table() {
        return jobListingPage.jobs;
    }

    @BeforeMethod
    public void before(Method method) {
        jobListingPage.shouldBeOpened();
        Assert.isFalse(table()::isEmpty);
    }

    @Test
    public void cellTest() {
        ICell cell = table().cell(1,1);
        System.out.println("====>" + cell.getText());
        Assert.areEquals(cell.getText(), "Test Automation Engineer (back-end)\nST-PETERSBURG, RUSSIA");
//        table().cell("apply",1).click();
        table().cell(1,1).click();
        jobDescriptionPage.checkOpened();
//        Assert.isTrue(() -> jobDescriptionPage.addCVForm.isDisplayed(), "ВКД не открылась");
//        Vetka - 2222
    }
    @Test
    public void cellTestSection() {
        ICell cell = table().cell(1,1);
        JobTitle jobTitle = cell.get(JobTitle.class);
        Assert.areEquals(jobTitle.name.getText(), "Test Automation Engineer (back-end)");
        Assert.areEquals(jobTitle.location.getText(), "ST-PETERSBURG, RUSSIA");
    }
}
