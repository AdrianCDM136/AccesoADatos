/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XML_Escritura_DOM;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author FP
 */
public class ActualizaXML {
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, FileNotFoundException, TransformerException {
        String nombreFichero = "curso";
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        
        //creamos la raiz del documento
        
        Element root = doc.createElement("curso");
        root.setAttribute("nivel", "3");
        root.setAttribute("ciclo", "DAM");
        doc.appendChild(root);
        
        //CREAMOS UN NUEVO MODULO Y LO A�ADIMOS
        
        Element modulo = doc.createElement("modulo");
        root.appendChild(modulo);
        
        //a�adimos las caracteristicas del modulo
        
        Element nombreModulo = doc.createElement("nombre");
        nombreModulo.appendChild(doc.createTextNode("nombre"));
        nombreModulo.setAttribute("curso", "3");
        modulo.appendChild(nombreModulo);
        
        //transformamos y escribimos los cambios
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source= new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(nombreFichero + ".xml"));
        transformer.transform(source, result);
        System.out.println("Datos actualizados");
    }
}
