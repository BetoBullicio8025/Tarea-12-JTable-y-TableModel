public class VIdeojuego {
    private int id;
    private String nombre;
    private String genero;
    private int pesoEnGb;
    private String plataforma;
    private String desarrrollador;

    @Override
    public String toString() {
        return "VIdeojuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", pesoEnGb='" + pesoEnGb + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", desarrrollador='" + desarrrollador + '\'' +
                '}';
    }

    public VIdeojuego() {
    }

    public VIdeojuego(int id, String nombre, String genero, int pesoEnGb, String plataforma, String desarrrollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.pesoEnGb = pesoEnGb;
        this.plataforma = plataforma;
        this.desarrrollador = desarrrollador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPesoEnGb() {
        return pesoEnGb;
    }

    public void setPesoEnGb(int pesoEnGb) {
        this.pesoEnGb = pesoEnGb;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrrollador() {
        return desarrrollador;
    }

    public void setDesarrrollador(String desarrrollador) {
        this.desarrrollador = desarrrollador;
    }
}
