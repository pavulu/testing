package com.praveen.core.servlets;

import com.day.cq.wcm.msm.api.LiveCopy;
import com.praveen.core.util.Utility;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;

@Component(service = Servlet.class, name = "Test Servlet",
        property = {
                "sling.servlet.resourceTypes=" + "sling/servlet/default",
                "sling.servlet.selectors=" + "testing",
                "sling.servlet.extensions=" + "json"
        })
public class TestServlet extends SlingSafeMethodsServlet {

    private static final Logger logger = LoggerFactory.getLogger(TestServlet.class.getName());

    @Reference
    Utility utility;


    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) {

    }
}
