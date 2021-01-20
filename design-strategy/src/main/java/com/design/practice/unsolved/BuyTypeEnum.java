package com.design.practice.unsolved;

/**
 * @author Albert
 * @date 2021/1/20 上午10:43
 */
public enum BuyTypeEnum {

    /**
     * 超级会员
     */
    SUPER_VIP(0),
    /**
     * 会员
     */
    VIP(1),
    /**
     * 店铺专属会员
     */
    SHOP_VIP(2);

    /**
     * 会员类型
     */
    private final Integer type;

    BuyTypeEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }


}
