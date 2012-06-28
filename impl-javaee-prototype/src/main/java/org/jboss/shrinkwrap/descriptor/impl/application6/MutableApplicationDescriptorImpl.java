package org.jboss.shrinkwrap.descriptor.impl.application6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.api.application5.MutableApplicationType;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.application5.MutableApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * <p>
 * This deployment descriptor provides the functionalities as described in the
 * specification
 * <p>
 * Example:
 * <p>
 * <code> 
 *     MutableApplicationDescriptorImpl descriptor = Descriptors.create(MutableApplicationDescriptorImpl.class);
 * </code>
 * 
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public final class MutableApplicationDescriptorImpl
		extends
		ApplicationDescriptorBaseImpl<MutableApplicationType, MutableApplicationDescriptor>
		implements MutableApplicationDescriptor {

	public MutableApplicationDescriptorImpl(final String descriptorName,
			final Node model) {
		super(descriptorName, model);
	}

	public MutableApplicationDescriptorImpl(final String descriptorName) {
		super(descriptorName);
	}

	public ApplicationDescriptor toImmutable() {
		return new ApplicationDescriptorImpl(this.getDescriptorName(),
				this.getRootNode());
	}

	public MutableApplicationType getRoot() {
		return new ApplicationTypeMutableImpl(this, getRootNode());
	}

	@Override
	public MutableApplicationType description(String... values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType removeAllDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType displayName(String... values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType removeAllDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType applicationName(String applicationName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getApplicationName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType removeApplicationName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModuleType<MutableApplicationType> getOrCreateModule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModuleType<MutableApplicationType> createModule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModuleType<MutableApplicationType>> getAllModule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType removeAllModule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType libraryDirectory(String libraryDirectory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLibraryDirectory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType removeLibraryDirectory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType version(String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationType removeVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MutableApplicationDescriptor up() {
		// TODO Auto-generated method stub
		return null;
	}
}
