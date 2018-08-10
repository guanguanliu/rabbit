package dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author guan
 * @ClassName DateTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-09 11:41
 */
public class DateTest {

    private Date date;

    @JSONField(format = "yyyyMMdd")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
