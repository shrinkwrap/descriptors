package org.jboss.shrinkwrap.descriptor.api.webpartialresponse20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface PartialResponseType<T> extends Child<T>
{
   public PartialResponseType<T> setChanges(PartialResponseChangesType<T> changes);

   public PartialResponseChangesType<PartialResponseType<T>> getChanges();

   public PartialResponseType<T> setRedirect(PartialResponseRedirectType<T> redirect);

   public PartialResponseRedirectType<PartialResponseType<T>> getRedirect();

   public PartialResponseType<T> setError(PartialResponseErrorType<T> error);

   public PartialResponseErrorType<PartialResponseType<T>> getError();
}
