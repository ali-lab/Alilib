package test;

import alilibs.AliHTTP;
import alilibs.AliLog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 闲道人阿力 on 2016/8/27.
 */
public class main {
    public static void main(String []args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = ac.getBean(Person.class);
        p.fuck();
        System.out.println(p.getC());
        AliLog.println(p.getDao());






    }
}
