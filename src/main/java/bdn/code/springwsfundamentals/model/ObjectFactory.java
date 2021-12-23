//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.12.20 a las 02:25:19 PM CET 
//


package bdn.code.springwsfundamentals.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bdn.code.springwsfundamentals.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bdn.code.springwsfundamentals.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAlbumResponse }
     * 
     */
    public GetAlbumResponse createGetAlbumResponse() {
        return new GetAlbumResponse();
    }

    /**
     * Create an instance of {@link Album }
     * 
     */
    public Album createAlbum() {
        return new Album();
    }

    /**
     * Create an instance of {@link GetAlbumRequest }
     * 
     */
    public GetAlbumRequest createGetAlbumRequest() {
        return new GetAlbumRequest();
    }

}
