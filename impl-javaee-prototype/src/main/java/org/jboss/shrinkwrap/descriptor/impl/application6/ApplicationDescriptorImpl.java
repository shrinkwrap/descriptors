package org.jboss.shrinkwrap.descriptor.impl.application6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationType;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleTypeReader;
import org.jboss.shrinkwrap.descriptor.api.application5.MutableApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ApplicationDescriptorImpl descriptor = Descriptors.create(ApplicationDescriptorImpl.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public final class ApplicationDescriptorImpl extends ApplicationDescriptorBaseImpl<ApplicationType,ApplicationDescriptor>
    implements ApplicationDescriptor {

   public ApplicationDescriptorImpl(final String descriptorName, final Node model)   {
      super(descriptorName, model);
   }

   public ApplicationDescriptorImpl(final String descriptorName)   {
      super(descriptorName);
   }

   public MutableApplicationDescriptor toMutable() {
       return new MutableApplicationDescriptorImpl(this.getDescriptorName(), this.getRootNode());
   }

   public ApplicationType getRoot()
   {
       return new ApplicationTypeImpl(this, getRootNode());
   }

@Override
public List<String> getAllDescription() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<String> getAllDisplayName() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getApplicationName() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<ModuleTypeReader<ApplicationType>> getAllModule() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getLibraryDirectory() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getVersion() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ApplicationDescriptor up() {
	// TODO Auto-generated method stub
	return null;
}
}
