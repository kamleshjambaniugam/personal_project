package com.project.core.models.impl;

import com.project.core.models.Price;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,adapters = Price.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class PriceImpl implements Price {
    @Inject
    String number;
    @Inject
    String heading;
    @Inject
    String title;
    @Inject
    String tag1;
    @Inject
    String tag2;
    @Inject
    String tag3;


    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getTag1() {
        return tag1;
    }

    @Override
    public String getTag2() {
        return tag2;
    }

    @Override
    public String getTag3() {
        return tag3;
    }
}
