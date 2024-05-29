import java.io.Serializable;

public class Evento implements Serializable {
    private String codigo;
    private String descripcion;
    private int maxParticipantes;
    private boolean esExterno;
    private String organizacion;
    private double costoAlquiler;

    public Evento(String codigo, String descripcion, int maxParticipantes, boolean esExterno, String organizacion, double costoAlquiler) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.maxParticipantes = maxParticipantes;
        this.esExterno = esExterno;
        this.organizacion = organizacion;
        this.costoAlquiler = costoAlquiler;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public boolean isEsExterno() {
        return esExterno;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public double getCostoAlquiler() {
        return costoAlquiler;
    }
}