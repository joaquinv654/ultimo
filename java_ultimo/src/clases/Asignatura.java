import java.io.Serializable;
import java.util.Date;

public class Asignatura implements Serializable {
    private String codigo;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String diaSemana;
    private String horarioInicio;
    private String horarioFin;
    private int alumnosInscriptos;

    public Asignatura(String codigo, String nombre, Date fechaInicio, Date fechaFin, String diaSemana, String horarioInicio, String horarioFin, int alumnosInscriptos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.diaSemana = diaSemana;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public int getAlumnosInscriptos() {
        return alumnosInscriptos;
    }
}