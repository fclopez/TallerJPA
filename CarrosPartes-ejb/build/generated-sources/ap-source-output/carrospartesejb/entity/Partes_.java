package carrospartesejb.entity;

import carrospartesejb.entity.CarrosPartes;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-15T19:20:20")
@StaticMetamodel(Partes.class)
public class Partes_ { 

    public static volatile SingularAttribute<Partes, String> descripcion;
    public static volatile SingularAttribute<Partes, String> codigo;
    public static volatile CollectionAttribute<Partes, CarrosPartes> carrosPartesCollection;
    public static volatile SingularAttribute<Partes, String> nombre;

}