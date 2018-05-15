package org.mytests.uiobjects.example.entities;

//public class JobSearchFilter {
//}
//
//package com.epam.jdi.entities;

        import com.epam.commons.DataClass;
        import org.mytests.uiobjects.example.enums.JobCategories;

        import static org.mytests.uiobjects.example.enums.JobCategories.QA;
        import static org.mytests.uiobjects.example.enums.Locations.SAINT_PETERSBURG;

//        import static org.mytests.uiobjects.example.enums.JobCategories.QA;

/**
 * Created by Roman_Iovlev on 10/22/2015.
 */

/*@AllArgsConstructor
@NoArgsConstructor*/
public class JobSearchFilter extends DataClass {
    public CharSequence keywords = "Test Automation Engineer (back-end)";
    public JobCategories category = QA;
    public String location = SAINT_PETERSBURG.value;
    public JobSearchFilter(){ }

    public JobSearchFilter(CharSequence keywords, JobCategories category,String location ){
        this.keywords=keywords;
        this.category=category;
        this.location=location;
    }

}
