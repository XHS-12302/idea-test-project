package lambda.stream._operator.reduce;

import lambda.stream.model.Person;
import lambda.stream.utils.StreamUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Copyright 2018 ...com Inc. All Rights Reserved.
 *
 * @author: 12302
 * @Date: 2019-10-02
 * @Desc:
 */
public class TestReduce {
    public static void main(String[] args) {
        List<String> listStr = Arrays.asList("欢","迎","你");
        String appendStr = listStr.stream().reduce("北京",(a,b) -> a+b);
        System.out.println(appendStr);


        List<Person> list = StreamUtils.getList();
        list.forEach(System.out::println);

        //使用reduce
        System.out.println("\n=========================使用reduce()========================================");
        BigDecimal b = list.stream().map(Person::getForceValue).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(b.setScale(2,BigDecimal.ROUND_HALF_UP));


    }
    public static BigDecimal testcall(BigDecimal b1){
        System.out.println(b1);
        return b1;
    }
}

