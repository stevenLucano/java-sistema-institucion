
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambioAsignaturas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambioAsignaturas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEst" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idAsg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="acc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambioAsignaturas", propOrder = {
    "idEst",
    "idAsg",
    "acc"
})
public class CambioAsignaturas {

    protected int idEst;
    protected int idAsg;
    protected int acc;

    /**
     * Obtiene el valor de la propiedad idEst.
     * 
     */
    public int getIdEst() {
        return idEst;
    }

    /**
     * Define el valor de la propiedad idEst.
     * 
     */
    public void setIdEst(int value) {
        this.idEst = value;
    }

    /**
     * Obtiene el valor de la propiedad idAsg.
     * 
     */
    public int getIdAsg() {
        return idAsg;
    }

    /**
     * Define el valor de la propiedad idAsg.
     * 
     */
    public void setIdAsg(int value) {
        this.idAsg = value;
    }

    /**
     * Obtiene el valor de la propiedad acc.
     * 
     */
    public int getAcc() {
        return acc;
    }

    /**
     * Define el valor de la propiedad acc.
     * 
     */
    public void setAcc(int value) {
        this.acc = value;
    }

}
