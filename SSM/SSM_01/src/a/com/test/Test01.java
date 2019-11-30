package a.com.test;

import a.com.dao.ItemsMapper;
import a.com.po.Items;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test01 {

    @Test
    public void test() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Application.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) classPathXmlApplicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ItemsMapper mapper = sqlSession.getMapper(ItemsMapper.class);
        List<Items> allItems = mapper.findAllItems();
        System.out.println(allItems);
    }


}
