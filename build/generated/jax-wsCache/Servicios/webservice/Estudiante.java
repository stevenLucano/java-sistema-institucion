
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estudiante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idEstudiante" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estudiante", propOrder = {
    "carrera",
    "celular",
    "idEstudiante",
    "identificacion",
    "nacimiento",
    "nombres",
    "pApellido",
    "sApellido"
})
public class Estudiante {

    protected String carrera;
    protected String celular;
    protected int idEstudiante;
    protected String identificacion;
    protected String nacimiento;
    protected String nombres;
    protected String pApellido;
    protected String sApellido;

    /**
     * Obtiene el valor de la propiedad carrera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Define el valor de la propiedad carrera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrera(String value) {
        this.carrera = value;
    }

    /**
     * Obtiene el valor de la propiedad celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define el valor de la propiedad celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstudiante.
     * 
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * Define el valor de la propiedad idEstudiante.
     * 
     */
    public void setIdEstudiante(int value) {
        this.idEstudiante = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacimiento() {
        return nacimiento;
    }

    /**
     * Define el valor de la propiedad nacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacimiento(String value) {
        this.nacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad pApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPApellido() {
        return pApellido;
    }

    /**
     * Define el valor de la propiedad pApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPApellido(String value) {
        this.pApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad sApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSApellido() {
        return sApellido;
    }

    /**
     * Define el valor de la propiedad sApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSApellido(String value) {
        this.sApellido = value;
    }

}
