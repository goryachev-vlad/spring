package iexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeatSpring {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
      Been testBeen =  context.getBean("testBean", Been.class);
      System.out.println(testBeen.getName());
      context.close();
    }
}
