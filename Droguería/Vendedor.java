package Droguería;

import java.util.ArrayList;

public class Vendedor {private int idUsuario;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;


    public Vendedor(int idUsuario, String nombre, String correo, String telefono, String direccion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
package Droguería;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private List<Vendedor> vendedores = new ArrayList<>();

    public void agregarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
        System.out.println("Vendedor agregado: " + vendedor.getNombre());
    }

    public void listarVendedores() {
        for (Vendedor vendedor : vendedores) {
            System.out.println("ID: " + vendedor.getIdUsuario() +
                    ", Nombre: " + vendedor.getNombre() +
                    ", Correo: " + vendedor.getCorreo());
        }
    }
}

package Droguería;

import java.util.ArrayList;
import java.util.List;

public class Vendedor{
    private List<Vendedor> vendedores;

    public Vendedor() {
        this.vendedores = new ArrayList<>();
    }


    public void agregarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }
    public Vendedor consultarVendedorPorId(int idUsuario) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getIdUsuario() == idUsuario) {
                return vendedor;
            }
        }
        return null;// Devuelve null si no se encuentra el vendedor
    }
}




