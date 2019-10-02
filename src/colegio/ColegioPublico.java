
package colegio;

public class ColegioPublico extends Colegio{
    
    private int personalTecnico;
    private date fechaDeFundacion;
    private string nombreDelRector;
    private boolean sueldoDeProfesores;
    
    
    public ColegioPublico(int numeroDeEstudiantes, Boolean mixto, String nombre) {
        super(numeroDeEstudiantes, mixto, nombre);
    }
    
}
