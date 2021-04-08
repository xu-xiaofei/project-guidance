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
 * 电力项目档案表-公用
 * </p>
 *
 * @author xiaofei.xu
 * @since 2021-04-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("T_POWER_PROJECT_ARCHIVES")
@ApiModel(value="PowerProjectArchives对象", description="电力项目档案表-公用")
public class PowerProjectArchives implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("ID")
    private Integer id;

    @ApiModelProperty(value = "电厂信息-核准文件电厂名称")
    @TableField("PLANT_INFORMATION_APPROVED_PLANT_NAME")
    private String plantInformationApprovedPlantName;

    @ApiModelProperty(value = "电厂信息-电厂调度名称")
    @TableField("PLANT_INFORMATION_DISPATCHER_PLANT_NAME")
    private String plantInformationDispatcherPlantName;

    @ApiModelProperty(value = "电厂信息-经度")
    @TableField("PLANT_INFORMATION_LONGITUDE")
    private String plantInformationLongitude;

    @ApiModelProperty(value = "电厂信息-纬度")
    @TableField("PLANT_INFORMATION_LATITUDE")
    private String plantInformationLatitude;

    @ApiModelProperty(value = "电厂信息-所在盟市")
    @TableField("PLANT_INFORMATION_CITY_CODE")
    private String plantInformationCityCode;

    @ApiModelProperty(value = "电厂信息-县级行政区划")
    @TableField("PLANT_INFORMATION_COUNTY_CODE")
    private String plantInformationCountyCode;

    @ApiModelProperty(value = "电厂信息-详细地址")
    @TableField("PLANT_INFORMATION_ADDRESS")
    private String plantInformationAddress;

    @ApiModelProperty(value = "电厂信息-电厂类型")
    @TableField("PLANT_INFORMATION_PLANT_TYPE")
    private Integer plantInformationPlantType;

    @ApiModelProperty(value = "电厂信息-电厂类型二级")
    @TableField("PLANT_INFORMATION_PLANT_TYPE_TWO")
    private Integer plantInformationPlantTypeTwo;

    @ApiModelProperty(value = "电厂信息-电厂类型三级")
    @TableField("PLANT_INFORMATION_PLANT_TYPE_THREE")
    private Integer plantInformationPlantTypeThree;

    @ApiModelProperty(value = "电厂信息-燃料类型（1燃煤：，2：燃气，3：生物质，4：其他）")
    @TableField("PLANT_INFORMATION_FUEL_TYPE")
    private Integer plantInformationFuelType;

    @ApiModelProperty(value = "电厂信息-项目类型（1：在建，2：拟建，3：已建）")
    @TableField("PLANT_INFORMATION_PROJECT_CATEGORY")
    private Integer plantInformationProjectCategory;

    @ApiModelProperty(value = "电厂信息-是否为外送机组（0：不是，1：是）")
    @TableField("PLANT_INFORMATION_OUT")
    private Integer plantInformationOut;

    @ApiModelProperty(value = "电厂信息-是否为外送机组（0：不是，1：是）")
    @TableField("PLANT_INFORMATION_EMERGENCY")
    private Integer plantInformationEmergency;

    @ApiModelProperty(value = "电厂信息-统计员姓名")
    @TableField("PLANT_INFORMATION_STATISTICIAN_NAME")
    private String plantInformationStatisticianName;

    @ApiModelProperty(value = "电厂信息-统计员联系方式")
    @TableField("PLANT_INFORMATION_STATISTICIAN_PHONE")
    private String plantInformationStatisticianPhone;

    @ApiModelProperty(value = "电厂信息-电厂负责人姓名")
    @TableField("PLANT_INFORMATION_CHARGE_NAME")
    private String plantInformationChargeName;

    @ApiModelProperty(value = "电厂信息-电厂负责人联系方式")
    @TableField("PLANT_INFORMATION_CHARGE_PHONE")
    private String plantInformationChargePhone;

    @ApiModelProperty(value = "电厂信息-项目类别（1：示范项目，2：扶贫项目，3：无）")
    @TableField("PLANT_INFORMATION_PROJECT_TYPE")
    private String plantInformationProjectType;

    @ApiModelProperty(value = "电厂所属企业信息-所属能源集团")
    @TableField("ENTERPRISE_INFORMATION_ENGRGY_GROUP")
    private String enterpriseInformationEngrgyGroup;

    @ApiModelProperty(value = "电厂所属企业信息-主要控股方")
    @TableField("ENTERPRISE_INFORMATION_MAIN_CONTROL_PARTY")
    private String enterpriseInformationMainControlParty;

    @ApiModelProperty(value = "电厂所属企业信息-企业性质（1：央企，2：区内国企，3：区内民营企业，4：省外国企，5：省外民营企业）")
    @TableField("ENTERPRISE_INFORMATION_NATURE")
    private Integer enterpriseInformationNature;

    @ApiModelProperty(value = "电厂所属企业信息-组织机构代码")
    @TableField("ENTERPRISE_INFORMATION_CODE")
    private String enterpriseInformationCode;

    @ApiModelProperty(value = "电厂所属企业信息-纳入国家规划文件名称及文号")
    @TableField("ENTERPRISE_INFORMATION_PLANNING")
    private String enterpriseInformationPlanning;

    @ApiModelProperty(value = "电厂所属企业信息-下属电厂数量")
    @TableField("ENTERPRISE_INFORMATION_NUM")
    private Integer enterpriseInformationNum;

    @ApiModelProperty(value = "主要设备技术改造情况-是否超低排放机组（0：不是，1：是）")
    @TableField("TECHNICAL_MAIN_LOW_EMISSION")
    private Integer technicalMainLowEmission;

    @ApiModelProperty(value = "主要设备技术改造情况-超低排放改造完成时间")
    @TableField("TECHNICAL_MAIN_LOW_EMISSION_TIME")
    private String technicalMainLowEmissionTime;

    @ApiModelProperty(value = "主要设备技术改造情况-是否完成灵活性改造（0：不是，1：是）")
    @TableField("TECHNICAL_MAIN_LOW_FLEXIBILITY")
    private Integer technicalMainLowFlexibility;

    @ApiModelProperty(value = "主要设备技术改造情况-灵活性改造后调峰能力")
    @TableField("TECHNICAL_MAIN_LOW_FLEXIBILITY_ABILITY")
    private String technicalMainLowFlexibilityAbility;

    @ApiModelProperty(value = "工程项目技术特征-锅炉-型式（见字典表）")
    @TableField("ENGINEERING_CHARACTER_BOILER_TYPE")
    private Integer engineeringCharacterBoilerType;

    @ApiModelProperty(value = "工程项目技术特征-锅炉-额定蒸发量")
    @TableField("ENGINEERING_CHARACTER_BOILER_BECR")
    private BigDecimal engineeringCharacterBoilerBecr;

    @ApiModelProperty(value = "工程项目技术特征-锅炉-效率（低位发热量）")
    @TableField("ENGINEERING_CHARACTER_BOILER_EFF")
    private BigDecimal engineeringCharacterBoilerEff;

    @ApiModelProperty(value = "工程项目技术特征-锅炉-主蒸汽温度/压力")
    @TableField("ENGINEERING_CHARACTER_BOILER_MAIN_STEAM")
    private BigDecimal engineeringCharacterBoilerMainSteam;

    @ApiModelProperty(value = "工程项目技术特征-锅炉-再热蒸汽温度/压力")
    @TableField("ENGINEERING_CHARACTER_BOILER_RE_STEAM")
    private BigDecimal engineeringCharacterBoilerReSteam;

    @ApiModelProperty(value = "工程项目技术特征-技术指标设计值-热电厂热效率")
    @TableField("ENGINEERING_CHARACTER_DESIGN_HOT_EFF")
    private BigDecimal engineeringCharacterDesignHotEff;

    @ApiModelProperty(value = "工程项目技术特征-技术指标设计值-厂用电率")
    @TableField("ENGINEERING_CHARACTER_DESIGN_ELE_EFF")
    private BigDecimal engineeringCharacterDesignEleEff;

    @ApiModelProperty(value = "工程项目技术特征-技术指标设计值-供电标准煤耗")
    @TableField("ENGINEERING_CHARACTER_DESIGN_SUPPLY_COAL")
    private BigDecimal engineeringCharacterDesignSupplyCoal;

    @ApiModelProperty(value = "工程项目技术特征-技术指标设计值-耗水指标")
    @TableField("ENGINEERING_CHARACTER_DESIGN_WATER")
    private BigDecimal engineeringCharacterDesignWater;

    @ApiModelProperty(value = "工程项目技术特征-技术指标设计值-厂区用地指标")
    @TableField("ENGINEERING_CHARACTER_DESIGN_LAND")
    private BigDecimal engineeringCharacterDesignLand;

    @ApiModelProperty(value = "工程项目技术特征-汽轮机-型式（见字典表）")
    @TableField("ENGINEERING_STEAM_TURBINE_TYPE")
    private Integer engineeringSteamTurbineType;

    @ApiModelProperty(value = "工程项目技术特征-汽轮机-额定容量")
    @TableField("ENGINEERING_STEAM_TURBINE_CAPACITY")
    private BigDecimal engineeringSteamTurbineCapacity;

    @ApiModelProperty(value = "工程项目技术特征-汽轮机-机组热耗")
    @TableField("ENGINEERING_STEAM_TURBINE_HOT_CONSUME")
    private BigDecimal engineeringSteamTurbineHotConsume;

    @ApiModelProperty(value = "工程项目技术特征-蒸汽轮发电机-型式（见字典表）")
    @TableField("ENGINEERING_STEAM_TURBINE_GENERATOR_TYPE")
    private BigDecimal engineeringSteamTurbineGeneratorType;

    @ApiModelProperty(value = "工程项目技术特征-蒸汽轮发电机-额定容量")
    @TableField("ENGINEERING_STEAM_TURBINE_GENERATOR_CAPACITY")
    private BigDecimal engineeringSteamTurbineGeneratorCapacity;

    @ApiModelProperty(value = "工程项目技术特征-蒸汽轮发电机-最大连续功率）")
    @TableField("ENGINEERING_STEAM_TURBINE_GENERATOR_MAX_EFF")
    private BigDecimal engineeringSteamTurbineGeneratorMaxEff;

    @ApiModelProperty(value = "工程项目技术特征-蒸汽轮发电机-效率")
    @TableField("ENGINEERING_STEAM_TURBINE_GENERATOR_EFF")
    private BigDecimal engineeringSteamTurbineGeneratorEff;

    @ApiModelProperty(value = "工程项目技术特征-燃气轮机-型式")
    @TableField("ENGINEERING_GAS_TURBINE_TYPE")
    private String engineeringGasTurbineType;

    @ApiModelProperty(value = "工程项目技术特征-燃气轮机-效率")
    @TableField("ENGINEERING_GAS_TURBINE_EFF")
    private BigDecimal engineeringGasTurbineEff;

    @ApiModelProperty(value = "工程项目技术特征-燃气轮发电机-型式（见字典表）")
    @TableField("ENGINEERING_GAS_TURBINE_GENERATOR_TYPE")
    private Integer engineeringGasTurbineGeneratorType;

    @ApiModelProperty(value = "工程项目技术特征-燃气轮发电机-额定容量")
    @TableField("ENGINEERING_GAS_TURBINE_GENERATOR_CAPACITY")
    private BigDecimal engineeringGasTurbineGeneratorCapacity;

    @ApiModelProperty(value = "工程项目技术特征-燃气轮发电机-最大连续功率）")
    @TableField("ENGINEERING_GAS_TURBINE_GENERATOR_MAX_EFF")
    private BigDecimal engineeringGasTurbineGeneratorMaxEff;

    @ApiModelProperty(value = "工程项目技术特征-燃气轮发电机-效率")
    @TableField("ENGINEERING_GAS_TURBINE_GENERATOR_EFF")
    private BigDecimal engineeringGasTurbineGeneratorEff;

    @ApiModelProperty(value = "项目建设过程-自治区煤电建设规划（2014年以后）-规划名称")
    @TableField("ENGINEERING_PROJECT_PROCESS_COAL_PLAN_NAME")
    private String engineeringProjectProcessCoalPlanName;

    @ApiModelProperty(value = "项目建设过程-自治区煤电建设规划（2014年以后）-规划年度")
    @TableField("ENGINEERING_PROJECT_PROCESS_COAL_PLAN_YEAR")
    private Integer engineeringProjectProcessCoalPlanYear;

    @ApiModelProperty(value = "项目建设过程-自治区煤电建设规划（2014年以后）-规划文件文号及日期")
    @TableField("ENGINEERING_PROJECT_PROCESS_COAL_PLAN_CODE")
    private String engineeringProjectProcessCoalPlanCode;

    @ApiModelProperty(value = "项目建设过程-项目核准（备案）情况-项目核准（备案）名称")
    @TableField("ENGINEERING_PROJECT_PROCESS_APPROVAL_NAME")
    private String engineeringProjectProcessApprovalName;

    @ApiModelProperty(value = "项目建设过程-项目核准（备案）情况-项目核准（备案）文号")
    @TableField("ENGINEERING_PROJECT_PROCESS_APPROVAL_DOC_CODE")
    private String engineeringProjectProcessApprovalDocCode;

    @ApiModelProperty(value = "项目建设过程-项目核准（备案）情况-核准（备案）时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_APPROVAL_TIME")
    private String engineeringProjectProcessApprovalTime;

    @ApiModelProperty(value = "项目建设过程-项目核准（备案）情况-项目代码")
    @TableField("ENGINEERING_PROJECT_PROCESS_APPROVAL_CODE")
    private String engineeringProjectProcessApprovalCode;

    @ApiModelProperty(value = "项目建设过程-项目核准（备案）情况-项目业主单位（股权构成）")
    @TableField("ENGINEERING_PROJECT_PROCESS_APPROVAL_MAIN_OWNER")
    private String engineeringProjectProcessApprovalMainOwner;

    @ApiModelProperty(value = "项目建设过程-项目核准（备案）情况-建设地点")
    @TableField("ENGINEERING_PROJECT_PROCESS_APPROVAL_LAND")
    private String engineeringProjectProcessApprovalLand;

    @ApiModelProperty(value = "项目建设过程-项目核准（备案）情况-建设规模")
    @TableField("ENGINEERING_PROJECT_PROCESS_APPROVAL_SCALE")
    private String engineeringProjectProcessApprovalScale;

    @ApiModelProperty(value = "项目建设过程-项目核准（备案）情况-总投资")
    @TableField("ENGINEERING_PROJECT_PROCESS_APPROVAL_MONEY")
    private BigDecimal engineeringProjectProcessApprovalMoney;

    @ApiModelProperty(value = "项目建设过程-开工建设支持性文件-规划许可")
    @TableField("ENGINEERING_PROJECT_PROCESS_START_ALLOW")
    private String engineeringProjectProcessStartAllow;

    @ApiModelProperty(value = "项目建设过程-开工建设支持性文件-用地预审（2020年以后多规合一）")
    @TableField("ENGINEERING_PROJECT_PROCESS_START_LAND")
    private String engineeringProjectProcessStartLand;

    @ApiModelProperty(value = "项目建设过程-开工建设支持性文件-水土保持批复")
    @TableField("ENGINEERING_PROJECT_PROCESS_START_SOIL")
    private String engineeringProjectProcessStartSoil;

    @ApiModelProperty(value = "项目建设过程-开工建设支持性文件-取水许可")
    @TableField("ENGINEERING_PROJECT_PROCESS_START_WATER")
    private String engineeringProjectProcessStartWater;

    @ApiModelProperty(value = "项目建设过程-开工建设支持性文件-节能批复")
    @TableField("ENGINEERING_PROJECT_PROCESS_START_ENERGY")
    private String engineeringProjectProcessStartEnergy;

    @ApiModelProperty(value = "项目建设过程-开工建设支持性文件-形象开工时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_START_IMAGE")
    private String engineeringProjectProcessStartImage;

    @ApiModelProperty(value = "项目建设过程-开工建设支持性文件-主厂房第一方混凝土浇筑时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_START_BETON")
    private String engineeringProjectProcessStartBeton;

    @ApiModelProperty(value = "项目建设过程-电厂线路工程-核准（备案）文号")
    @TableField("ENGINEERING_PROJECT_PROCESS_CODE")
    private String engineeringProjectProcessCode;

    @ApiModelProperty(value = "项目建设过程-电厂线路工程-文件名称")
    @TableField("ENGINEERING_PROJECT_PROCESS_LINE_NAME")
    private String engineeringProjectProcessLineName;

    @ApiModelProperty(value = "项目建设过程-电厂线路工程-批复建设规模")
    @TableField("ENGINEERING_PROJECT_PROCESS_LINE_SCALE")
    private String engineeringProjectProcessLineScale;

    @ApiModelProperty(value = "项目建设过程-电厂线路工程-总投资")
    @TableField("ENGINEERING_PROJECT_PROCESS_LINE_MONEY")
    private String engineeringProjectProcessLineMoney;

    @ApiModelProperty(value = "项目建设过程-电厂线路工程-业主单位（股权构成）")
    @TableField("ENGINEERING_PROJECT_PROCESS_LINE_OWNER")
    private String engineeringProjectProcessLineOwner;

    @ApiModelProperty(value = "项目建设过程-电厂线路工程-开工时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_LINE_START")
    private Date engineeringProjectProcessLineStart;

    @ApiModelProperty(value = "项目建设过程-电厂线路工程-开工支持性文件批复情况")
    @TableField("ENGINEERING_PROJECT_PROCESS_LINE_REPLY")
    private String engineeringProjectProcessLineReply;

    @ApiModelProperty(value = "项目建设过程-电厂线路工程-建成时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_LINE_END")
    private Date engineeringProjectProcessLineEnd;

    @ApiModelProperty(value = "项目建设过程-煤源设计-煤源")
    @TableField("ENGINEERING_PROJECT_PROCESS_COAL_SOURCE")
    private String engineeringProjectProcessCoalSource;

    @ApiModelProperty(value = "项目建设过程-煤源设计-设计运输方式")
    @TableField("ENGINEERING_PROJECT_PROCESS_COAL_TRANS")
    private String engineeringProjectProcessCoalTrans;

    @ApiModelProperty(value = "项目建设过程-煤源设计-设计煤种")
    @TableField("ENGINEERING_PROJECT_PROCESS_COAL_TYPE")
    private String engineeringProjectProcessCoalType;

    @ApiModelProperty(value = "项目建设过程-煤源设计-设计年耗煤量")
    @TableField("ENGINEERING_PROJECT_PROCESS_COAL_CONSUME")
    private BigDecimal engineeringProjectProcessCoalConsume;

    @ApiModelProperty(value = "项目建设过程-粉煤灰处置方式-灰场所在地")
    @TableField("ENGINEERING_PROJECT_PROCESS_COOM_ADDRESS")
    private String engineeringProjectProcessCoomAddress;

    @ApiModelProperty(value = "项目建设过程-粉煤灰处置方式-设计年产灰量")
    @TableField("ENGINEERING_PROJECT_PROCESS_COOM_OUTPUT")
    private BigDecimal engineeringProjectProcessCoomOutput;

    @ApiModelProperty(value = "项目建设过程-粉煤灰处置方式-煤粉灰利用处置方案")
    @TableField("ENGINEERING_PROJECT_PROCESS_COOM_HANDLE")
    private String engineeringProjectProcessCoomHandle;

    @ApiModelProperty(value = "项目建设过程-主要设备技术改造-机组容量")
    @TableField("ENGINEERING_PROJECT_PROCESS_EQUIPMENT_CAPACITY")
    private BigDecimal engineeringProjectProcessEquipmentCapacity;

    @ApiModelProperty(value = "项目建设过程-主要设备技术改造-能耗")
    @TableField("ENGINEERING_PROJECT_PROCESS_EQUIPMENT_CONSUMPTION")
    private BigDecimal engineeringProjectProcessEquipmentConsumption;

    @ApiModelProperty(value = "项目建设过程-主要设备技术改造-机组改造情况")
    @TableField("ENGINEERING_PROJECT_PROCESS_EQUIPMENT_TRANSFORM")
    private String engineeringProjectProcessEquipmentTransform;

    @ApiModelProperty(value = "项目建设过程-运行方式-是否并网（0：不是，1：是）")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_GRID")
    private Integer engineeringProjectProcessRunGrid;

    @ApiModelProperty(value = "项目建设过程-运行方式-并网时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_TIME")
    private Date engineeringProjectProcessRunTime;

    @ApiModelProperty(value = "项目建设过程-运行方式-公用/自备（1：公用，2：自备）")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_NATURE")
    private Integer engineeringProjectProcessRunNature;

    @ApiModelProperty(value = "项目建设过程-运行方式-自备电厂-配套用电项目情况")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_ITEM")
    private String engineeringProjectProcessRunItem;

    @ApiModelProperty(value = "项目建设过程-运行方式-是否供热（0：不是，1：是）")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_HOT")
    private Integer engineeringProjectProcessRunHot;

    @ApiModelProperty(value = "项目建设过程-运行方式-供热容量")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_CAPACITY")
    private BigDecimal engineeringProjectProcessRunCapacity;

    @ApiModelProperty(value = "项目建设过程-运行方式-接入系统批复")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_SYSTEM")
    private String engineeringProjectProcessRunSystem;

    @ApiModelProperty(value = "项目建设过程-运行方式-发电业务许可证")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_BUSINESS")
    private String engineeringProjectProcessRunBusiness;

    @ApiModelProperty(value = "项目建设过程-运行方式-取得时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_GAIN")
    private Date engineeringProjectProcessRunGain;

    @ApiModelProperty(value = "项目建设过程-运行方式-许可证编号")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_CODE")
    private String engineeringProjectProcessRunCode;

    @ApiModelProperty(value = "项目建设过程-运行方式-效期时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_PERIOD")
    private Date engineeringProjectProcessRunPeriod;

    @ApiModelProperty(value = "项目建设过程-运行方式-登记名称")
    @TableField("ENGINEERING_PROJECT_PROCESS_RUN_NAME")
    private String engineeringProjectProcessRunName;

    @ApiModelProperty(value = "项目建设过程-淘汰关停-淘汰时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_WEED_TIME")
    private Date engineeringProjectProcessWeedTime;

    @ApiModelProperty(value = "项目建设过程-淘汰关停-拆除时间")
    @TableField("ENGINEERING_PROJECT_PROCESS_WEED_DISMANTLE")
    private Date engineeringProjectProcessWeedDismantle;

    @ApiModelProperty(value = "项目建设过程-淘汰关停-拆除内容")
    @TableField("ENGINEERING_PROJECT_PROCESS_WEED_CONTENT")
    private String engineeringProjectProcessWeedContent;

    @ApiModelProperty(value = "项目建设过程-淘汰关停-关停验收情况")
    @TableField("ENGINEERING_PROJECT_PROCESS_WEED_CHECK")
    private String engineeringProjectProcessWeedCheck;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATE_TIME")
    private Date updateTime;

    @ApiModelProperty(value = "总装机容量")
    @TableField("CAPACITY_SUM")
    private BigDecimal capacitySum;


}
