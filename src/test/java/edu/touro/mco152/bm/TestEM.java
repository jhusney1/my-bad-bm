package edu.touro.mco152.bm;

import edu.touro.mco152.bm.persist.EM;
import org.eclipse.persistence.jpa.jpql.Assert;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEM {

    @Test
    public void testValueOfEM() {

        EntityManager em = EM.getEntityManager();
        EntityManager em2 = EM.getEntityManager();


        // Make sure not null
        Assert.isNotNull(EM.getEntityManager(),"");

        /**
         * makes sure of singleton property
         */
        // Make sure value stays the same
        assertEquals(em, em2);

    }
}
