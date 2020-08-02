package com.propertyfiles.propertyfiles.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix = "complex")
public class ComplexProperty extends BaseProperty {
}
