package carrospartesejb.entity;

import carrospartesejb.entity.CarrosPartes;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-15T19:20:20")
@StaticMetamodel(Carros.class)
public class Carros_ { 

    public static volatile SingularAttribute<Carros, String> marca;
    public static volatile CollectionAttribute<Carros, CarrosPartes> carrosPartesCollection;
    public static volatile SingularAttribute<Carros, String> color;
    public static volatile SingularAttribute<Carros, String> modelo;
    public static volatile SingularAttribute<Carros, String> placa;

}