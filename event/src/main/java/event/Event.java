package event;

/**
 * @author 关少卷
 * @ClassName Event
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-24 11:35
 */
public enum Event {


    QIANSHOU("qianShou", "牵手"),
    GAOBAI("gaoBai", "告白"),
    LIANAI("lianAi", "恋爱"),
    JIEHUN("jieHun", "结婚");

    private String event;
    private String desc;

    Event(String event, String desc) {
        this.event = event;
        this.desc = desc;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
