/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej_XML_Entrega;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File("src\\Ej_XML_Entrega\\arcade.xml"));
        document.getDocumentElement().normalize();

        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());

        NodeList nl = document.getElementsByTagName("maquina");
        int cont = 0;
        System.out.println("");
        System.out.println("-.-");
        System.out.println("");
        for (int temp = 0; temp < nl.getLength(); temp++) {
            Node n = nl.item(temp);
            Element eElement = (Element) n;
            if (n.getNodeType() == Node.ELEMENT_NODE) {
                cont++;
                System.out.println("Id del producto : " + eElement.getAttribute("id"));
                System.out.println("Nombre : " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                System.out.println("Giro : " + eElement.getElementsByTagName("giro").item(0).getTextContent());
                System.out.println("Base y pie : " + eElement.getElementsByTagName("baseyPie").item(0).getTextContent());
                System.out.println("proteccion : " + eElement.getElementsByTagName("proteccion").item(0).getTextContent());
                System.out.println("acabado : " + eElement.getElementsByTagName("acabado").item(0).getTextContent());
                System.out.println("asiento : " + eElement.getElementsByTagName("asiento").item(0).getTextContent());
                System.out.println("altura : " + eElement.getElementsByTagName("altura").item(0).getTextContent());
                System.out.println("asiento : " + eElement.getElementsByTagName("asiento").item(0).getTextContent());
                System.out.println("base : " + eElement.getElementsByTagName("base").item(0).getTextContent());
                System.out.println("Distancia : " + eElement.getElementsByTagName("Distancia").item(0).getTextContent());
                System.out.println("pie : " + eElement.getElementsByTagName("pie").item(0).getTextContent());
                System.out.println("peso : " + eElement.getElementsByTagName("peso").item(0).getTextContent());
                System.out.println("material : " + eElement.getElementsByTagName("material").item(0).getTextContent());
            }
            if (cont >= nl.getLength()) {
                System.out.println("");
                System.out.println(";;;;");
            } else {
                System.out.println("");
                System.out.println(";;");
                System.out.println("");
            }

        }
    }
}
