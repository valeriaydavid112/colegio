
package colegio;


public class Colegio {
 
    private int numeroDeEstudiantes;
    private Boolean mixto;
    private String nombre;

    public Colegio(int numeroDeEstudiantes, Boolean mixto, String nombre) {
        this.numeroDeEstudiantes = numeroDeEstudiantes;
        this.mixto = mixto;
        this.nombre = nombre;
    }

    public int getNumeroDeEstudiantes() {
        return numeroDeEstudiantes;
    }

    public void setNumeroDeEstudiantes(int numeroDeEstudiantes) {
        this.numeroDeEstudiantes = numeroDeEstudiantes;
    }

    public Boolean getMixto() {
        return mixto;
    }

    public void setMixto(Boolean mixto) {
        this.mixto = mixto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
