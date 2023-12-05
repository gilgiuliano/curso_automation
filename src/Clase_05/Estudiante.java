package Clase_05;

public class Estudiante {
    private Integer id;
    private String nombreCompleto;
    private Float promedio;

    public Estudiante(){
    }

    public Estudiante (Integer idParam, String nombreParam, Float promedioParam){
        this.id = idParam;
        this.nombreCompleto = nombreParam;
        this.promedio = promedioParam;
    }

    public Integer getId (){
        return id;
    }

    public void setId (Integer nuevoId){
        this.id = nuevoId;
    }
}
