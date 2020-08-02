package com.propertyfiles.propertyfiles.properties;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseProperty  {

  protected  List<Property> property = new ArrayList<>();

  protected Map<String, String> stringMap = new HashMap<>();

  protected String threadLocal;


    public String getThreadLocal() {
        return threadLocal;
    }

    public void setThreadLocal(String threadLocal) {
        this.threadLocal = threadLocal;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public List<Property> getProperties() {
        return property;
    }

    public void setProperty(List<Property> property) {
        this.property = property;
    }
}
