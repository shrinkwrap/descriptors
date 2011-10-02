package org.jboss.shrinkwrap.descriptor.cli;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltTransformer
{

   /** 
    * Simple transformation method. 
    * @param sourcePath - Absolute path to source xml file. 
    * @param xsltPath - Absolute path to xslt file. 
    * @param resultDir - Directory where you want to put resulting files. 
    * @param parameters - Map defining global XSLT parameters based via tranformer to the XSLT file. 
    * @throws TransformerException 
    */
   public static void simpleTransform(final String sourcePath, final String xsltPath, final String resultDir,
         final Map<String, String> parameters) throws TransformerException
   {
      final TransformerFactory tFactory = TransformerFactory.newInstance();
      final Transformer transformer = tFactory.newTransformer(new StreamSource(new File(xsltPath)));
      applyParameters(transformer, parameters);
      transformer.transform(new StreamSource(new File(sourcePath)), new StreamResult(new File(resultDir)));
   }

   /** 
    * Simple transformation method. 
    * @param sourcePath - Absolute path to source xml file. 
    * @param StreamSource - the xslt file. 
    * @param resultDir - Directory where you want to put resulting files. 
    * @param parameters - Map defining global XSLT parameters based via tranformer to the XSLT file. 
    * @throws TransformerException 
    */
   public static void simpleTransform(final String sourcePath, final StreamSource xsltSource, 
         final String resultDir, final Map<String, String> parameters) throws TransformerException
   {
      final TransformerFactory tFactory = TransformerFactory.newInstance();
      final Transformer transformer = tFactory.newTransformer(xsltSource);
      applyParameters(transformer, parameters);
      transformer.transform(new StreamSource(new File(sourcePath)), new StreamResult(new File(resultDir + "/metadata.xml")));
   }

   /**
    * Applies all key/value pairs as defined by the given <code>Map</code> to the given <code>Transformer</code> instance.
    * @param transformer
    * @param parameters
    */
   @SuppressWarnings("unchecked")
   private static void applyParameters(final Transformer transformer, final Map<String, String> parameters)
   {
      final Set keys = parameters.keySet();
      for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();)
      {
         final String key = iterator.next();
         transformer.setParameter(key, parameters.get(key));
      }
   }
}
