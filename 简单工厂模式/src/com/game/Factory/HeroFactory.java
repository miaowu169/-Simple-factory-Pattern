package com.game.Factory;
/*
 * �򵥹����ࣨ�ṩ�����ӿڣ�
 */
import com.game.domain.Hero;
import com.game.domain.HouYi;
import com.game.domain.LuBanQiHao;

public class HeroFactory {
    public static Hero createHero(String HeroName) throws Exception {
        //����HouYi����������������HouYiʵ��
        if(HeroName.equalsIgnoreCase("HouYi")) {
            return new HouYi();
        }else if(HeroName.equalsIgnoreCase("LuBanQiHao")){
        //����LuBanQiHao,��������������LuBanQiHaoʵ��
            return new LuBanQiHao();
        }else {
            throw new Exception();//�׳��쳣
        }
    }
}