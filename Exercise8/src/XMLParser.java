package Exercise8;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLParser {
    public static void main(String[] args) {
        try
        {
            File inputFile = new File("D:\\Soni\\Soni In US\\NorthEastern\\SEM 1\\AED\\Backup\\Exercise8\\src\\test.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root Element : " + doc.getDocumentElement().getNodeName());
            NodeList books = doc.getElementsByTagName("Book");

            for (int i = 0; i < books.getLength(); i++)
            {
                Node nNode = books.item(i);
                System.out.println("\nCurrent Element:" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element) nNode;
                    System.out.println("Title: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Published Year: " + element.getElementsByTagName("publishedYear").item(0).getTextContent());
                    System.out.println("Number Of Pages: " + element.getElementsByTagName("numberOfPages").item(0).getTextContent());
                }

                NodeList authors = doc.getElementsByTagName("authors");
                System.out.println("Authors");
                nNode = authors.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element) nNode;
                    System.out.println(" ->" + element.getElementsByTagName("title").item(0).getTextContent());
                }
            }

        } catch (Exception e)
        {
            System.out.print(e);
        }
    }
}
