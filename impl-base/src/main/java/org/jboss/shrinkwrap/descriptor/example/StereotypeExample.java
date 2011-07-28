package org.jboss.shrinkwrap.descriptor.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;

@Alternative
@Stereotype
@Retention(RetentionPolicy.RUNTIME)
public @interface StereotypeExample
{
}
