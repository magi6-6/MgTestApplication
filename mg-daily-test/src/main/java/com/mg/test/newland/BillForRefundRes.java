package com.mg.test.newland;

import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class BillForRefundRes {
    private String userId;
    private String amountReceivable;
    private String amountDiscount;
    private String amount;
    private String nameFour; //三级科目名称(原四级科目名称,后改为三级)
    private String nameOne; //一级科目名称
    private String dbiIdOne;  //一级科目id
    private String dbiIdFour; //四级科目id
    private String dbiIdThree; //三级科目id

    private String productId;  //账单表中产品id

    /**
     * 退费标记  0：没有退费  1：已部分退费 2：已全部退费
     */
    private int refundMark;

    private Integer typeValue;//这次选中的退费方式

    private String refundTotalMoney;//已退总金额

    private boolean edit; //修改的时候是不是可以修改

    private boolean sigFlag; //是不是可以补退双倍

    private double sigRefundMoney;//单倍退费总金额

    private double doubleRefundMoney;//双倍退费总金额

    private double repairMoney;//补退得总金额

    private String startTime;//清单退费的开始时间

    private String endTime;//清单退费的结束时间

    private Integer seq;//清单序号


    private Boolean listFlag;//是不是查询清单标识 产品编码包含2开头 则是sp业务 则需要查询清单  || 增值业务费支持清单退费 || 账单productId是0的  账单按照订单退费

    private Integer listFlagType;//1.原来的逻辑是查询清单（sp业务，增值业务） 2.账单productId是0的  账单按照订单退费  查询的是数据表 3 product_id不为0 到Account_base_cfg表中cfg_class =6586，对应VALUE_STR为四级科目编码 四级科目编码到一点计费实时扣费流水表（billing_charge_seq）中servicetype = 66。

    private Integer bookRefundFlag;//是不是预约退费

    private Boolean dbiFlag=true;//字典表配置的190类型的科目不可以退费  false不能退费 true可以退费
    private Boolean levelLimitFlag=true;//字典表配置的329类型的科目不可以退费  false不能退费 true可以退费
    //数家DLC不可退费原因
    private String nonRefundReason;

    private Integer spTotalRefund;//sp业务是不是清单总和退费

    private Boolean goToDiagnosis=false;//是不是跳转权益诊断

    private String diagnosisSystemUrl;//一键诊断平台链接

    private Boolean omdmFlag=Boolean.FALSE;//多买多送科目标识

    private Boolean omdmTotalRefund=Boolean.FALSE;//多买多送科目是不是总和退费

    // dbiIdFour（四级科目dbiId是否在dbi_limit_cfg表中）
    private Boolean dbiIdFourInCfgFlag=Boolean.FALSE;

    private List<Object> canRefundList;
}
