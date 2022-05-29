package com.awei.test.gupao.design.strategy.pay;

import com.awei.test.gupao.design.strategy.payport.AliPay;
import com.awei.test.gupao.design.strategy.payport.JDPay;
import com.awei.test.gupao.design.strategy.payport.WechatPay;

import java.util.HashMap;

public  class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JDPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = "AliPay";

    private static HashMap<String, Payment> map = new HashMap<String, Payment>() {{
        put(ALI_PAY, new AliPay());
        put(WECHAT_PAY, new WechatPay());
        put(JD_PAY, new JDPay());
        put(DEFAULT_PAY, new AliPay());
    }};

    public static Payment get(String payKey) {
        if (!map.containsKey(payKey)) {
            return map.get(DEFAULT_PAY);
        } else {
            return map.get(payKey);
        }

    }

}
