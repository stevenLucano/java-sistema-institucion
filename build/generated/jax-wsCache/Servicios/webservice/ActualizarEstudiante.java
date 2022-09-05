
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarEstudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarEstudiante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pApe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sApe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarEstudiante", propOrder = {
    "id",
    "ident",
    "nom",
    "pApe",
    "sApe",
    "nac",
    "cel",
    "carr"
})
public class ActualizarEstudiante {

    protected int id;
    protected String ident;
    protected String nom;
    protected String pApe;
    protected String sApe;
    protected String nac;
    protected String cel;
    protected String carr;

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Define el valor de la propiedad ident.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Obtiene el valor de la propiedad nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Define el valor de la propiedad nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
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

    /**
     * Obtiene el valor de la propiedad sApe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSApe() {
        return sApe;
    }

    /**
     * Define el valor de la propiedad sApe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSApe(String value) {
        this.sApe = value;
    }

    /**
     * Obtiene el valor de la propiedad nac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNac() {
        return nac;
    }

    /**
     * Define el valor de la propiedad nac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNac(String value) {
        this.nac = value;
    }

    /**
     * Obtiene el valor de la propiedad cel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCel() {
        return cel;
    }

    /**
     * Define el valor de la propiedad cel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCel(String value) {
        this.cel = value;
    }

    /**
     * Obtiene el valor de la propiedad carr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarr() {
        return carr;
    }

    /**
     * Define el valor de la propiedad carr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarr(String value) {
        this.carr = value;
    }

}
