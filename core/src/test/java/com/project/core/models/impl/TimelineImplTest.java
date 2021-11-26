package com.project.core.models.impl;

import com.project.core.models.Timeline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class TimelineImplTest {
    private final AemContext aemContext=new AemContext();
    private Timeline timeline;
    @BeforeEach
    void setUp() {
        aemContext.addModelsForClasses(TimelineImpl.class);
        aemContext.load().json("/com/project/core/models/impl/Timeline.json","/component");
    }

    @Test
    void getTimelineDetails() {
        aemContext.currentResource("/component/timeline");
        timeline = aemContext.request().adaptTo(Timeline.class);
        assertEquals(5, timeline.getTimelineDetails().size());
        assertEquals("Masters in Graphics & Fine Arts", timeline.getTimelineDetails().get(0).get("title"));
        assertEquals("Session: 2010-11", timeline.getTimelineDetails().get(0).get("text1"));
        assertEquals("Result: 3.78 (In the Scale of 4.00)", timeline.getTimelineDetails().get(0).get("text2"));
    }

}