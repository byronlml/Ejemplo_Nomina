package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Departamento;
import co.edu.sena.adsi.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-22T17:36:12")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile ListAttribute<Ciudad, Usuario> usuariosList;
    public static volatile SingularAttribute<Ciudad, Departamento> departamento;
    public static volatile SingularAttribute<Ciudad, Integer> id;
    public static volatile SingularAttribute<Ciudad, String> nombre;

}