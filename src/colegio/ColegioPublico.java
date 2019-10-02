

package colegio;

public class ColegioPublico extends Colegio{
    
    private int personalTecnico;
    private date fechaDeFundacion;
    private string nombreDelRector;
    private boolean sueldoDeProfesores;
    
    
    public ColegioPublico(int numeroDeEstudiantes, Boolean mixto, String nombre) {
        super(numeroDeEstudiantes, mixto, nombre);
    }

    public ColegioPublico(int personalTecnico, date fechaDeFundacion, string nombreDelRector, boolean sueldoDeProfesores, int numeroDeEstudiantes, Boolean mixto, String nombre) {
        super(numeroDeEstudiantes, mixto, nombre);
        this.personalTecnico = personalTecnico;
        this.fechaDeFundacion = fechaDeFundacion;
        this.nombreDelRector = nombreDelRector;
        this.sueldoDeProfesores = sueldoDeProfesores;
    }

    public int getPersonalTecnico() {
        return personalTecnico;
    }

    public date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public string getNombreDelRector() {
        return nombreDelRector;
    }

    public boolean isSueldoDeProfesores() {
        return sueldoDeProfesores;
    }

    public void setPersonalTecnico(int personalTecnico) {
        this.personalTecnico = personalTecnico;
    }

    public void setFechaDeFundacion(date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public void setNombreDelRector(string nombreDelRector) {
        this.nombreDelRector = nombreDelRector;
    }

    public void setSueldoDeProfesores(boolean sueldoDeProfesores) {
        this.sueldoDeProfesores = sueldoDeProfesores;
    }
    public void acelerar(){
        this.velocidad += 10;
    }
    
    public void acelerar(int nuevaVelocidad){
        if(nuevaVelocidad<=this.velocidad){
            System.out.println("El carro no acelerará");
        }else{
            this.velocidad = nuevaVelocidad;
            System.out.println("Nueva velocidad: " + String.valueOf(nuevaVelocidad) + " Km/h");            
        }
        
    }

}
