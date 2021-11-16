package com.project.core.models.impl;


import com.project.core.models.Testimonial;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
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
        resourceType =TestimonialImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson",extensions = "json",selector = "Testimonial")
public class TestimonialImpl implements Testimonial {
    static final String RESOURCE_TYPE="project/components/content/testimonial";

    private static final Logger LOG = LoggerFactory.getLogger(TestimonialImpl.class);
   @ChildResource 
    Resource testimonialdetailswithmap;
    @Override
    public List<Map<String, String>> getTestimonialDetails() {
        List<Map<String, String>> TestimonialDetailsMap= new ArrayList<>();
        try {
            //Resource testDetail=componentResource.getChild("testimonialdetailswithmap");
            if( testimonialdetailswithmap!=null){
                for (Resource fact :  testimonialdetailswithmap.getChildren()) {
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
