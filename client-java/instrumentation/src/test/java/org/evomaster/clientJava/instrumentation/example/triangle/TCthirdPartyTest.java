package org.evomaster.clientJava.instrumentation.example.triangle;

import org.evomaster.clientJava.instrumentation.InstrumentingClassLoader;
import com.foo.somedifferentpackage.examples.triangle.TriangleClassificationImpl;

public class TCthirdPartyTest extends TriangleClassificationTestBase {

    @Override
    protected TriangleClassification getInstance() throws Exception {

        InstrumentingClassLoader cl =
                new InstrumentingClassLoader("org.invalid");

        return (TriangleClassification)
                cl.loadClass(TriangleClassificationImpl.class.getName())
                        .newInstance();
    }
}
