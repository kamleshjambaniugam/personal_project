package com.project.core.models.impl;

import com.project.core.models.HomeBanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class HomeBannerImplTest {
    private final AemContext aemContext=new AemContext();
    private HomeBanner homeBanner;

    @BeforeEach
    void setUp() {
        aemContext.addModelsForClasses(HomeBannerImpl.class);
        aemContext.load().json("/com/project/core/models/impl/HomeBanner.json","/component");
    }

    @Test
    void getBio() {
        aemContext.currentResource("/component/homeBanner");
        HomeBanner homeBanner = aemContext.request().adaptTo(HomeBanner.class);
        final String expected="This is me";
        String actual = homeBanner.getBio();
        assertEquals(expected,actual);
    }

    @Test
    void getFullName() {
        aemContext.currentResource("/component/homeBanner");
        HomeBanner homeBanner = aemContext.request().adaptTo(HomeBanner.class);
        final String expected="Philip Gilbert";
        String actual = homeBanner.getFullName();
        assertEquals(expected,actual);
    }

    @Test
    void getIntro() {
        aemContext.currentResource("/component/homeBanner");
        HomeBanner homeBanner = aemContext.request().adaptTo(HomeBanner.class);
        final String expected="You will begin to realise why this exercise is called the Dickens Pattern with reference to the ghost showing Scrooge some different futures.";
        String actual = homeBanner.getIntro();
        assertEquals(expected,actual);
    }

    @Test
    void getImage() {
        aemContext.currentResource("/component/homeBanner");
        HomeBanner homeBanner = aemContext.request().adaptTo(HomeBanner.class);
        final String expected="/content/dam/project/hero-img.png";
        String actual = homeBanner.getImage();
        assertEquals(expected,actual);
    }

    @Test
    void getMyButton() {
        aemContext.currentResource("/component/homeBanner");
        HomeBanner homeBanner = aemContext.request().adaptTo(HomeBanner.class);
        final String expected="discover now";
        String actual = homeBanner.getMyButton();
        assertEquals(expected,actual);
    }

    @Test
    void getPath() {
        aemContext.currentResource("/component/homeBanner");
        HomeBanner homeBanner = aemContext.request().adaptTo(HomeBanner.class);
        final String expected="/content/project/us/en/about";
        String actual = homeBanner.getPath();
        assertEquals(expected,actual);
    }
}