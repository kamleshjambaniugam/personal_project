package com.project.core.models.impl;

 ;
 import com.day.cq.wcm.api.Page;
 import com.project.core.models.MenuNav;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = MenuNav.class,
//resourceType =HomeAbout.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)

public class MenuNavImpl implements MenuNav{
    @ScriptVariable
    Page currentPage;


    @ValueMapValue
    String title1;


    @ValueMapValue
    String path1;


    @Override
    public String getHeading() {
        return currentPage.getTitle();
    }

    @Override
    public String getTitle1() {
        return title1;
    }

    @Override
    public String getTitle2() {
        return currentPage.getTitle();
    }

    @Override
    public String getPath1() {
        return path1;
    }

    @Override
    public String getPath2() {
        return currentPage.getPath();
    }
}
