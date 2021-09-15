package com.project.core.models.impl;

import com.project.core.models.Brand;
import com.project.core.models.HomeBanner;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Model(
        adaptables = Resource.class,
        adapters = Brand.class,
//resourceType =HomeAbout.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class BrandImpl implements Brand{
    @Inject
    List<String> imgpath;


    @Override
    public List<String> getBrands() {
        if (imgpath!= null) {
            return new ArrayList<String>(imgpath);
        } else {
            return Collections.emptyList();
        }
    }
}
