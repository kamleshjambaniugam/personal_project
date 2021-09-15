package com.project.core.models.impl;

import com.project.core.models.Brand;
import com.project.core.models.Footer;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        adapters = Footer.class,
//resourceType =HomeAbout.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)

public class FooterImpl implements Footer {
    @Inject
    String title;
    @Inject
    String description;
    @Inject
    String title1;
    @Inject
    String heading;
    @Inject
    String title2;
    @Inject
    String heading2;
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getTitle1() {
        return title1;
    }

    @Override
    public String getHeading2() {
        return heading2;
    }

    @Override
    public String getTitle2() {
        return title2;
    }
}
