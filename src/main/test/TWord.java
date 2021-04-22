import cn.zzu.dao.WordDao;
import cn.zzu.entity.Word;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import util.MyBatisUtil;

import java.io.InputStream;
import java.util.List;

/**
 * @program: demo
 * @description: 1
 * @author: mooncake
 * @create: 2021-04-19 21:09
 **/
public class TWord {
    public static void main(String[] args) throws Exception {
        //1、读取配置文件

//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        //2、创建sqlSessionFactory的构建对象
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        //3、使用构建者创建工厂对象sqlSessionFactory
//        SqlSessionFactory factory = builder.build(in);
//        //4、使用sqlSessionFactory生产SqlSession对象
        SqlSession session = MyBatisUtil.getSqlsession();
        //5、使用SqlSession创建dao接口的代理对象
        WordDao wordDao = session.getMapper(WordDao.class);
        //6、使用代理对象执行查询所有方法
        wordDao.removeNote("occfm1XR2rLSUu7nZKvyDnpVVk_s",1,System.currentTimeMillis());
        List<Word> words = wordDao.noteWords();
        for (Word word : words) {
            System.out.print(word.getId());
            System.out.print(word.getWord());
            System.out.print(word.getMeaning());
            System.out.print(word.getAmerica_pronunciation());
            System.out.println();


        }
        //7、释放资源
        session.close();
    }
}
