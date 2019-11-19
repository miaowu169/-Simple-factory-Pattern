package com.game.Factory;
/*
 * 简单工厂类（提供创建接口）
 */
import com.game.domain.Hero;
import com.game.domain.HouYi;
import com.game.domain.LuBanQiHao;

public class HeroFactory {
    public static Hero createHero(String HeroName) throws Exception {
        //传入HouYi，工厂创建并返回HouYi实例
        if(HeroName.equalsIgnoreCase("HouYi")) {
            return new HouYi();
        }else if(HeroName.equalsIgnoreCase("LuBanQiHao")){
        //传入LuBanQiHao,工厂创建并返回LuBanQiHao实例
            return new LuBanQiHao();
        }else {
            throw new Exception();//抛出异常
        }
    }
}