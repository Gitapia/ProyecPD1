package com.ebac.modulo54;

// Archivo: Usuario.java
public class Usuario {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String direccion;
    private final String telefono;

    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private final String nombre;
        private final String apellido;
        private int edad = 0;
        private String direccion = "";
        private String telefono = "";

        public Builder(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario.Builder("Juan", "Pérez")
                .edad(30)
                .direccion("Calle Falsa 123")
                .telefono("555-1234")
                .build();

        Usuario usuario2 = new Usuario.Builder("María", "Gómez")
                .edad(25)
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}