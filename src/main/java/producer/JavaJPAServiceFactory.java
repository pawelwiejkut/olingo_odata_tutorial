package producer;

import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;
import org.apache.olingo.odata2.jpa.processor.ref.factory.JPAEntityManagerFactory;

public class JavaJPAServiceFactory extends ODataJPAServiceFactory {
    private static final String PUNIT_NAME = "odataJPAService";

    @Override
    public ODataJPAContext initializeODataJPAContext()
            throws ODataJPARuntimeException {
        ODataJPAContext oDataJPAContext = getODataJPAContext();
        oDataJPAContext.setEntityManagerFactory(JPAEntityManagerFactory
                .getEntityManagerFactory(PUNIT_NAME));
        oDataJPAContext.setPersistenceUnitName(PUNIT_NAME);
        return oDataJPAContext;
    }

}