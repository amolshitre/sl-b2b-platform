/**
 * MFDOMWriter.java
 *
 * This file was generated by MapForce 2011sp1.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */

package com.altova.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.altova.mapforce.IEnumerable;
import com.altova.mapforce.IEnumerator;
import com.altova.mapforce.IMFNode;

public class MFDOMWriter 
{
	public static void write(IEnumerable what, Node where) throws Exception
	{
		Document owner = (where.getNodeType() == Node.DOCUMENT_NODE) ? (Document) where : where.getOwnerDocument();
		for (IEnumerator en = what.enumerator(); en.moveNext();)
		{ 
			if (en.current() instanceof IMFNode)
			{
				IMFNode el = (IMFNode)en.current();
				if ((el.getNodeKind() & IMFNode.MFNodeKind_Element) != 0)
				{
					Element xel = appendElement(owner, where, el.getNamespaceURI(), el.getLocalName(), el.getPrefix());
					write(el.select(IMFNode.MFQueryKind_All, null), xel);
				}
				if ((el.getNodeKind() & IMFNode.MFNodeKind_Attribute) != 0)
				{
					appendAttribute(owner, where, el.getNamespaceURI(), el.getLocalName(), el.getPrefix(), getValue(el, where));
				}
				else if ((el.getNodeKind() & IMFNode.MFNodeKind_Comment) != 0)
				{
					where.appendChild(owner.createComment(getValue(el,where)));
				}
				else if ((el.getNodeKind() & IMFNode.MFNodeKind_ProcessingInstruction) != 0)
				{
					where.appendChild(owner.createProcessingInstruction(el.getLocalName(), getValue(el,where)));
				}
				else if ((el.getNodeKind() & IMFNode.MFNodeKind_Text) != 0)
				{
					where.appendChild(owner.createTextNode(getValue(el,where)));
				}
			}
			else
			{
				where.appendChild(owner.createTextNode(getValue(en.current(), where)));
			}
		}
	}
	
	public static Element appendElement(Document owner, Node where, String u, String l, String p)
	{ 
		String uri = u;
		if ("".equals(uri))
			uri = null;
			
		if (p == null)
		{
			String prefix = (where == owner) ? null : where.lookupPrefix(uri);
			if (prefix == null || prefix.length() == 0)
				prefix = getPrefixForW3URIs(uri, where);
			if (prefix == null || prefix.length() == 0)
				return (Element) where.appendChild(owner.createElementNS(uri, l));
			return (Element) where.appendChild(owner.createElementNS(uri, prefix + ":" + l));
		}
		
		if (p.length() == 0)
			return (Element) where.appendChild(owner.createElementNS(uri, l));
		
		return (Element) where.appendChild(owner.createElementNS(uri, p + ":" + l));
	}
	
	public static void appendAttribute(Document owner, Node where, String u, String l, String p, String value)
	{
		String uri = u;
		if ("".equals(uri))
			uri = null;
		
		if (p == null)
		{
			String prefix = where.lookupPrefix(uri);
			if (prefix == null || prefix.length() == 0)
				prefix = getPrefixForW3URIs(uri, where);
			if (prefix == null || prefix.length() == 0)
				((Element)where).setAttributeNS(uri, l, value);
			else
				((Element)where).setAttributeNS(uri, prefix + ":" + l, value);
		}
		
		else if (p.length() == 0)
			((Element)where).setAttributeNS(uri, l, value);
		
		else
			((Element)where).setAttributeNS(uri, p + ":" + l, value);
	}

	private static String getPrefixForW3URIs(String uri, Node node)
	{
		if ( uri == null || uri.length() == 0)
			return "";
		
		if (uri.equals("http://www.w3.org/XML/1998/namespace"))
			return "xml";

		final String[] w3URIs = {"http://www.w3.org/2001/XMLSchema","http://www.w3.org/2001/XMLSchema-instance"};
		final String[] w3Prefix = {"xs","xsi"};

		if (w3URIs.length == w3Prefix.length)
		{
			for (int i = 0; i < w3Prefix.length; i++ )
			{
				if (uri.equals(w3URIs[i]))
				{
					String prefix = node.lookupNamespaceURI(w3Prefix[i]); 
					if ( prefix == null )
						return w3Prefix[i];
				}
			}
		}
		
		return "";
	}
	
	public static String getValue(Object o, Node n) throws Exception
	{
		if (o instanceof javax.xml.namespace.QName)
		{
			javax.xml.namespace.QName qn = (javax.xml.namespace.QName) o;
			if (qn.getNamespaceURI() == null || qn.getNamespaceURI().length() == 0)
				return qn.getLocalPart();
			
			String prefix = n.lookupPrefix(qn.getNamespaceURI());
			if (prefix == null)
			{
				prefix = getPrefixForW3URIs(qn.getNamespaceURI(), n);
				if (prefix.length() == 0)
				{
					prefix = XmlTreeOperations.findUnusedPrefix(n, qn.getPrefix());
					((Element)n).setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" + prefix, qn.getNamespaceURI());
				}
			}
			int preIndex = qn.getLocalPart().indexOf(':');
			if (preIndex == -1)
				return prefix + ":" + qn.getLocalPart();
			
			String s = prefix + ":" + qn.getLocalPart().substring(preIndex+1);
			return s;
		}
		else if (o instanceof IMFNode) 
		{
			IMFNode node = (IMFNode)o;
			
			String s = "";
			for (IEnumerator en = node.select(IMFNode.MFQueryKind_AllChildren, null).enumerator(); en.moveNext();)
				s += getValue(en.current(), n);
			return s;
		} 
		else
			return o.toString();
	}
}
