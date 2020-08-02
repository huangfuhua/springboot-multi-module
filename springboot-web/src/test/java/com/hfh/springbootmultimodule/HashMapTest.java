package com.hfh.springbootmultimodule;

import org.junit.Test;

/**
 * Created by huangfuhua on 2019-06-16.
 */
public class HashMapTest {
    @Test
    public void testHashMap(){
        String key = "hfhh";
        int hashCode = key.hashCode();
        String binaryHashCode = Integer.toBinaryString(hashCode);
        System.out.println("hashCode  " + hashCode + " binaryHashCode " + binaryHashCode);
        int lowHashCode = hashCode >>> 16;
        String binaryLowHashCode = Integer.toBinaryString(lowHashCode);
        System.out.println("lowHashCode  " + lowHashCode + " binaryLowHashCode " + binaryLowHashCode);
        int result = hashCode ^ lowHashCode;
        String binaryResult = Integer.toBinaryString(result);
        System.out.println("result  " + result + " binaryResult  " + binaryResult);
    }
}
