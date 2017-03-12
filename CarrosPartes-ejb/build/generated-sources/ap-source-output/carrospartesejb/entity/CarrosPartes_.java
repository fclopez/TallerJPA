package carrospartesejb.entity;

import carrospartesejb.entity.Carros;
import carrospartesejb.entity.CarrosPartesPK;
import carrospartesejb.entity.Partes;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-12T18:21:41")
@StaticMetamodel(CarrosPartes.class)
public class CarrosPartes_ { 

    public static volatile SingularAttribute<CarrosPartes, CarrosPartesPK> carrosPartesPK;
    public static volatile SingularAttribute<CarrosPartes, Partes> partes;
    public static volatile SingularAttribute<CarrosPartes, Integer> cantidad;
    public static volatile SingularAttribute<CarrosPartes, Carros> carros;

}