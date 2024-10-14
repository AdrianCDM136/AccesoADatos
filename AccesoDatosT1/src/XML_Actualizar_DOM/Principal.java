/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML_Actualizar_DOM;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
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

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Empleados> empleados = new ArrayList();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse(new File("src\\XML_Actualizar_DOM\\empleados.xml"));
        doc.getDocumentElement().normalize();

        Element root = doc.getDocumentElement();

        NodeList nList = doc.getElementsByTagName("empleado");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            System.out.println("");
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                /*System.out.println("Empleado id : " + eElement.getAttribute("id"));
                System.out.println(eElement.getElementsByTagName("nombre").item(0).getTextContent());
                System.out.println(eElement.getElementsByTagName("apellidos").item(0).getTextContent());
                System.out.println(eElement.getElementsByTagName("ciudad").item(0).getTextContent());*/

                String id = eElement.getAttribute("id");
                String nombre = eElement.getElementsByTagName("nombre").item(0).getTextContent();
                String apellidos = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
                String ciudad = eElement.getElementsByTagName("ciudad").item(0).getTextContent();
                empleados.add(new Empleados(id, nombre, apellidos, ciudad));
            }

        }
        for (Empleados e : empleados) {
            System.out.println(e.toString());
        }
        System.out.println("");
        String id = "4";
        String nombre = "felix";
        String apellidos = "garcía el pajas";
        String ciudad = "la peralej";
        Empleados nuevoEmpleado = new Empleados(id, nombre, apellidos, ciudad);
        empleados.add(nuevoEmpleado);
        
        String nombreFichero2 = "empleados2.xml";
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc2 = dBuilder.newDocument();

        Element rootEscribir = doc2.createElement("empleados");

        doc2.appendChild(rootEscribir);

        for (Empleados e2 : empleados) {
            Element modulo = doc2.createElement("empleado");
            modulo.setAttribute("id", e2.getId());
            rootEscribir.appendChild(modulo);

            Element nombreModulo = doc2.createElement("nombre");
            nombreModulo.appendChild(doc2.createTextNode(e2.getNombre()));
            modulo.appendChild(nombreModulo);

            Element apellidoModulo = doc2.createElement("apellido");
            apellidoModulo.appendChild(doc2.createTextNode(e2.getApellidos()));
            modulo.appendChild(apellidoModulo);

            Element ciudadModulo = doc2.createElement("ciudad");
            ciudadModulo.appendChild(doc2.createTextNode(e2.getCiudad()));
            modulo.appendChild(ciudadModulo);

        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc2);
        StreamResult result = new StreamResult(new FileOutputStream(nombreFichero2));
        transformer.transform(source, result);
        System.out.println("Datos actualizados en el archivo XML");

    }
}