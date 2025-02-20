package com.mg.test;

import com.mg.test.newland.BillForRefundRes;
import com.mg.test.newland.DbiCfgBo;
import com.mg.test.newland.RefundDict;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.collections4.CollectionUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.scheduling.annotation.Async;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

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
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1","2");
        map.put("1",null);
        map.put("1","2");
//        Integer.parseInt(null);
//        getAllDbiCfgByPreDbiId(2,"1",1);
//        assertTrue( true );
    }

    public void testapp() {
        List b = getRandomThreeInfoList(mockDbiCfgs(),2);
        int a=1;
    }


    public static List getRandomThreeInfoList(List list, int count) {
        List olist = new ArrayList<>();
        if (list.size() <= count) {
            return list;
        } else {
            Random random = new Random();
            for (int i = 0 ;i<count;i++){
                int intRandom = random.nextInt(list.size() - 1);
                olist.add(list.get(intRandom));
                list.remove(list.get(intRandom));
            }
            return olist;
        }
    }

    public List<DbiCfgBo> getAllDbiCfgByPreDbiId(int level, String preDbiId, int billMonth) {
        List<DbiCfgBo> dbiCfgList = new ArrayList<>();


        this.getDbiCfgsByPreDbiId(preDbiId,dbiCfgList,mockDbiCfgs());
        return dbiCfgList;
    }

    List<DbiCfgBo> mockDbiCfgs() {
        List<DbiCfgBo> allDbiCfgList = new ArrayList<>();

        allDbiCfgList.add(generateDbiCfgBo("1",null,1));
        allDbiCfgList.add(generateDbiCfgBo("2",null,1));
        allDbiCfgList.add(generateDbiCfgBo("3",null,1));
        allDbiCfgList.add(generateDbiCfgBo("4",null,1));
        allDbiCfgList.add(generateDbiCfgBo("5",null,1));

        allDbiCfgList.add(generateDbiCfgBo("11","1",2));
        allDbiCfgList.add(generateDbiCfgBo("12","1",2));
        allDbiCfgList.add(generateDbiCfgBo("13","1",2));
        allDbiCfgList.add(generateDbiCfgBo("21","2",2));
        allDbiCfgList.add(generateDbiCfgBo("22","2",2));
        allDbiCfgList.add(generateDbiCfgBo("31","3",2));
        allDbiCfgList.add(generateDbiCfgBo("32","3",2));
        allDbiCfgList.add(generateDbiCfgBo("33","3",2));
        allDbiCfgList.add(generateDbiCfgBo("34","3",2));



        allDbiCfgList.add(generateDbiCfgBo("111","11",3));
        allDbiCfgList.add(generateDbiCfgBo("113","11",3));
        allDbiCfgList.add(generateDbiCfgBo("121","12",3));
        allDbiCfgList.add(generateDbiCfgBo("114","11",3));
        allDbiCfgList.add(generateDbiCfgBo("131","13",3));
        allDbiCfgList.add(generateDbiCfgBo("132","13",3));
        allDbiCfgList.add(generateDbiCfgBo("133","13",3));
        allDbiCfgList.add(generateDbiCfgBo("134","13",3));
        allDbiCfgList.add(generateDbiCfgBo("211","21",3));


        allDbiCfgList.add(generateDbiCfgBo("1111","111",4));
        allDbiCfgList.add(generateDbiCfgBo("1113","111",4));
        allDbiCfgList.add(generateDbiCfgBo("1131","113",4));
        allDbiCfgList.add(generateDbiCfgBo("1331","133",4));
        allDbiCfgList.add(generateDbiCfgBo("1341","134",4));
        allDbiCfgList.add(generateDbiCfgBo("1332","133",4));
        allDbiCfgList.add(generateDbiCfgBo("1211","121",4));
        allDbiCfgList.add(generateDbiCfgBo("1321","132",4));
        allDbiCfgList.add(generateDbiCfgBo("1311","131",4));
        return allDbiCfgList;
    }

    void getDbiCfgsByPreDbiId(String preDbiId, List<DbiCfgBo> dbiCfgList,List<DbiCfgBo> allDbiCfgList) {
        List<DbiCfgBo> childrenCfgBOs = allDbiCfgList.stream().filter(item -> preDbiId.equals(item.getPreDbiId())).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(childrenCfgBOs)) {
            dbiCfgList.addAll(childrenCfgBOs);
            // 递归获取所有子节点
            for (DbiCfgBo dbiCfgBo : childrenCfgBOs) {
                getDbiCfgsByPreDbiId(dbiCfgBo.getDbiId(), dbiCfgList, allDbiCfgList);
            }
        }
    }

    DbiCfgBo generateDbiCfgBo(String dbiId,String preDbiId,int dbiLevel) {
        DbiCfgBo dbiCfgBo = new DbiCfgBo();
        dbiCfgBo.setDbiId(dbiId);
        dbiCfgBo.setDbiName("测试"+dbiId);
        dbiCfgBo.setPreDbiId(preDbiId);
        dbiCfgBo.setDbiLevel((short) dbiLevel);
        return dbiCfgBo;
    }

    public void testAsync() {
        for (int i = 0; i < 10; i++) {
            Map<String, Object> requestMap = new HashMap<>();
            requestMap.put("a", i);
            completableFutureList.add(queryRefundDiagnosisResult(requestMap));
        }
        CompletableFuture.allOf(completableFutureList.toArray(new CompletableFuture[completableFutureList.size()])).join();
        Map<Integer, Integer> integerMap = new HashMap<>();
        completableFutureList.stream().forEach(mapCompletableFuture -> {
            try {
                int p = 0;
                Integer key = (Integer) mapCompletableFuture.get().get("a");
                integerMap.put(key,p);
                if (key>5) {
                    p = p/0;
                }
                p = 1;
                integerMap.put(key,p);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        });
        for (Integer map : integerMap.values()) {
            System.out.println(map);
        }
    }

    List<CompletableFuture<Map<String, Object>>> completableFutureList = new ArrayList<>();

    @Async
    public CompletableFuture<Map<String, Object>> queryRefundDiagnosisResult(Map<String, Object> requestMap) {
        try {
            //1~5随机数
            Random rand = new Random();
            int min = 1;
            int max = 5;
            int randomNum = rand.nextInt(max - min + 1) + min;
            Thread.sleep(randomNum*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture(requestMap);
    }


    public void testGetMapNullV() throws JSONException {
        JSONObject jo = new JSONObject();
        BillForRefundRes billForRefundRes = new BillForRefundRes();
        List<RefundDict> noRefundDicts = new ArrayList<>();
        Set<String> noRefundCodeDicts = noRefundDicts.stream().map(RefundDict::getDictValue).collect(Collectors.toSet());
        Map<String, RefundDict> noRefundDictsMap = noRefundDicts.stream()
                .collect(Collectors.toMap(RefundDict::getDictValue, o -> o, (o1, o2) -> o1));
        String noRefundCode = "0";
        //是否可退费 true可退费false不可退费
        boolean isCanRefund = !noRefundCodeDicts.contains(noRefundCode);
        //未诊断(goToDiagnosis)
        billForRefundRes.setGoToDiagnosis(!isCanRefund);
        jo.put("canRefundFlag", isCanRefund);
        jo.put("reason", noRefundDictsMap.get(noRefundCode).getValueDesc());
//        jo.put("reason", noRefundDictsMap.getOrDefault(noRefundCode, RefundDict.RefundDictBuilder
//                .aRefundDict().withValueDesc("").build()).getValueDesc());
        System.out.println(jo.toString());
    }


}
