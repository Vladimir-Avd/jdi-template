package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.core.interfaces.complex.tables.interfaces.ITable;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import org.openqa.selenium.support.FindBy;
//https://epam.github.io/JDI/support.html
@JPage(url = "/support.html", title = "Support")
public class SupportPage extends WebPage {
    @FindBy(css = "table")
    public ITable testSimpleTB;

}
