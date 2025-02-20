package com.mg.workflow;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        try {
            List<Integer> q = getAreaIdListByAreaIds("1,2");
            int a = 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    public List<Integer> getAreaIdListByAreaIds(String areaIdsStr) throws Exception{
        List<Integer> areaIds = new ArrayList<>();
        if (StringUtils.isNotEmpty(areaIdsStr)) {
            String[] areaIdArr = areaIdsStr.split(",");
            for (String areaIdStr : areaIdArr) {
                areaIds.add(Integer.parseInt(areaIdStr));
            }
        }
        return areaIds;
    }
}
