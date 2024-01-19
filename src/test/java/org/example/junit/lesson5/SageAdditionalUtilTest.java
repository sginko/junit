package org.example.junit.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class SageAdditionalUtilTest {
    private SageAdditionalUtil util = new SageAdditionalUtil();

    @Test
//    @Parameters({
//            "1, 2, 3",
//            "-10, 30, 20",
//            "-5, -10, -15"
//    })
//    @Parameters(method = "parametersToTestAdd")
//    @Parameters (source = ProviderTestData.class)
    @FileParameters("src/test/resources/Parameters.csv")
    void whenWithAnnotationProviderParams_ThenSafeAdd(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a, b));
    }

    public Object[] parametersForWhenWithAnnotationProviderParams_ThenSafeAdd(){
        return new Object[]{
                new Object[] {1,2,3},
                new Object[] {-10, 30, 20},
                new Object[] {Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
                new Object[] {Integer.MIN_VALUE, -8, Integer.MIN_VALUE}
        };
    }

}