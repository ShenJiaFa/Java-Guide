package com.shenjiafa.theory.xml.retrieve;

import com.shenjiafa.theory.xml.convert.UseDom4J;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: Use xPath to retrieve xml
 *
 * @author ShenJiaFa
 * @since 2022/6/21
 */
public class UseXPath {
    public static void main(String[] args) throws DocumentException {

        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(UseDom4J.class.getResourceAsStream("/com/shenjiafa/theory/xml/retrieve/stars.xml"));

        List<Node> nameNodes1 = document.selectNodes("/stars/star/name");
        List<Element> elements1 = new ArrayList<>();

        List<Node> nameNodes2 = document.getRootElement().selectNodes("./star/name");
        List<Element> elements2 = new ArrayList<>();

        List<Node> nameNodes3 = document.getRootElement().selectNodes("//name");
        List<Element> elements3 = new ArrayList<>();

        List<Node> nameNodes4 = document.getRootElement().selectNodes("//star/name");
        List<Element> elements4 = new ArrayList<>();

        List<Node> levelNodes = document.getRootElement().selectNodes("//@level");
        List<Attribute> elements5 = new ArrayList<>();

        List<Node> fanIdNodes = document.getRootElement().selectNodes("//fan[@id]");
        List<Element> elements6 = new ArrayList<>();

        Element fan = (Element) document.getRootElement().selectSingleNode("//fan[@id=10004]");

        for (Node nameNode : nameNodes1) {
            Element nameElement = (Element) nameNode;
            elements1.add(nameElement);
        }

        for (Node nameNode : nameNodes2) {
            Element nameElement = (Element) nameNode;
            elements2.add(nameElement);
        }

        for (Node nameNode : nameNodes3) {
            Element nameElement = (Element) nameNode;
            elements3.add(nameElement);
        }

        for (Node nameNode : nameNodes4) {
            Element nameElement = (Element) nameNode;
            elements4.add(nameElement);
        }

        for (Node nameNode : levelNodes) {
            Attribute levelAttribute = (Attribute) nameNode;
            elements5.add(levelAttribute);
        }

        for (Node fanIdNode : fanIdNodes) {
            Element fanIdElement = (Element) fanIdNode;
            elements6.add(fanIdElement);
        }

        elements1.forEach(e -> {
            System.out.println(e.getTextTrim());
        });

        System.out.println("------------------");

        elements2.forEach(e -> {
            System.out.println(e.getTextTrim());
        });

        System.out.println("------------------");

        elements3.forEach(e -> {
            System.out.println(e.getTextTrim());
        });

        System.out.println("------------------");

        elements5.forEach(e -> {
            System.out.println(e.getName() + "-->" + e.getValue());
        });

        System.out.println("------------------");

        elements6.forEach(e -> {
            System.out.println(e.element("name").getTextTrim());
        });

        System.out.println("------------------");

        System.out.println(fan.element("name").getTextTrim());
    }
}
