package com.game.Test;
/*
 * Ӣ�۹���������
 */

import com.game.Factory.HeroFactory;
import com.game.domain.Hero;

public class HeroFactoryTest {
    public static void main(String [] args) {
        //ʹ�ù����Ĵ�����������������Ӣ�۵����ƣ��ɹ�������Ӣ��
        try {
            //1.ѡ��Ӣ�ۺ���
            System.out.println("=======choose1=======");
            System.out.println("��ѡ�����Ӣ�ۣ�");
            //�򹤳�����Ӣ�۵�����
            Hero hero1 = HeroFactory.createHero("HouYi");
            System.out.println("��ѡ���Ӣ���ǡ�"+hero1.getHeroName()+"��");
            hero1.display();
            //2.ѡ��Ӣ��³���ߺ�
            System.out.println("=======choose2========");
            System.out.println("��ѡ�����Ӣ�ۣ�");
            //�򹤳�����Ӣ�۵�����
            Hero hero2 = HeroFactory.createHero("LuBanQiHao");
            System.out.println("��ѡ���Ӣ���ǡ�"+hero2.getHeroName()+"��");
            hero2.display();
        }catch(Exception e) {//��׽�쳣
            System.out.println("�����ڴ�Ӣ�ۣ�");
        }
    }
}