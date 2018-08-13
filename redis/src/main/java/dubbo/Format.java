package dubbo;

import com.smy.framework.core.util.DateUtil;
import dto.DateTest;

import java.util.Date;

/**
 * @author guanguan
 * @ClassName Format
 * @Description TODO(测试)
 * @Date 2018-08-08 14:58
 */
public class Format {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        DateTest dateTest = new DateTest();
        dateTest.setDate(date);
        System.out.println(DateUtil.date2String(date));

    }

}
