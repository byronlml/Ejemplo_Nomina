package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-22T17:36:12")
@StaticMetamodel(TipoDocumento.class)
public class TipoDocumento_ { 

    public static volatile SingularAttribute<TipoDocumento, String> descripcion;
    public static volatile ListAttribute<TipoDocumento, Usuario> usuariosList;
    public static volatile SingularAttribute<TipoDocumento, Integer> id;

}