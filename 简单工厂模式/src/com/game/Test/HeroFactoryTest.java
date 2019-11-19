package com.game.Test;
/*
 * 英雄工厂测试类
 */

import com.game.Factory.HeroFactory;
import com.game.domain.Hero;

public class HeroFactoryTest {
    public static void main(String [] args) {
        //使用工厂的创建工厂方法，传入英雄的名称，由工厂创建英雄
        try {
            //1.选择英雄后羿
            System.out.println("=======choose1=======");
            System.out.println("请选择你的英雄：");
            //向工厂传入英雄的名称
            Hero hero1 = HeroFactory.createHero("HouYi");
            System.out.println("您选择的英雄是【"+hero1.getHeroName()+"】");
            hero1.display();
            //2.选择英雄鲁班七号
            System.out.println("=======choose2========");
            System.out.println("请选择你的英雄：");
            //向工厂传入英雄的名称
            Hero hero2 = HeroFactory.createHero("LuBanQiHao");
            System.out.println("您选择的英雄是【"+hero2.getHeroName()+"】");
            hero2.display();
        }catch(Exception e) {//捕捉异常
            System.out.println("不存在此英雄！");
        }
    }
}