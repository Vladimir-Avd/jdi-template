package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.core.interfaces.complex.tables.interfaces.ITable;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import org.mytests.uiobjects.example.site.sections.LoginForm;
import org.openqa.selenium.support.FindBy;

@JPage(url = "/complex-table.html", title = "Complex Table")
public class ComplexTablePage extends WebPage {
    @FindBy(css = "#complex-table")
    public Table testTB;
}