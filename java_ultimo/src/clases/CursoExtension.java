import java.io.Serializable;

public class CursoExtension implements Serializable {
    private String codigo;
    private String descripcion;
    private int alumnosInscriptos;
    private int cantidadClases;
    private double costoPorAlumno;

    public CursoExtension(String codigo, String descripcion, int alumnosInscriptos, int cantidadClases, double costoPorAlumno) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.alumnosInscriptos = alumnosInscriptos;
        this.cantidadClases = cantidadClases;
        this.costoPorAlumno = costoPorAlumno;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public int getCantidadClases() {
        return cantidadClases;
    }

    public double getCostoPorAlumno() {
        return costoPorAlumno;
    }
}