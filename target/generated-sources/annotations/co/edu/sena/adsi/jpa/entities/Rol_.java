package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.UsuariosHasRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-22T17:36:12")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> descripcion;
    public static volatile ListAttribute<Rol, UsuariosHasRoles> usuariosHasRolesList;
    public static volatile SingularAttribute<Rol, String> id;

}