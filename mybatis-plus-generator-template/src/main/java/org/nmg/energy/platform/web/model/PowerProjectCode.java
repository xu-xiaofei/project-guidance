package org.nmg.energy.platform.web.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 电厂档案字典表
 * </p>
 *
 * @author xiaofei.xu
 * @since 2021-04-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("T_POWER_PROJECT_CODE")
@ApiModel(value="PowerProjectCode对象", description="电厂档案字典表")
public class PowerProjectCode implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId("ID")
    private Integer id;

    @ApiModelProperty(value = "名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "类型id")
    @TableField("TYPE")
    private Integer type;

    @ApiModelProperty(value = "类型名称")
    @TableField("TYPENAME")
    private String typename;


}
