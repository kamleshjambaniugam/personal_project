package com.project.core.models.impl;


import com.project.core.models.HomeAbout;
import com.project.core.models.HomeBanner;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        adapters = HomeBanner.class,
//resourceType =HomeAbout.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HomeBannerImpl implements HomeBanner {
    @Inject
    @Default(values = "This is me")
    String bio;

    @Inject
    @Default(values = "Discover Now")
    String mybutton;

    @Inject
    @Default(values = " Philip Gilbert")
    String fullname;

    @Inject
    @Default(values = "You will begin to realise why this exercise is called the Dickens Pattern with reference to the ghost showing Scrooge some different futures.\n" )
    String intro;

    @Inject
    String buttonTitle;

    @Inject
    String img;

    @Override
    public String getBio() {
        return bio;
    }

    @Override
    public String getFullName() {
        return fullname;
    }

    @Override
    public String getIntro() {
        return intro;
    }

    @Override
    public String getImage() {
        return img;
    }

    @Override
    public String getMyButton() {
        return mybutton;
    }

}