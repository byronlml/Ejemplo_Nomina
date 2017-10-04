package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.DetalleNomina;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-22T17:36:12")
@StaticMetamodel(Nomina.class)
public class Nomina_ { 

    public static volatile SingularAttribute<Nomina, String> descripcion;
    public static volatile SingularAttribute<Nomina, Integer> mes;
    public static volatile SingularAttribute<Nomina, Integer> id;
    public static volatile ListAttribute<Nomina, DetalleNomina> detalleNominaList;

}