package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The method-attributes element can be used to specify which methods are
 * read only or idempotent. This is used to reduce the need for locks and replication.
 *
 *
 */
public interface MethodAttributesType<T> extends Child<T>
{

   public MethodAttributesType<T> removeAllMethod();

   public MethodType<MethodAttributesType<T>> method();

   public List<MethodType<MethodAttributesType<T>>> getMethodList();

}
