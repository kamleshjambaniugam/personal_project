package com.project.core.models.impl;

import com.project.core.models.Blog;
import com.project.core.models.Portfolio;
import com.project.core.models.Services;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,adapters = Blog.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogImpl implements Blog{
    @Inject
    String title;

    @Inject
    String description;

    @Inject
    String img;
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getImage() {
        return img;
    }
}

