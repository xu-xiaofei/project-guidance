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
 * 公用电厂设备信息
 * </p>
 *
 * @author xiaofei.xu
 * @since 2021-04-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("T_POWER_PROJECT_ARCHIVES_DEVICE")
@ApiModel(value="PowerProjectArchivesDevice对象", description="公用电厂设备信息")
public class PowerProjectArchivesDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("ID")
    private Integer id;

    @ApiModelProperty(value = "电厂主键")
    @TableField("PLANT_ID")
    private Integer plantId;

    @ApiModelProperty(value = "机组编号")
    @TableField("UNIT_CODE")
    private String unitCode;

    @ApiModelProperty(value = "机组容量")
    @TableField("CAPACITY")
    private String capacity;

    @ApiModelProperty(value = "机组类型")
    @TableField("TYPE")
    private Integer type;

    @ApiModelProperty(value = "设计寿命")
    @TableField("LIFE")
    private BigDecimal life;

    @ApiModelProperty(value = "投产时间")
    @TableField("START")
    private Date start;

    @ApiModelProperty(value = "是否并网（0：不是，1：是）")
    @TableField("GRID")
    private Integer grid;

    @ApiModelProperty(value = "机组退役时间")
    @TableField("END")
    private Date end;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATE_TIME")
    private Date updateTime;


}
