package com.project.core.models.impl;

import com.project.core.models.TitleText;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,adapters = TitleText.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TitleTextImpl implements TitleText{
    @Inject
    @Default(values = "My Offered Services")
    String title;

    @Inject
    @Default(values = "At about this time of year, some months after New Year’s resolutions have been made and kept, or made and neglected.")
    String info;
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getInfo() {
        return info;
    }
}
