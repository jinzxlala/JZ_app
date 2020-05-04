package com.wzq.jz_app.common;

public class Constants {

    //网络请求
    public static final String BASE_URL = "http://139.199.176.173:8080/ssmBillBook";
    public static final String USER_LOGIN = "/user/login";
    public static final String USER_SIGN = "/user/sign";
    public static final String USER_UPDATE = "/user/update";
    public static final String USER_CHANGEPW = "/user/changePw";
    public static final String USER_FORGETPW = "/user/forgetPw";
    public static final String BILL_MONTH_DETIAL = "/bill/user";
    public static final String BILL_MONTH_CHART = "/bill/chart";
    public static final String BILL_MONTH_CARD = "/bill/pay";
    public static final String BILL_DELETE = "/bill/delete";
    public static final String BILL_UPDATE = "/bill/update";
    public static final String BILL_ADD = "/bill/add";
    public static final String NOTE_USER = "/note/user";
    public static final String NOTE_SORT_ADD = "/note/sort/add";
    public static final String NOTE_SORT_UPDATE = "/note/sort/update";
    public static final String NOTE_PAY_ADD = "/note/pay/add";
    public static final String NOTE_PAY_UPDATE = "/note/pay/update";
    public static final String IMAGE_USER = "/upload/";
    public static final String IMAGE_SORT = "/upload/noteImg/sort/";
    public static final String IMAGE_PAY = "/upload/noteImg/pay/";


    public static final String CACHE = "cache";
    public static final int LATEST_COLUMN = Integer.MAX_VALUE;
    public static final int BASE_COLUMN = 100000000;

    //当前用户
    public static int currentUserId = 0;

    public static String EXTRA_IS_UPDATE_THEME = "com.copasso.cocobill.IS_UPDATE_THEME";

    //默认note(账单分类和支付方式)
    public static String BILL_NOTE = "{\"status\":100,\"message\":\"处理成功！\"," +
            "\"outSortlis\":[" +
            "{\"id\":1,\"uid\":0,\"sortName\":\"Repayment\",\"sortImg\":\"sort_huankuan.png\",\"priority\":0,\"income\":false}," +
            "{\"id\":2,\"uid\":0,\"sortName\":\"Handling fee\",\"sortImg\":\"sort_shouxufei.png\",\"priority\":1,\"income\":false}," +
            "{\"id\":3,\"uid\":0,\"sortName\":\"Liquidated damages\",\"sortImg\":\"sort_weiyuejin.png\",\"priority\":2,\"income\":false}," +
            "{\"id\":4,\"uid\":0,\"sortName\":\"House\",\"sortImg\":\"sort_zhufang.png\",\"priority\":3,\"income\":false}," +
            "{\"id\":5,\"uid\":0,\"sortName\":\"Office\",\"sortImg\":\"sort_bangong.png\",\"priority\":4,\"income\":false}," +
            "{\"id\":6,\"uid\":0,\"sortName\":\"Food\",\"sortImg\":\"sort_canyin.png\",\"priority\":5,\"income\":false}," +
            "{\"id\":7,\"uid\":0,\"sortName\":\"Medical\",\"sortImg\":\"sort_yiliao.png\",\"priority\":6,\"income\":false}," +
            "{\"id\":8,\"uid\":0,\"sortName\":\"Sport\",\"sortImg\":\"sort_yundong.png\",\"priority\":7,\"income\":false}," +
            "{\"id\":9,\"uid\":0,\"sortName\":\"Entertainment\",\"sortImg\":\"sort_yule.png\",\"priority\":8,\"income\":false}," +
            "{\"id\":10,\"uid\":0,\"sortName\":\"Furniture\",\"sortImg\":\"sort_jujia.png\",\"priority\":9,\"income\":false}," +
            "{\"id\":11,\"uid\":0,\"sortName\":\"Pet\",\"sortImg\":\"sort_chongwu.png\",\"priority\":10,\"income\":false}," +
            "{\"id\":12,\"uid\":0,\"sortName\":\"Media\",\"sortImg\":\"sort_shuma.png\",\"priority\":11,\"income\":false}," +
            "{\"id\":13,\"uid\":0,\"sortName\":\"Donate\",\"sortImg\":\"sort_juanzeng.png\",\"priority\":12,\"income\":false}," +
            "{\"id\":14,\"uid\":0,\"sortName\":\"Snacks\",\"sortImg\":\"sort_lingshi.png\",\"priority\":13,\"income\":false}," +
            "{\"id\":15,\"uid\":0,\"sortName\":\"Children\",\"sortImg\":\"sort_haizi.png\",\"priority\":14,\"income\":false}," +
            "{\"id\":16,\"uid\":0,\"sortName\":\"Elders\",\"sortImg\":\"sort_zhangbei.png\",\"priority\":15,\"income\":false}," +
            "{\"id\":17,\"uid\":0,\"sortName\":\"Present\",\"sortImg\":\"sort_liwu.png\",\"priority\":16,\"income\":false}," +
            "{\"id\":18,\"uid\":0,\"sortName\":\"Study\",\"sortImg\":\"sort_xuexi.png\",\"priority\":17,\"income\":false}," +
            "{\"id\":19,\"uid\":0,\"sortName\":\"Fruit\",\"sortImg\":\"sort_shuiguo.png\",\"priority\":18,\"income\":false}," +
            "{\"id\":20,\"uid\":0,\"sortName\":\"Beauty\",\"sortImg\":\"sort_meirong.png\",\"priority\":19,\"income\":false}," +
            "{\"id\":21,\"uid\":0,\"sortName\":\"Repairing\",\"sortImg\":\"sort_weixiu.png\",\"priority\":20,\"income\":false}," +
            "{\"id\":22,\"uid\":0,\"sortName\":\"Travel\",\"sortImg\":\"sort_lvxing.png\",\"priority\":21,\"income\":false}," +
            "{\"id\":23,\"uid\":0,\"sortName\":\"Transport\",\"sortImg\":\"sort_jiaotong.png\",\"priority\":22,\"income\":false}," +
            "{\"id\":24,\"uid\":0,\"sortName\":\"Drink\",\"sortImg\":\"sort_jiushui.png\",\"priority\":23,\"income\":false}," +
            "{\"id\":25,\"uid\":0,\"sortName\":\"Gift Money\",\"sortImg\":\"sort_lijin.png\",\"priority\":24,\"income\":false}]," +
            "\"inSortlis\":[" +
            "{\"id\":26,\"uid\":0,\"sortName\":\"Salary\",\"sortImg\":\"sort_lijin.png\",\"priority\":0,\"income\":true}," +
            "{\"id\":27,\"uid\":0,\"sortName\":\"Gift Money\",\"sortImg\":\"sort_jiangjin.png\",\"priority\":1,\"income\":true}," +
            "{\"id\":28,\"uid\":0,\"sortName\":\"Interest\",\"sortImg\":\"sort_lixi.png\",\"priority\":2,\"income\":true}," +
            "{\"id\":29,\"uid\":0,\"sortName\":\"Financial\",\"sortImg\":\"sort_fanxian.png\",\"priority\":3,\"income\":true}," +
            "{\"id\":30,\"uid\":0,\"sortName\":\"Part-time Job\",\"sortImg\":\"sort_jianzhi.png\",\"priority\":4,\"income\":true}]," +
            "\"payinfo\":[" +
            "{\"id\":1,\"uid\":0,\"payName\":\"Cash\",\"payImg\":\"card_cash.png\",\"payNum\":null}," +
            "{\"id\":2,\"uid\":0,\"payName\":\"Alipay\",\"payImg\":\"card_account.png\",\"payNum\":null}," +
            "{\"id\":3,\"uid\":0,\"payName\":\"Wechat\",\"payImg\":\"card_cash.png\",\"payNum\":null},"+
            "{\"id\":4,\"uid\":0,\"payName\":\"Credit Card\",\"payImg\":\"card_account.png\",\"payNum\":\"null\"}]}\n";
}
