package com.propertyfiles.propertyfiles.controller;

import com.propertyfiles.propertyfiles.properties.ComplexProperty;
import com.propertyfiles.propertyfiles.properties.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController("*")
public class PropertyController {

    @Autowired
    ComplexProperty complexProperty;

    @GetMapping("*")
    public List<Property> getProperties(){
        return complexProperty.getProperties();
    }

    @GetMapping("map")
    public Map<String, String> getMap(){
        return complexProperty.getStringMap();
    }

    @GetMapping("capCase")
    public String getcapCase(){
        return complexProperty.getThreadLocal();
    }

}
