package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @program: demo
 * @description:
 * @author: mooncake
 * @create: 2021-04-21 20:02
 **/
public class MyBatisUtil {
    public static final String CONFIG_PATH = "SqlMapConfig.xml";

    // 每一个MyBatis的应用程序都以一个SqlSessionFactory对象的实例为核心
    // 使用SqlSessionFactory的最佳实践是在应用运行期间不要重复创建多次,最佳范围是应用范围
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        Reader read = null;
        try {
            read = Resources.getResourceAsReader(CONFIG_PATH);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(read);
            read.close();
        } catch (IOException e) {
            System.out.println("Read资源文件异常");
            e.printStackTrace();
        }

    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    // 获取session
    public static SqlSession getSqlsession() {
        return sqlSessionFactory.openSession(true);
    }

    // 关闭session
    public static void closeSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    /**
     * 获取SqlSession
     *
     * @param isAutoCommit
     *            true 表示创建的SqlSession对象在执行完SQL之后会自动提交事务 false
     *            不会自动提交事务，这时就需要我们手动调用sqlSession. commit()提交事务
     * @return SqlSession
     */
    public static SqlSession getSqlSession(boolean isAutoCommit) {
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}
