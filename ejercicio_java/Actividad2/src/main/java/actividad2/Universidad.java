
package actividad2;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre, rector, ciudad, modalidades, tipo, categoria;
    private List<Carrera> lista_carrera= new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getModalidades() {
        return modalidades;
    }

    public void setModalidades(String modalidades) {
        this.modalidades = modalidades;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Carrera> getLista_carrera() {
        return lista_carrera;
    }

    public void setLista_carrera(List<Carrera> lista_carrera) {
        this.lista_carrera = lista_carrera;
    }
    
    
    
}
