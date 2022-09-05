
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asignatura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asignatura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idAsignatura" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="matriculados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asignatura", propOrder = {
    "creditos",
    "idAsignatura",
    "matriculados",
    "nombre",
    "tipo"
})
public class Asignatura {

    protected int creditos;
    protected int idAsignatura;
    protected int matriculados;
    protected String nombre;
    protected String tipo;

    /**
     * Obtiene el valor de la propiedad creditos.
     * 
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Define el valor de la propiedad creditos.
     * 
     */
    public void setCreditos(int value) {
        this.creditos = value;
    }

    /**
     * Obtiene el valor de la propiedad idAsignatura.
     * 
     */
    public int getIdAsignatura() {
        return idAsignatura;
    }

    /**
     * Define el valor de la propiedad idAsignatura.
     * 
     */
    public void setIdAsignatura(int value) {
        this.idAsignatura = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculados.
     * 
     */
    public int getMatriculados() {
        return matriculados;
    }

    /**
     * Define el valor de la propiedad matriculados.
     * 
     */
    public void setMatriculados(int value) {
        this.matriculados = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
