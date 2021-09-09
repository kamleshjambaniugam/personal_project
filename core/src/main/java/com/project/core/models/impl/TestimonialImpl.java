package com.project.core.models.impl;


import com.project.core.models.Testimonial;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = Testimonial.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TestimonialImpl implements Testimonial {
    private static final Logger LOG = LoggerFactory.getLogger(TestimonialImpl.class);
    @Inject
    Resource componentResource;
    @Override
    public List<Map<String, String>> getTestimonialDetails() {
        List<Map<String, String>> TestimonialDetailsMap= new ArrayList<>();
        try {
            Resource testDetail=componentResource.getChild("testimonialdetailswithmap");
            if( testDetail!=null){
                for (Resource fact :  testDetail.getChildren()) {
                    Map<String,String> testMap=new HashMap<>();
                    testMap.put("description",fact.getValueMap().get("description",String.class));
                    testMap.put("heading",fact.getValueMap().get("heading",String.class));
                    testMap.put("title",fact.getValueMap().get("title",String.class));
                    TestimonialDetailsMap.add(testMap);
                }
            }
        }catch (Exception e){
            LOG.info("\n ERROR while getting Book Details {} ",e.getMessage());
        }
        LOG.info("\n SIZE {} ",TestimonialDetailsMap.size());
        return TestimonialDetailsMap;
    }
}
