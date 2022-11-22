public class PermisosRoles {
    @
    private String _id;
    
    private Rol rol;
    
    private Permiso permiso;

    public PermisosRoles() {
    }

    public String get_id() {
        return _id;
    }

    public Rol getRol() {
        return rol;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }
}
