
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verEstudiantes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verEstudiantes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idAsg" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verEstudiantes", propOrder = {
    "idAsg"
})
public class VerEstudiantes {

    protected int idAsg;

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

}
