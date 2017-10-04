package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Nomina;
import co.edu.sena.adsi.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-22T17:36:12")
@StaticMetamodel(DetalleNomina.class)
public class DetalleNomina_ { 

    public static volatile SingularAttribute<DetalleNomina, Double> descuentoPension;
    public static volatile SingularAttribute<DetalleNomina, Double> descuentoSalud;
    public static volatile SingularAttribute<DetalleNomina, Double> netoPagar;
    public static volatile SingularAttribute<DetalleNomina, Double> otrosDescuentos;
    public static volatile SingularAttribute<DetalleNomina, Double> valorHorasExtras;
    public static volatile SingularAttribute<DetalleNomina, Double> descuentoFondoSolidaridad;
    public static volatile SingularAttribute<DetalleNomina, Double> totalDevengado;
    public static volatile SingularAttribute<DetalleNomina, Integer> diasLaborados;
    public static volatile SingularAttribute<DetalleNomina, Nomina> nomina;
    public static volatile SingularAttribute<DetalleNomina, Double> sueldoDevengado;
    public static volatile SingularAttribute<DetalleNomina, Usuario> empleado;
    public static volatile SingularAttribute<DetalleNomina, Double> totalDescuento;
    public static volatile SingularAttribute<DetalleNomina, Double> auxilioTransporte;
    public static volatile SingularAttribute<DetalleNomina, Integer> id;

}