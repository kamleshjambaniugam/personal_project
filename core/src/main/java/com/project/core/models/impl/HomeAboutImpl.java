package com.project.core.models.impl;

import com.project.core.models.HomeAbout;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
adaptables = Resource.class,
        adapters = HomeAbout.class,
    resourceType =HomeAboutImpl.RESOURCE_TYPE,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson",extensions = "json")
public class HomeAboutImpl implements HomeAbout{
    static final String RESOURCE_TYPE="project/components/content/homeabout";
    @Inject

    String about;
    @Inject
    String path;

    @Inject
    String img;

    @Inject

    String mybutton;

    @Inject

    String details;

    @Inject
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

    @Override
    public String getPath() {
        return path;
    }

    //final protected static String RESOURCE_TYPE="";
}
