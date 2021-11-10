package com.design.strategy.factory.vo;

/**
 * 策略枚举
 * 将会员类型和策略类绑定
 * 注意：策略类注入到容器中首字母小写
 *
 * @author Albert
 * @date 2021/1/20 上午10:43
 */
public enum BuyerEnum {

    /**
     * 超级会员
     */
    SUPER_VIP(0, "superVipBuyer"),
    /**
     * 会员
     */
    VIP(1, "vipBuyer"),
    /**
     * 店铺专属会员
     */
    SHOP_VIP(2, "shopVipBuyer");

    /**
     * 会员类型
     */
    private final Integer type;
    /**
     * 策略类名称
     */
    private final String buyerClassName;

    BuyerEnum(Integer type, String buyerClassName) {
        this.type = type;
        this.buyerClassName = buyerClassName;
    }

    public Integer getType() {
        return type;
    }

    public String getBuyerClassName() {
        return buyerClassName;
    }

    /**
     * 根据会员类型获取包装类
     */
    public static String getBuyerClassNameByType(Integer type) {
        BuyerEnum[] values = BuyerEnum.values();
        for (BuyerEnum value : values) {
            if (value.getType().equals(type)) {
                return value.getBuyerClassName();
            }
        }
        return "";
    }


}
