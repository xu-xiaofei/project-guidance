package org.nmg.energy.platform.web.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 电厂月度排放指标表
 * </p>
 *
 * @author xiaofei.xu
 * @since 2021-04-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("T_POWER_PROJECT_MONTH")
@ApiModel(value="PowerProjectMonth对象", description="电厂月度排放指标表")
public class PowerProjectMonth implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId("ID")
    private String id;

    @ApiModelProperty(value = "电厂id")
    @TableField("PLANT_ID")
    private Integer plantId;

    @ApiModelProperty(value = "数据时间")
    @TableField("DATA_TIME")
    private Date dataTime;

    @ApiModelProperty(value = "发电标煤耗")
    @TableField("GENERATION")
    private BigDecimal generation;

    @ApiModelProperty(value = "供电标煤耗")
    @TableField("SUPPLY")
    private BigDecimal supply;

    @ApiModelProperty(value = "厂用电率")
    @TableField("RATE")
    private BigDecimal rate;

    @ApiModelProperty(value = "主蒸汽参数")
    @TableField("STEAM")
    private BigDecimal steam;

    @ApiModelProperty(value = "烟尘排放浓度")
    @TableField("SMOKE")
    private BigDecimal smoke;

    @ApiModelProperty(value = "氮氧化物排放浓度")
    @TableField("NOX")
    private BigDecimal nox;

    @ApiModelProperty(value = "二氧化硫排放浓度")
    @TableField("SO2")
    private BigDecimal so2;

    @ApiModelProperty(value = "是否超排放（0：不是，1：是）")
    @TableField("OVER_OUT")
    private Integer overOut;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATE_TIME")
    private Date updateTime;


}
