package com.shenjiafa.theory.xml.convert;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Function: Convert xml to list
 *
 * @author ShenJiaFa
 * @since 2022/6/20
 */
public class UseDom4J {
    public static void main(String[] args) throws DocumentException {

        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read(UseDom4J.class.getResourceAsStream("/com/shenjiafa/theory/xml/convert/Contacts.xml"));
        Element root = document.getRootElement().element("contact").element("gender");

    }
}
