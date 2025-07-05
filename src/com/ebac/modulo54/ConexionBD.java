package com.ebac.modulo54;

// Archivo: ConexionBD.java
public class ConexionBD {
    private static ConexionBD instancia;
    private String url;
    private String usuario;
    private String contrasena;

    // Constructor privado para evitar instanciación directa
    private ConexionBD() {
        // Valores por defecto (podrían leerse de un archivo de configuración)
        this.url = "jdbc:mysql://localhost:3306/mi_basedatos";
        this.usuario = "admin";
        this.contrasena = "password";

        System.out.println("Conexión a BD establecida: " + url);
    }

    // Método para obtener la instancia única
    public static ConexionBD obtenerInstancia() {
        if (instancia == null) {
            synchronized (ConexionBD.class) {
                if (instancia == null) {
                    instancia = new ConexionBD();
                }
            }
        }
        return instancia;
    }

    // Métodos de la conexión
    public void conectar() {
        System.out.println("Conectado a la base de datos como " + usuario);
    }

    public void desconectar() {
        System.out.println("Desconectado de la base de datos");
    }

    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta: " + consulta);
    }

    // Getters y setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public static void main(String[] args) {
        // Obtener la instancia única
        ConexionBD conexion1 = ConexionBD.obtenerInstancia();
        conexion1.conectar();
        conexion1.ejecutarConsulta("SELECT * FROM usuarios");

        // Intentar crear otra instancia (debería ser la misma)
        ConexionBD conexion2 = ConexionBD.obtenerInstancia();
        conexion2.ejecutarConsulta("INSERT INTO productos VALUES (1, 'Laptop')");

        // Verificar que son la misma instancia
        System.out.println("¿conexion1 y conexion2 son la misma instancia? " + (conexion1 == conexion2));

        conexion1.desconectar();
    }
}