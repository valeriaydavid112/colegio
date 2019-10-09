
package colegio;


public class Colegio {
 
    private int numeroDeEstudiantes;
    private Date fechasDeMatriculas;
    private Boolean mixto;
    private String nombre;
    private int numeroDeProfesores;
 
    public Colegio(int numeroDeEstudiantes, Date fechaDeMatriculas, Boolean mixto, String nombre, int nuemroDeProdesores) {
        this.numeroDeEstudiantes = numeroDeEstudiantes;
        this.fechaDeMatriculas=fechadDeMatriculas;
        this.mixto = mixto;
        this.nombre = nombre;
        this.numeroDeProfesores=numeroDeProfesores;
    }

    public int getNumeroDeEstudiantes() {
        return numeroDeEstudiantes;
    }

    public void setNumeroDeEstudiantes(int numeroDeEstudiantes) {
        this.numeroDeEstudiantes = numeroDeEstudiantes;
    }

    public Date getFechasDeInscripcion() {
        return fechasDeMatriculas;
    }
    public void setFechasDeMatriculas(Date fechasDeMatriculas)  {
        this.fechaDeMatriculas;
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
    public int getNumeroDeProfesores() {
        return numeroDeProfesores;
    }
    public void setNumeroDeProfesores(int numeroDeProfesores) {
        this.numeroDeProfesores = numeroDeProfesores;
    }
 
     public void colegios(){
        this.mixto += 10;
    }
    
    public void colegios(int nuevoMixto){
        if(nuevoMixto<=this.mixto){
            System.out.println("Mas numero de estudiantes ");
        }else{
            this.mixto = nuevomixto;
            System.out.println("Nuevo mixto: " + String.valueOf(nuevaVelocidad) + " Educacion");            
        }
        
    }

    
    
}
