package com.shenjiafa.theory.xml.retrieve;

import com.shenjiafa.theory.xml.convert.UseDom4J;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
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

        for (Node nameNode : nameNodes1) {
            Element nameElement = (Element) nameNode;
            elements1.add(nameElement);
        }

        for (Node nameNode : nameNodes2) {
            Element nameElement = (Element) nameNode;
            elements2.add(nameElement);
        }

        elements1.forEach(e -> {
            System.out.println(e.getTextTrim());
        });

        System.out.println("------------------");

        elements2.forEach(e -> {
            System.out.println(e.getTextTrim());
        });

    }
}
