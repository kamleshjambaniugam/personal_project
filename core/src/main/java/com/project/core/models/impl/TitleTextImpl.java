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
    Boolean paddingbottom;
    @Inject
    Boolean css;

    @Inject
    Boolean sectiongap;

    @Inject
    String title;

    @Inject
    String info;
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public Boolean getPaddingBottom() {
        return paddingbottom;
    }

    @Override
    public Boolean getSectionGap() {
        return sectiongap;
    }

    @Override
    public Boolean getCss() {
        return css;
    }
}
