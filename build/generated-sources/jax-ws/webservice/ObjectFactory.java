
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _ActualizarAsignatura_QNAME = new QName("http://WebService/", "actualizarAsignatura");
    private final static QName _ActualizarAsignaturaResponse_QNAME = new QName("http://WebService/", "actualizarAsignaturaResponse");
    private final static QName _ActualizarEstudiante_QNAME = new QName("http://WebService/", "actualizarEstudiante");
    private final static QName _ActualizarEstudianteResponse_QNAME = new QName("http://WebService/", "actualizarEstudianteResponse");
    private final static QName _AgregarAsignatura_QNAME = new QName("http://WebService/", "agregarAsignatura");
    private final static QName _AgregarAsignaturaResponse_QNAME = new QName("http://WebService/", "agregarAsignaturaResponse");
    private final static QName _AgregarEstudiante_QNAME = new QName("http://WebService/", "agregarEstudiante");
    private final static QName _AgregarEstudianteResponse_QNAME = new QName("http://WebService/", "agregarEstudianteResponse");
    private final static QName _BuscarAsignatura_QNAME = new QName("http://WebService/", "buscarAsignatura");
    private final static QName _BuscarAsignaturaResponse_QNAME = new QName("http://WebService/", "buscarAsignaturaResponse");
    private final static QName _BuscarEstudiante_QNAME = new QName("http://WebService/", "buscarEstudiante");
    private final static QName _BuscarEstudianteResponse_QNAME = new QName("http://WebService/", "buscarEstudianteResponse");
    private final static QName _CambioAsignaturas_QNAME = new QName("http://WebService/", "cambioAsignaturas");
    private final static QName _CambioAsignaturasResponse_QNAME = new QName("http://WebService/", "cambioAsignaturasResponse");
    private final static QName _EliminarAsignatura_QNAME = new QName("http://WebService/", "eliminarAsignatura");
    private final static QName _EliminarAsignaturaResponse_QNAME = new QName("http://WebService/", "eliminarAsignaturaResponse");
    private final static QName _EliminarEstudiante_QNAME = new QName("http://WebService/", "eliminarEstudiante");
    private final static QName _EliminarEstudianteResponse_QNAME = new QName("http://WebService/", "eliminarEstudianteResponse");
    private final static QName _ListarAsignaturas_QNAME = new QName("http://WebService/", "listarAsignaturas");
    private final static QName _ListarAsignaturasResponse_QNAME = new QName("http://WebService/", "listarAsignaturasResponse");
    private final static QName _ListarEstudiantes_QNAME = new QName("http://WebService/", "listarEstudiantes");
    private final static QName _ListarEstudiantesResponse_QNAME = new QName("http://WebService/", "listarEstudiantesResponse");
    private final static QName _VerAsignaturas_QNAME = new QName("http://WebService/", "verAsignaturas");
    private final static QName _VerAsignaturasResponse_QNAME = new QName("http://WebService/", "verAsignaturasResponse");
    private final static QName _VerEstudiantes_QNAME = new QName("http://WebService/", "verEstudiantes");
    private final static QName _VerEstudiantesResponse_QNAME = new QName("http://WebService/", "verEstudiantesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarAsignatura }
     * 
     */
    public ActualizarAsignatura createActualizarAsignatura() {
        return new ActualizarAsignatura();
    }

    /**
     * Create an instance of {@link ActualizarAsignaturaResponse }
     * 
     */
    public ActualizarAsignaturaResponse createActualizarAsignaturaResponse() {
        return new ActualizarAsignaturaResponse();
    }

    /**
     * Create an instance of {@link ActualizarEstudiante }
     * 
     */
    public ActualizarEstudiante createActualizarEstudiante() {
        return new ActualizarEstudiante();
    }

    /**
     * Create an instance of {@link ActualizarEstudianteResponse }
     * 
     */
    public ActualizarEstudianteResponse createActualizarEstudianteResponse() {
        return new ActualizarEstudianteResponse();
    }

    /**
     * Create an instance of {@link AgregarAsignatura }
     * 
     */
    public AgregarAsignatura createAgregarAsignatura() {
        return new AgregarAsignatura();
    }

    /**
     * Create an instance of {@link AgregarAsignaturaResponse }
     * 
     */
    public AgregarAsignaturaResponse createAgregarAsignaturaResponse() {
        return new AgregarAsignaturaResponse();
    }

    /**
     * Create an instance of {@link AgregarEstudiante }
     * 
     */
    public AgregarEstudiante createAgregarEstudiante() {
        return new AgregarEstudiante();
    }

    /**
     * Create an instance of {@link AgregarEstudianteResponse }
     * 
     */
    public AgregarEstudianteResponse createAgregarEstudianteResponse() {
        return new AgregarEstudianteResponse();
    }

    /**
     * Create an instance of {@link BuscarAsignatura }
     * 
     */
    public BuscarAsignatura createBuscarAsignatura() {
        return new BuscarAsignatura();
    }

    /**
     * Create an instance of {@link BuscarAsignaturaResponse }
     * 
     */
    public BuscarAsignaturaResponse createBuscarAsignaturaResponse() {
        return new BuscarAsignaturaResponse();
    }

    /**
     * Create an instance of {@link BuscarEstudiante }
     * 
     */
    public BuscarEstudiante createBuscarEstudiante() {
        return new BuscarEstudiante();
    }

    /**
     * Create an instance of {@link BuscarEstudianteResponse }
     * 
     */
    public BuscarEstudianteResponse createBuscarEstudianteResponse() {
        return new BuscarEstudianteResponse();
    }

    /**
     * Create an instance of {@link CambioAsignaturas }
     * 
     */
    public CambioAsignaturas createCambioAsignaturas() {
        return new CambioAsignaturas();
    }

    /**
     * Create an instance of {@link CambioAsignaturasResponse }
     * 
     */
    public CambioAsignaturasResponse createCambioAsignaturasResponse() {
        return new CambioAsignaturasResponse();
    }

    /**
     * Create an instance of {@link EliminarAsignatura }
     * 
     */
    public EliminarAsignatura createEliminarAsignatura() {
        return new EliminarAsignatura();
    }

    /**
     * Create an instance of {@link EliminarAsignaturaResponse }
     * 
     */
    public EliminarAsignaturaResponse createEliminarAsignaturaResponse() {
        return new EliminarAsignaturaResponse();
    }

    /**
     * Create an instance of {@link EliminarEstudiante }
     * 
     */
    public EliminarEstudiante createEliminarEstudiante() {
        return new EliminarEstudiante();
    }

    /**
     * Create an instance of {@link EliminarEstudianteResponse }
     * 
     */
    public EliminarEstudianteResponse createEliminarEstudianteResponse() {
        return new EliminarEstudianteResponse();
    }

    /**
     * Create an instance of {@link ListarAsignaturas }
     * 
     */
    public ListarAsignaturas createListarAsignaturas() {
        return new ListarAsignaturas();
    }

    /**
     * Create an instance of {@link ListarAsignaturasResponse }
     * 
     */
    public ListarAsignaturasResponse createListarAsignaturasResponse() {
        return new ListarAsignaturasResponse();
    }

    /**
     * Create an instance of {@link ListarEstudiantes }
     * 
     */
    public ListarEstudiantes createListarEstudiantes() {
        return new ListarEstudiantes();
    }

    /**
     * Create an instance of {@link ListarEstudiantesResponse }
     * 
     */
    public ListarEstudiantesResponse createListarEstudiantesResponse() {
        return new ListarEstudiantesResponse();
    }

    /**
     * Create an instance of {@link VerAsignaturas }
     * 
     */
    public VerAsignaturas createVerAsignaturas() {
        return new VerAsignaturas();
    }

    /**
     * Create an instance of {@link VerAsignaturasResponse }
     * 
     */
    public VerAsignaturasResponse createVerAsignaturasResponse() {
        return new VerAsignaturasResponse();
    }

    /**
     * Create an instance of {@link VerEstudiantes }
     * 
     */
    public VerEstudiantes createVerEstudiantes() {
        return new VerEstudiantes();
    }

    /**
     * Create an instance of {@link VerEstudiantesResponse }
     * 
     */
    public VerEstudiantesResponse createVerEstudiantesResponse() {
        return new VerEstudiantesResponse();
    }

    /**
     * Create an instance of {@link Asignatura }
     * 
     */
    public Asignatura createAsignatura() {
        return new Asignatura();
    }

    /**
     * Create an instance of {@link Estudiante }
     * 
     */
    public Estudiante createEstudiante() {
        return new Estudiante();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "actualizarAsignatura")
    public JAXBElement<ActualizarAsignatura> createActualizarAsignatura(ActualizarAsignatura value) {
        return new JAXBElement<ActualizarAsignatura>(_ActualizarAsignatura_QNAME, ActualizarAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "actualizarAsignaturaResponse")
    public JAXBElement<ActualizarAsignaturaResponse> createActualizarAsignaturaResponse(ActualizarAsignaturaResponse value) {
        return new JAXBElement<ActualizarAsignaturaResponse>(_ActualizarAsignaturaResponse_QNAME, ActualizarAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "actualizarEstudiante")
    public JAXBElement<ActualizarEstudiante> createActualizarEstudiante(ActualizarEstudiante value) {
        return new JAXBElement<ActualizarEstudiante>(_ActualizarEstudiante_QNAME, ActualizarEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "actualizarEstudianteResponse")
    public JAXBElement<ActualizarEstudianteResponse> createActualizarEstudianteResponse(ActualizarEstudianteResponse value) {
        return new JAXBElement<ActualizarEstudianteResponse>(_ActualizarEstudianteResponse_QNAME, ActualizarEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "agregarAsignatura")
    public JAXBElement<AgregarAsignatura> createAgregarAsignatura(AgregarAsignatura value) {
        return new JAXBElement<AgregarAsignatura>(_AgregarAsignatura_QNAME, AgregarAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "agregarAsignaturaResponse")
    public JAXBElement<AgregarAsignaturaResponse> createAgregarAsignaturaResponse(AgregarAsignaturaResponse value) {
        return new JAXBElement<AgregarAsignaturaResponse>(_AgregarAsignaturaResponse_QNAME, AgregarAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "agregarEstudiante")
    public JAXBElement<AgregarEstudiante> createAgregarEstudiante(AgregarEstudiante value) {
        return new JAXBElement<AgregarEstudiante>(_AgregarEstudiante_QNAME, AgregarEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "agregarEstudianteResponse")
    public JAXBElement<AgregarEstudianteResponse> createAgregarEstudianteResponse(AgregarEstudianteResponse value) {
        return new JAXBElement<AgregarEstudianteResponse>(_AgregarEstudianteResponse_QNAME, AgregarEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "buscarAsignatura")
    public JAXBElement<BuscarAsignatura> createBuscarAsignatura(BuscarAsignatura value) {
        return new JAXBElement<BuscarAsignatura>(_BuscarAsignatura_QNAME, BuscarAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "buscarAsignaturaResponse")
    public JAXBElement<BuscarAsignaturaResponse> createBuscarAsignaturaResponse(BuscarAsignaturaResponse value) {
        return new JAXBElement<BuscarAsignaturaResponse>(_BuscarAsignaturaResponse_QNAME, BuscarAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "buscarEstudiante")
    public JAXBElement<BuscarEstudiante> createBuscarEstudiante(BuscarEstudiante value) {
        return new JAXBElement<BuscarEstudiante>(_BuscarEstudiante_QNAME, BuscarEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "buscarEstudianteResponse")
    public JAXBElement<BuscarEstudianteResponse> createBuscarEstudianteResponse(BuscarEstudianteResponse value) {
        return new JAXBElement<BuscarEstudianteResponse>(_BuscarEstudianteResponse_QNAME, BuscarEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambioAsignaturas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "cambioAsignaturas")
    public JAXBElement<CambioAsignaturas> createCambioAsignaturas(CambioAsignaturas value) {
        return new JAXBElement<CambioAsignaturas>(_CambioAsignaturas_QNAME, CambioAsignaturas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambioAsignaturasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "cambioAsignaturasResponse")
    public JAXBElement<CambioAsignaturasResponse> createCambioAsignaturasResponse(CambioAsignaturasResponse value) {
        return new JAXBElement<CambioAsignaturasResponse>(_CambioAsignaturasResponse_QNAME, CambioAsignaturasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAsignatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "eliminarAsignatura")
    public JAXBElement<EliminarAsignatura> createEliminarAsignatura(EliminarAsignatura value) {
        return new JAXBElement<EliminarAsignatura>(_EliminarAsignatura_QNAME, EliminarAsignatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAsignaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "eliminarAsignaturaResponse")
    public JAXBElement<EliminarAsignaturaResponse> createEliminarAsignaturaResponse(EliminarAsignaturaResponse value) {
        return new JAXBElement<EliminarAsignaturaResponse>(_EliminarAsignaturaResponse_QNAME, EliminarAsignaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "eliminarEstudiante")
    public JAXBElement<EliminarEstudiante> createEliminarEstudiante(EliminarEstudiante value) {
        return new JAXBElement<EliminarEstudiante>(_EliminarEstudiante_QNAME, EliminarEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "eliminarEstudianteResponse")
    public JAXBElement<EliminarEstudianteResponse> createEliminarEstudianteResponse(EliminarEstudianteResponse value) {
        return new JAXBElement<EliminarEstudianteResponse>(_EliminarEstudianteResponse_QNAME, EliminarEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAsignaturas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarAsignaturas")
    public JAXBElement<ListarAsignaturas> createListarAsignaturas(ListarAsignaturas value) {
        return new JAXBElement<ListarAsignaturas>(_ListarAsignaturas_QNAME, ListarAsignaturas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAsignaturasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarAsignaturasResponse")
    public JAXBElement<ListarAsignaturasResponse> createListarAsignaturasResponse(ListarAsignaturasResponse value) {
        return new JAXBElement<ListarAsignaturasResponse>(_ListarAsignaturasResponse_QNAME, ListarAsignaturasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEstudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarEstudiantes")
    public JAXBElement<ListarEstudiantes> createListarEstudiantes(ListarEstudiantes value) {
        return new JAXBElement<ListarEstudiantes>(_ListarEstudiantes_QNAME, ListarEstudiantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEstudiantesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarEstudiantesResponse")
    public JAXBElement<ListarEstudiantesResponse> createListarEstudiantesResponse(ListarEstudiantesResponse value) {
        return new JAXBElement<ListarEstudiantesResponse>(_ListarEstudiantesResponse_QNAME, ListarEstudiantesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerAsignaturas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "verAsignaturas")
    public JAXBElement<VerAsignaturas> createVerAsignaturas(VerAsignaturas value) {
        return new JAXBElement<VerAsignaturas>(_VerAsignaturas_QNAME, VerAsignaturas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerAsignaturasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "verAsignaturasResponse")
    public JAXBElement<VerAsignaturasResponse> createVerAsignaturasResponse(VerAsignaturasResponse value) {
        return new JAXBElement<VerAsignaturasResponse>(_VerAsignaturasResponse_QNAME, VerAsignaturasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerEstudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "verEstudiantes")
    public JAXBElement<VerEstudiantes> createVerEstudiantes(VerEstudiantes value) {
        return new JAXBElement<VerEstudiantes>(_VerEstudiantes_QNAME, VerEstudiantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerEstudiantesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "verEstudiantesResponse")
    public JAXBElement<VerEstudiantesResponse> createVerEstudiantesResponse(VerEstudiantesResponse value) {
        return new JAXBElement<VerEstudiantesResponse>(_VerEstudiantesResponse_QNAME, VerEstudiantesResponse.class, null, value);
    }

}
