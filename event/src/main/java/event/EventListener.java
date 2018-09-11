package event;

/**
 * @author guan
 * @ClassName EventListener
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-24 11:45
 */
public class EventListener implements IListener {
    @Override
    public void doSomething(Event event) {
        switch (event.getEvent()) {
            case "qianShou":
                System.out.println("恋爱四部曲，第二" + event.getDesc());
                break;
            case "gaoBai":
                System.out.println("恋爱四部曲，第一" + event.getDesc());
                break;
            case "lianAi":
                System.out.println("恋爱四部曲，第三" + event.getDesc());
                break;
            case "jieHun":
                System.out.println("恋爱四部曲，最后" + event.getDesc());
                break;
            default:
                System.out.println("恋爱四部曲，没有改步骤");
        }

    }
}
