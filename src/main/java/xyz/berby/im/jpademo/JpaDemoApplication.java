package xyz.berby.im.jpademo;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import xyz.berby.im.jpademo.dao.SjWtMethodDao;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class JpaDemoApplication {

    @Autowired
    private SjWtMethodDao sjWtMethodDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        List<Map<String, Object>> list = this.sjWtMethodDao.query();
        System.out.println(JSON.toJSONString(list));

    }

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }
}
