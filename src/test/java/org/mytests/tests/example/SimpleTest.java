package org.mytests.tests.example;

import com.epam.commons.map.MapArray;
import com.epam.jdi.uitests.core.interfaces.complex.tables.interfaces.ICell;
import org.testng.annotations.Test;
import static org.mytests.uiobjects.example.site.JDIExampleSite.supportPage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.complexTablePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.homePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.login;

import com.epam.web.matcher.testng.Assert;
import static com.epam.web.matcher.testng.Assert.areEquals;

public class SimpleTest extends SimpleTestsInit {

    @Test
    public void loginTest() {
        homePage.open();
        login();
        homePage.checkOpened();

        // ----------- работа с таблицей
        supportPage.open();
        System.out.println("== rows ====");
        System.out.println(supportPage.testSimpleTB.rows().count()); // работает!!!
        System.out.println("-- columns -");
        System.out.println(supportPage.testSimpleTB.columns().count()); // работает !!!

        System.out.println(supportPage.testSimpleTB.getText());  // работает !!!

//        ----- А это НЕ работает -------------
        MapArray <String,ICell> mRows = complexTablePage.testTB.row(1); // Получим:  java.lang.AssertionError: Failed to do 'Get web element' action.
        // Reason: java.lang.AssertionError: Do action Get web element failed. Can't get result. Reason: java.lang.AssertionError:
        // Can't find Element 'Table 'Test TB' (ComplexTablePage.testTB; ; cssSelector='#complex-table')' during 0 seconds


        supportPage.testSimpleTB.cell(1,1);  //если закоментить пред. строку то получим java.lang.NullPointerException
    }
//    private Table table() {
//        return jobListingPage.jobs;
//    }
//
//        @BeforeMethod
//        public void before(Method method) {
//            jobListingPage.shouldBeOpened();
//            Assert.isFalse(table()::isEmpty);
//        }
//
//    @Test
//    public void cellTest() {
//        ICell cell = table().cell(1,1);
//        Assert.areEquals(cell.getText(), "Test Automation Engineer (back-end)\nST-PETERSBURG, RUSSIA");
//        table().cell("apply",1).click();
//        jobDescriptionPage.checkOpened();
//    }
//        @Test
//        public void cellTestSection() {
//            ICell cell = table().cell(1,1);
//            JobTitle jobTitle = cell.get(JobTitle.class);
//            Assert.areEquals(jobTitle.name.getText(), "Test Automation Engineer (back-end)");
//            Assert.areEquals(jobTitle.location.getText(), "ST-PETERSBURG, RUSSIA");
//        }
//    @Test
//    public void simpTest() {
//        homePage.open();
//        login();
//        homePage.checkOpened();
//
//        // ----------- работа с таблицей
//        supportPage.open();
//        System.out.println("== rows ====");
//        System.out.println(supportPage.testSimpleTB.rows().count()); // работает!!!
//        System.out.println("-- columns -");
//        System.out.println(supportPage.testSimpleTB.columns().count()); // работает !!!
//
//        System.out.println(supportPage.testSimpleTB.getText());  // работает !!!
//
////        ----- А это НЕ работает -------------
//        MapArray <String,ICell> mRows = complexTablePage.testTB.row(1); // Получим:  java.lang.AssertionError: Failed to do 'Get web element' action.
//        // Reason: java.lang.AssertionError: Do action Get web element failed. Can't get result. Reason: java.lang.AssertionError:
//        // Can't find Element 'Table 'Test TB' (ComplexTablePage.testTB; ; cssSelector='#complex-table')' during 0 seconds
//
//
//        supportPage.testSimpleTB.cell(1,1);  //если закоментить пред. строку то получим java.lang.NullPointerException
//    }

}
