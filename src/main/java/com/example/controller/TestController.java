package com.example.controller;

import com.example.entity.BuilderPattern.MealBuilder;
import com.example.entity.ObserverPattern.BinaryObserver;
import com.example.entity.ObserverPattern.HexaObserver;
import com.example.entity.ObserverPattern.OctalObserver;
import com.example.entity.ObserverPattern.Subject;
import com.example.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.util.ResultUtil;

@Slf4j
@RestController
public class TestController {

    @RequestMapping(method = RequestMethod.GET,value = "/test")
    public String test() {
        try {
            ResultUtil resultUtil = null;
            boolean success = resultUtil.isSuccess();
            log.info("result = {}",success);
        } catch (Exception e) {
            log.error("报错啦",e);
        }
        return "SUCCESS";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/test/redis")
    public String testRedis(@RequestParam("key") String key,@RequestParam("value") Object value) {
        String result = RedisUtil.put(key, value);
        return result;
    }

//    public static void main(String[] args) {
//        ModelDuck modelDuck = new ModelDuck();
//        RealDuck realDuck = new RealDuck();
//        modelDuck.fly();
//        modelDuck.sound();
//        realDuck.fly();
//        realDuck.sound();
//    }

//    public static void main(String[] args) {
//        Subject subject = new Subject();
//
//        new HexaObserver(subject);
//        new BinaryObserver(subject);
//        new OctalObserver(subject);
//
//        System.out.println("First state change: 15");
//        subject.setState(15);
//        System.out.println("Secound state change: 10");
//        subject.setState(10);
//    }

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        mealBuilder.MealOne().showItems();
        System.out.println(mealBuilder.MealOne().getCost());

        mealBuilder.MealTwo().showItems();
        System.out.println(mealBuilder.MealTwo().getCost());
    }
}
