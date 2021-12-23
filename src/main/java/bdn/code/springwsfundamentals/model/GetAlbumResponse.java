//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.12.20 a las 02:25:19 PM CET 
//


package bdn.code.springwsfundamentals.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="album" type="{http://code.bdn/springwsfundamentals/model}album"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "album"
})
@XmlRootElement(name = "GetAlbumResponse")
public class GetAlbumResponse {

    @XmlElement(required = true)
    protected Album album;

    /**
     * Obtiene el valor de la propiedad album.
     * 
     * @return
     *     possible object is
     *     {@link Album }
     *     
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Define el valor de la propiedad album.
     * 
     * @param value
     *     allowed object is
     *     {@link Album }
     *     
     */
    public void setAlbum(Album value) {
        this.album = value;
    }

}
