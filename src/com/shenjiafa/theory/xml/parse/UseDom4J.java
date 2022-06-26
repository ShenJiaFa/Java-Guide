package com.shenjiafa.theory.xml.parse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Function: Parse xml by Dom4J
 *
 * @author ShenJiaFa
 * @since 2022/6/20
 */
public class UseDom4J {
    @Test
    public void parseXML() throws DocumentException {

        SAXReader saxReader=new SAXReader();
        InputStream is = UseDom4J.class.getResourceAsStream("/com/shenjiafa/theory/xml/parse/students.xml");
        Document document = saxReader.read(is);
        Element root = document.getRootElement();

        System.out.println(root.getName());

        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        System.out.println("------------------");

        elements = root.elements("class");
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        System.out.println("------------------");

        Element grade = root.element("grade");
        Element student = grade.element("student");
        System.out.println(student.elementText("name"));
        System.out.println(student.elementTextTrim("name"));

        System.out.println("------------------");

        Element clazz = root.element("class");
        Attribute idAttribute = clazz.attribute("id");
        System.out.println(idAttribute.getName()+"--->"+idAttribute.getValue());

        System.out.println("------------------");

        Element sex = root.element("grade").element("student").element("sex");
        System.out.println(sex.getText());

        System.out.println("------------------");

        grade = root.element("grade");
        System.out.println(grade.attributeValue("level"));
        System.out.println(grade.attributeValue("vip"));

    }
}
