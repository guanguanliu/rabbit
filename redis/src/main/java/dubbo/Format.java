package dubbo;

import com.smy.framework.core.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author guanguan
 * @ClassName Format
 * @Description TODO(测试)
 * @Date 2018-08-08 14:58
 */
public class Format {
    public static void main(String[] args) {


        String string = "20180831150000".substring(0,8);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        try {
//            System.out.println(sdf.parse(string));
//            System.out.println(new Date());
//        }catch (Exception e){}

       // Date date = DateUtil.parseDate(string);
        Date now = new Date();
        String string1 = DateUtil.date2String(now);
        System.out.println(string1);
        boolean flag = DateUtil.isWithInDateGap(string,string1,Calendar.DAY_OF_YEAR,7);
        System.out.println(flag);
    }

}
