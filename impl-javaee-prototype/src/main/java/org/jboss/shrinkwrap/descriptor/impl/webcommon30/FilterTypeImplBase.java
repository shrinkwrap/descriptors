package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptorBase;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMutableType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterTypeBase;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeModel;

/**
 * Base support for building implementations of {@link FilterType} and {@link FilterMutableType}.
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
abstract class FilterTypeImplBase<FILTERTYPE extends FilterTypeBase<FILTERTYPE, WEBAPPDESCRIPTORTYPE>, WEBAPPDESCRIPTORTYPE extends WebAppDescriptorBase<FILTERTYPE, WEBAPPDESCRIPTORTYPE>>
    implements FilterTypeBase<FILTERTYPE, WEBAPPDESCRIPTORTYPE>, NodeModel {

    private WEBAPPDESCRIPTORTYPE parent;
    private Node model;

    /**
     * Creates a new instance using the specified parent and the specified backing {@link Node} model
     * 
     * @param parent
     * @param model
     * @throws IllegalArgumentException
     *             If either the parent or model is not specified
     */
    FilterTypeImplBase(final WEBAPPDESCRIPTORTYPE parent, final Node model) throws IllegalArgumentException {
        if (parent == null) {
            throw new IllegalArgumentException("parent must be specified");
        }
        if (model == null) {
            throw new IllegalArgumentException("model must be specified");
        }
        this.parent = parent;
        this.model = model;
    }

    // TODO Add @Override
    // TODO Use the below JavaDoc
    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.Child#up()
     */
    @Override
    public final WEBAPPDESCRIPTORTYPE up() {
        return parent;
    }

    /**
     * Returns all <code>description</code> elements
     * 
     * @return list of <code>description</code>
     */
    // TODO Update documentation to the following:
    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterTypeBase#getAllDescription()
     */
    // TODO Add @Override
    @Override
    public List<String> getAllDescription() {
        final List<String> result = new ArrayList<String>();
        final List<Node> nodes = this.getRootNode().get("description");
        for (final Node node : nodes) {
            result.add(node.getText());
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.spi.node.NodeModel#getRootNode()
     */
    @Override
    public Node getRootNode() {
        return this.model;
    }
}
