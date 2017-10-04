package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Cargo;
import co.edu.sena.adsi.jpa.entities.Ciudad;
import co.edu.sena.adsi.jpa.entities.DetalleNomina;
import co.edu.sena.adsi.jpa.entities.TipoDocumento;
import co.edu.sena.adsi.jpa.entities.Usuario;
import co.edu.sena.adsi.jpa.entities.UsuariosHasRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-22T17:36:12")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile SingularAttribute<Usuario, String> numDocumento;
    public static volatile ListAttribute<Usuario, Usuario> usuariosList;
    public static volatile SingularAttribute<Usuario, Usuario> jefeInmediato;
    public static volatile ListAttribute<Usuario, UsuariosHasRoles> usuariosHasRolesList;
    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, String> nombres;
    public static volatile SingularAttribute<Usuario, TipoDocumento> tipoDocumento;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Double> sueldoBasico;
    public static volatile SingularAttribute<Usuario, Ciudad> ciudad;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, Cargo> cargo;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, Boolean> activo;
    public static volatile ListAttribute<Usuario, DetalleNomina> detalleNominaList;

}