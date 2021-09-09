package com.project.core.models.impl;

import com.project.core.models.Portfolio;
import com.project.core.models.Services;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,adapters = Portfolio.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PortfolioImpl implements Portfolio{
    @Inject
    String title;

    @Inject
    String type;

    @Inject
    String img;
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getImage() {
        return img;
    }
}
