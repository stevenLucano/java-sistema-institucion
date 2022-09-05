
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarEstudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarEstudiante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="p_ape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarEstudiante", propOrder = {
    "id",
    "ident",
    "pApe"
})
public class BuscarEstudiante {

    protected int id;
    protected int ident;
    @XmlElement(name = "p_ape")
    protected String pApe;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad ident.
     * 
     */
    public int getIdent() {
        return ident;
    }

    /**
     * Define el valor de la propiedad ident.
     * 
     */
    public void setIdent(int value) {
        this.ident = value;
    }

    /**
     * Obtiene el valor de la propiedad pApe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPApe() {
        return pApe;
    }

    /**
     * Define el valor de la propiedad pApe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPApe(String value) {
        this.pApe = value;
    }

}
