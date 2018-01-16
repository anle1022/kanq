package ylf;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

public class JaxbUtil {
	// ���̰߳�ȫ��Context.
	private JAXBContext jaxbContext;

	/**
	 * @param types
	 *            ������Ҫ���л���Root���������.
	 */
	public JaxbUtil(Class<?>... types) {
		try {
			jaxbContext = JAXBContext.newInstance(types);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Java Object->Xml.
	 */
	public String toXml(Object root, String encoding) {
		try {
			StringWriter writer = new StringWriter();
			createMarshaller(encoding).marshal(root, writer);
			return writer.toString();
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Java Object->Xml, �ر�֧�ֶ�Root Element��Collection������.
	 */
	@SuppressWarnings("unchecked")
	public String toXml(Collection root, String rootName, String encoding) {
		try {
			CollectionWrapper wrapper = new CollectionWrapper();
			wrapper.collection = root;

			JAXBElement<CollectionWrapper> wrapperElement = new JAXBElement<CollectionWrapper>(
					new QName(rootName), CollectionWrapper.class, wrapper);

			StringWriter writer = new StringWriter();
			createMarshaller(encoding).marshal(wrapperElement, writer);

			return writer.toString();
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Xml->Java Object.
	 */
	@SuppressWarnings("unchecked")
	public <T> T fromXml(String xml) {
		try {
			StringReader reader = new StringReader(xml);
			return (T) createUnmarshaller().unmarshal(reader);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Xml->Java Object, ֧�ִ�Сд���л�����.
	 */
	@SuppressWarnings("unchecked")
	public <T> T fromXml(String xml, boolean caseSensitive) {
		try {
			String fromXml = xml;
			if (!caseSensitive)
				fromXml = xml.toLowerCase();
			StringReader reader = new StringReader(fromXml);
			return (T) createUnmarshaller().unmarshal(reader);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * ����Marshaller, �趨encoding(��ΪNull).
	 */
	public Marshaller createMarshaller(String encoding) {
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
					Boolean.TRUE);

			if (null==encoding&&""!=encoding) {
				marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
			}
			return marshaller;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * ����UnMarshaller.
	 */
	public Unmarshaller createUnmarshaller() {
		try {
			return jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * ��װRoot Element �� Collection�����.
	 */
	public static class CollectionWrapper {
		@XmlAnyElement
		protected Collection<?> collection;
	}
	
	public static void main(String[] args) {
        String xml = "<A><B name='c4炸弹'></B></A>";
        JaxbUtil u = new JaxbUtil(A.class, CollectionWrapper.class);     
        A a = u.fromXml(xml);
        System.out.println(a.getB().hashCode());
    }
}

@XmlRootElement(name = "A")
class A{
   
    private B b;

    @XmlElement(name="B")
    public B getB() {
        return b;
    }

    
    public void setB(B b) {
        this.b = b;
    }
    
}
class B{
  
    private String name;

    @XmlAttribute(name="name")
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
}