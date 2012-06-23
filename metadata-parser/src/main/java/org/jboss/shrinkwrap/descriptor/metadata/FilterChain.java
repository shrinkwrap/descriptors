package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.metadata.filter.AttributeFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.AttributeGroupFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.ComplexTypeFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.ElementFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.EnumFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.ExtensionFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.Filter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.GroupFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.ListFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.RestrictionFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.SimpleContentFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.UnionFilter;
import org.jboss.shrinkwrap.descriptor.metadata.filter.XsdElementEnum;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

/**
 * Class that allows to traverse a DOM document by using a TreeWalker.
 * <p>
 * This class is refactored from the MetadataParser in order to test
 * the filtering of w3c elements in isolation.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 *
 */
public class FilterChain {

	private final static String ELEMENT_LOG = "%s- %s name: %s";

	private final List<Filter> filterList = new ArrayList<Filter>();

    private int seqNo = 0;

	public FilterChain() {
		filterList.add(new GroupFilter());
		filterList.add(new ElementFilter());
		filterList.add(new EnumFilter());
		filterList.add(new AttributeFilter());
		filterList.add(new AttributeGroupFilter());
		filterList.add(new RestrictionFilter());
		filterList.add(new ComplexTypeFilter());
//		filterList.add(new SimpleContentFilter()); // simpleContent used for text only types are not supported currently
		filterList.add(new ExtensionFilter());
		filterList.add(new UnionFilter());
		filterList.add(new ListFilter());
	}

	/**
	 * Traverses the DOM and applies the filters for each visited node.
	 * 
	 * @param walker
	 * @param indent
	 * @param sb
	 *            Optional {@link StringBuilder} used to track progress for
	 *            logging purposes.
	 */
	public void traverseAndFilter(final TreeWalker walker, final String indent,
			final Metadata metadata, final Integer currSeqNo, final StringBuilder sb) {
		
		final Node parend = walker.getCurrentNode();

		final boolean isLogged = appendText(indent, (Element) parend, sb);
		
		Integer nodeSeqNo = null;
		if (XsdElementEnum.sequence.isTagNameEqual(((Element) parend).getTagName())) {
	        nodeSeqNo = ++seqNo;
	    }
		
		metadata.setCurrentSeqNo(currSeqNo);
		for (final Filter filter : filterList) {
			if (filter.filter(metadata, walker)) {
				appendText(" catched by: " + filter.getClass().getSimpleName() + " seqNo: " + currSeqNo, sb);
				break;
			}
		}

		if (isLogged) {
			appendText("\n", sb);
		}

		for (Node n = walker.firstChild(); n != null; n = walker.nextSibling()) {
			traverseAndFilter(walker, indent + "  ", metadata, nodeSeqNo, sb);
		}

		walker.setCurrentNode(parend);
	}
	
	// --------------------------------------------------------------------------------------||
	// -- Private Methods -------------------------------------------------------------------||
	// --------------------------------------------------------------------------------------||
		
	/**
	 * Appends the given text.
	 */
	private boolean appendText(final String text, final StringBuilder sb) {
		if (sb != null) {
			if (text != null && text.indexOf(":annotation") < 0 && text.indexOf(":documentation") < 0) {
				sb.append(text);
				return true;
			}
		}
		return false;
	}
	

	/**
	 * Appends the given element. 
	 */
	private boolean appendText(final String indent, final Element element, final StringBuilder sb) {
		if (sb != null) {
			if (element.getTagName().indexOf(":annotation") < 0 && 
				element.getTagName().indexOf(":documentation") < 0) {
			        sb.append(String.format(ELEMENT_LOG, indent, 
			    	  element.getTagName(), element.getAttribute("name")));
			        return true;
			}
		}
		return false;
	}
}
