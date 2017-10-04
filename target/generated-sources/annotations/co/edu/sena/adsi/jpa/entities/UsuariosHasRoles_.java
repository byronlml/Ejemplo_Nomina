package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Rol;
import co.edu.sena.adsi.jpa.entities.Usuario;
import co.edu.sena.adsi.jpa.entities.UsuariosHasRolesPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-22T17:36:12")
@StaticMetamodel(UsuariosHasRoles.class)
public class UsuariosHasRoles_ { 

    public static volatile SingularAttribute<UsuariosHasRoles, UsuariosHasRolesPK> usuariosHasRolesPK;
    public static volatile SingularAttribute<UsuariosHasRoles, Usuario> usuario;
    public static volatile SingularAttribute<UsuariosHasRoles, Rol> rol;
    public static volatile SingularAttribute<UsuariosHasRoles, Boolean> activo;

}