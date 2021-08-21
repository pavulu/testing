package com.praveen.core.util.Impl;

import com.praveen.core.util.Utility;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.HashMap;
import java.util.Map;

@Component(service = Utility.class)
public class UtilityImpl implements Utility {

    @Reference
    ResourceResolverFactory resourceResolverFactory;

    @Override
    public ResourceResolver getResourceresolver() {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put(ResourceResolverFactory.SUBSERVICE, "readservice");
        try {
            return resourceResolverFactory.getServiceResourceResolver(params);
        } catch (LoginException e) {
            e.printStackTrace();
        }
        return null;
    }
}
