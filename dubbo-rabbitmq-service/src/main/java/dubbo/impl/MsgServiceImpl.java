package dubbo.impl;

import dubbo.MsgService;

public class MsgServiceImpl implements MsgService {

    @Override
    public String getMessage(String msg) {
        return msg;
    }
}
