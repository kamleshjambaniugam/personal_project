package com.project.core.models.impl;

import com.project.core.models.HomeAbout;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
adaptables = Resource.class,
        adapters = HomeAbout.class,
//resourceType =HomeAbout.RESOURCE_TYPE,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HomeAboutImpl implements HomeAbout{
    @Inject
    @Default(values = "About Me")
    String about;

    @Inject
    String img;

    @Inject
    @Default(values = "Discover Now")
    String mybutton;

    @Inject
    @Default(values = " Personal Details")
    String details;

    @Inject
    @Default(values = "Here, I focus on a range of items and features that we use in life without giving them a second thought. such as Coca Cola. Dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.\n" )
    String intro;
    @Override
    public String getAbout() {
        return about;
    }

    @Override
    public String getDetails() {
        return details;
    }

    @Override
    public String getIntro() {
        return intro;
    }

    @Override
    public String getMyButton() {
        return mybutton;
    }

    @Override
    public String getImage() {
        return img;
    }

    //final protected static String RESOURCE_TYPE="";
}
