package com.shenjiafa.theory.xml.convert;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: Convert xml to list
 *
 * @author ShenJiaFa
 * @since 2022/6/20
 */
public class UseDom4J {
    public static void main(String[] args) throws DocumentException {

        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(UseDom4J.class.getResourceAsStream("/com/shenjiafa/theory/xml/convert/Contacts.xml"));
        Element root = document.getRootElement();
        List<Element> contactElementList = root.elements("contact");

        List<Contact> contactList = new ArrayList<>();
        for (Element element : contactElementList) {
            Contact contact = new Contact();
            contact.setId(Integer.parseInt(element.attributeValue("id")));
            contact.setName(element.elementTextTrim("name"));
            contact.setAge(Integer.parseInt(element.elementTextTrim("age")));
            contact.setVip(Boolean.parseBoolean(element.attributeValue("vip")));
            contact.setGender(element.elementTextTrim("gender"));
            contactList.add(contact);
        }

        contactList.forEach(System.out::println);

    }
}
