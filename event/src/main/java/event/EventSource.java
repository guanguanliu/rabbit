package event;

/**
 * @author guan
 * @ClassName EventSource
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-24 11:46
 */
public class EventSource {
    private EventListener eventListener = new EventListener();

    public void noticeListener(Event event){
        eventListener.doSomething(event);
    }
}
