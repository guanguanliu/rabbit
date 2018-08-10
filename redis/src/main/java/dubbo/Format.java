package dubbo;

import com.alibaba.fastjson.JSON;
import dto.DateTest;

import java.util.Date;

/**
 * @author guanguan
 * @ClassName Format
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-08 14:58
 */
public class Format {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        DateTest dateTest = new DateTest();
        dateTest.setDate(date);

        String strDate = JSON.toJSONStringWithDateFormat(dateTest.getDate(),"yyyyMMdd");

        System.out.println(strDate);
    }

}
