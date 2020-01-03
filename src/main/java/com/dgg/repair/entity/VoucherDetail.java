package com.dgg.repair.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.dgg.accountingtools.common.util.StringUtils;
import net.dgg.accountingtools.models.settings.entity.Currency;
import net.dgg.accountingtools.models.voucher.dto.AuxiliaryDto;
import net.dgg.framework.tac.elasticsearch.annotation.DggEsIdentify;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 孙上峰
 * @ClassName <VoucherDetail>
 * @despriction 凭证明细科目表
 * @create 2019/02/25 14:50
 **/
@ApiModel("凭证明细科目")
@Document(collection = "voucher_detail")
public class VoucherDetail {

    @DggEsIdentify
    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("公司id")
    private String companyId;

    /**
     * 凭证id
     */
    @ApiModelProperty("凭证id")
    private String voucherId;

    /**
     * 凭证字
     */
    @ApiModelProperty("凭证字")
    private String word;

    /**
     * 凭证字号
     */
    @ApiModelProperty("凭证字号")
    private Integer wordSort;

    /**
     * 凭证时间
     */
    @ApiModelProperty("凭证时间")
    private String voucherDate;


    /**
     * 凭证时间（时间戳）
     */
    @ApiModelProperty("凭证时间")
    private Date voucherTime;

    /**
     * 摘要摘要id
     */
    @ApiModelProperty("摘要id")
    private String summaryId;

    /**
     * 摘要
     */
    @ApiModelProperty("摘要")
    private String summary;

    /**
     * 科目id
     */
    @ApiModelProperty("科目id")
    private String subjectId;

    @ApiModelProperty("科目code+凭证+辅助核算名称")
    private String subject;

    @ApiModelProperty("科目名称")
    private String subjectName;

    @ApiModelProperty("科目名称+辅助核算名称")
    private String subjectAuxName;

    @ApiModelProperty("科目Code+辅助核算Code")
    private String subjectAuxCode;

    @ApiModelProperty("科目code")
    private String subjectCode;

    /**
     * 借方金额
     */
    @ApiModelProperty("借方金额")
    private BigDecimal debitAmount = BigDecimal.ZERO;

    /**
     * 贷方金额
     */
    @ApiModelProperty("贷方金额")
    private BigDecimal creditAmount = BigDecimal.ZERO;

    /**
     * 借方原位币
     */
    @ApiModelProperty("借方原位币")
    private BigDecimal debitInSituCurrency = BigDecimal.ZERO;

    /**
     * 贷方原位币
     */
    @ApiModelProperty("贷方原位币")
    private BigDecimal creditInSituCurrency = BigDecimal.ZERO;

    /**
     * 数量
     */
    @ApiModelProperty("数量")
    private BigDecimal number = BigDecimal.ZERO;

    /**
     * 数量单位
     */
    @ApiModelProperty("数量单位")
    private String numberUnits;

    /**
     * 科目余额方向
     */
    @ApiModelProperty("科目类型")
    private String subjectType;

    @ApiModelProperty("科目类别")
    private String subjectCategory;

    @ApiModelProperty("科目级数")
    private int subjectSeries;

    /**
     * 单价
     */
    @ApiModelProperty("单价")
    private BigDecimal price = BigDecimal.ZERO;

    /**
     * 币别id
     */
    @ApiModelProperty("币别id")
    private String currencyId;

    /**
     * 币别Code
     */
    @ApiModelProperty("币别Code")
    private String currencyCode;

    /**
     * 币别名称
     */
    @ApiModelProperty("币别名称")
    private String currencyName;

    @ApiModelProperty("币别原币")
    private BigDecimal currencyOriginal;

    /**
     * 汇率
     */
    @ApiModelProperty("汇率")
    private BigDecimal exchangeRate = BigDecimal.ZERO;

    /**
     * 账期年月(201802)
     */
    @ApiModelProperty("账期年月")
    private Integer period;

    /**
     * 凭证类型
     * 普通凭证: VOUCHER_TYPE_1
     * 结转销售成本：JZ_JZXSCB
     * 计提工资：CALCULATION_WAGES
     * 摊销待摊费用：JZ_TXDTFY
     * 结转未交增值税：JZ_JZWJZZS
     * 计提税金：JZ_JTSJ
     * 计提所得税：JZ_JTSDS
     * 结转损益收入：JZ_JZSYSR
     * 结转损益成本：JZ_JZSYCB
     */
    @ApiModelProperty("凭证类型")
    private String type;

    /**
     * 辅助核算列表
     */
    @ApiModelProperty(name = "辅助核算列表")
    private List<AuxiliaryDto> assistingAccountingList;

    /**
     * 是否数量核算（1是 0否）
     */
    @ApiModelProperty("是否数量核算")
    private Integer whetherCount;

    /**
     * （1是 0否）
     */
    @ApiModelProperty("是否辅助核算")
    private Integer whetherAuxiliary;

    /**
     * （1是 0否）
     */
    @ApiModelProperty("是否币别")
    private Integer whetherCurrency;

    @ApiModelProperty("科目对应辅助核算关系id")
    private String subjectAuxCombId;

    /**
     * 单据数量
     */
    @ApiModelProperty(name = "单据数量")
    private Integer receiptNum;

    /**
     * 0、未审核 1、已审核
     */
    @ApiModelProperty(name = "状态")
    @JsonIgnore
    private String status;

    /**
     * 制单人
     */
    @ApiModelProperty(name = "制单人")
    private String singlePerson;

    /**
     * 审核人
     */
    @ApiModelProperty(name = "审核人")
    @JsonIgnore
    private String examinePerson;

    @ApiModelProperty("创建顺序")
    private Integer createrSort;

    @ApiModelProperty("创建人ID")
    @JsonIgnore
    private String createrId;

    @ApiModelProperty("创建人")
    @JsonIgnore
    private String createrName;

    @ApiModelProperty("创建时间")
    @JsonIgnore
    private String createTime;

    @ApiModelProperty("创建时间")
    private Date createDate;

    @ApiModelProperty("更新人ID")
    @JsonIgnore
    private Long updaterId;

    @ApiModelProperty("更新人")
    @JsonIgnore
    private String updaterName;

    @ApiModelProperty("更新时间")
    @JsonIgnore
    private String updateTime;

    /**
     * 辅助核算类别Ids(多个Id以 _ 分隔)
     */
    @ApiModelProperty("辅助核算类别Ids(多个Id以 _ 分隔)")
    @JsonIgnore
    private String auxTypeIds;

    @ApiModelProperty("辅助核算code+name")
    private String auxiliary;

    /**
     * 辅助核算明细Ids(多个Id以 _ 分隔)
     */
    @ApiModelProperty("辅助核算明细Ids(多个Id以 _ 分隔)")
    @JsonIgnore
    private String auxDetailTypeIds;

    @ApiModelProperty(name = "币别")
    private List<Currency> currencyList;

    /**
     * 调汇账期年月(201802)
     */
    @ApiModelProperty("调汇账期年月")
    private Integer remittancePeriod;

    /**
     * 已调汇的汇率，多个值用_隔开
     */
    @ApiModelProperty("已调汇汇率")
    private String exchangeRateAdjusted;


    /**
     * 期末调汇是否已扎帐（1是 0否）
     */
    @ApiModelProperty("期末调汇是否已扎帐（1是 0否）")
    private Integer whetherSettleAccounts = 0;

    /**
     * 扎帐账期年月(201802)
     */
    @ApiModelProperty("扎帐账期年月")
    private Integer settleAccountsPeriod;

    /**
     * 是否期末调汇（1是 0否）
     */
    @ApiModelProperty("是否期末调汇")
    private Integer whetherFinalAdjustment;

    @ApiModelProperty("是否本位币")
    private int whetherStandardCurrency;

    /**
     * 存货的规格
     */
    @ApiModelProperty("规格")
    private String specification;

    /**
     * 备用字段1
     */
    @ApiModelProperty(name = "备用字段1")
    @JsonIgnore
    private String ext1;

    /**
     * 备用字段2
     */
    @ApiModelProperty(name = "备用字段2")
    @JsonIgnore
    private String ext2;

    /**
     * 备用字段3
     */
    @ApiModelProperty(name = "备用字段3")
    @JsonIgnore
    private String ext3;

    /**
     * 备用字段4
     */
    @ApiModelProperty(name = "备用字段4")
    @JsonIgnore
    private String ext4;

    /**
     * 备用字段5
     */
    @ApiModelProperty(name = "备用字段5")
    @JsonIgnore
    private String ext5;

    @ApiModelProperty("是否限定科目,0为false,1为true")
    private Integer whetherLimitSubject;

    @ApiModelProperty("是否限定,0为false,1为true")
    private Integer whetherLimit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getWordSort() {
        return wordSort;
    }

    public void setWordSort(Integer wordSort) {
        this.wordSort = wordSort;
    }

    public String getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(String voucherDate) {
        this.voucherDate = voucherDate;
    }

    public String getSummaryId() {
        return summaryId;
    }

    public void setSummaryId(String summaryId) {
        this.summaryId = summaryId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectAuxName() {
        return subjectAuxName;
    }

    public void setSubjectAuxName(String subjectAuxName) {
        this.subjectAuxName = subjectAuxName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public BigDecimal getDebitInSituCurrency() {
        return debitInSituCurrency;
    }

    public void setDebitInSituCurrency(BigDecimal debitInSituCurrency) {
        this.debitInSituCurrency = debitInSituCurrency;
    }

    public BigDecimal getCreditInSituCurrency() {
        return creditInSituCurrency;
    }

    public void setCreditInSituCurrency(BigDecimal creditInSituCurrency) {
        this.creditInSituCurrency = creditInSituCurrency;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public String getNumberUnits() {
        return numberUnits;
    }

    public void setNumberUnits(String numberUnits) {
        this.numberUnits = numberUnits;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public int getSubjectSeries() {
        return subjectSeries;
    }

    public void setSubjectSeries(int subjectSeries) {
        this.subjectSeries = subjectSeries;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<AuxiliaryDto> getAuxiliaryList() {
        return assistingAccountingList;
    }

    public void setAssistingAccountingList(List<AuxiliaryDto> assistingAccountingList) {
        this.assistingAccountingList = assistingAccountingList;
    }

    public Integer getWhetherCount() {
        return whetherCount;
    }

    public void setWhetherCount(Integer whetherCount) {
        this.whetherCount = whetherCount;
    }

    public Integer getWhetherAuxiliary() {
        return whetherAuxiliary;
    }

    public void setWhetherAuxiliary(Integer whetherAuxiliary) {
        this.whetherAuxiliary = whetherAuxiliary;
    }

    public Integer getWhetherCurrency() {
        return whetherCurrency;
    }

    public void setWhetherCurrency(Integer whetherCurrency) {
        this.whetherCurrency = whetherCurrency;
    }

    public String getSubjectAuxCombId() {
        return subjectAuxCombId;
    }

    public void setSubjectAuxCombId(String subjectAuxCombId) {
        this.subjectAuxCombId = subjectAuxCombId;
    }

    public String getCreaterId() {
        return createrId;
    }

    public void setCreaterId(String createrId) {
        this.createrId = createrId;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Long updaterId) {
        this.updaterId = updaterId;
    }

    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    public String getSubjectAuxCode() {
        return subjectAuxCode;
    }

    public void setSubjectAuxCode(String subjectAuxCode) {
        this.subjectAuxCode = subjectAuxCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSinglePerson() {
        return singlePerson;
    }

    public void setSinglePerson(String singlePerson) {
        this.singlePerson = singlePerson;
    }

    public String getExaminePerson() {
        return examinePerson;
    }

    public void setExaminePerson(String examinePerson) {
        this.examinePerson = examinePerson;
    }

    public String getAuxTypeIds() {
        return auxTypeIds;
    }

    public void setAuxTypeIds(String auxTypeIds) {
        this.auxTypeIds = auxTypeIds;
    }

    public String getAuxDetailTypeIds() {
        return auxDetailTypeIds;
    }

    public void setAuxDetailTypeIds(String auxDetailTypeIds) {
        this.auxDetailTypeIds = auxDetailTypeIds;
    }

    public Integer getCreaterSort() {
        return createrSort;
    }

    public void setCreaterSort(Integer createrSort) {
        this.createrSort = createrSort;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    public Date getVoucherTime() {
        return voucherTime;
    }

    public void setVoucherTime(Date voucherTime) {
        this.voucherTime = voucherTime;
    }

    public String getSubjectCategory() {
        return subjectCategory;
    }

    public void setSubjectCategory(String subjectCategory) {
        this.subjectCategory = subjectCategory;
    }

    public Integer getReceiptNum() {
        return receiptNum;
    }

    public void setReceiptNum(Integer receiptNum) {
        this.receiptNum = receiptNum;
    }

    public int getWhetherStandardCurrency() {
        return whetherStandardCurrency;
    }

    public void setWhetherStandardCurrency(int whetherStandardCurrency) {
        this.whetherStandardCurrency = whetherStandardCurrency;
    }

    public List<AuxiliaryDto> getAssistingAccountingList() {
        return assistingAccountingList;
    }

    public String getExchangeRateAdjusted() {
        if (null != exchangeRate && (StringUtils.isEmpty(exchangeRateAdjusted) || "0".equals(exchangeRateAdjusted))) {
            return exchangeRate.toString();
        }
        return exchangeRateAdjusted;
    }

    public void setExchangeRateAdjusted(String exchangeRateAdjusted) {
        this.exchangeRateAdjusted = exchangeRateAdjusted;
    }

    public Integer getWhetherSettleAccounts() {
        return whetherSettleAccounts;
    }

    public void setWhetherSettleAccounts(Integer whetherSettleAccounts) {
        this.whetherSettleAccounts = whetherSettleAccounts;
    }

    public Integer getRemittancePeriod() {
        return remittancePeriod;
    }

    public void setRemittancePeriod(Integer remittancePeriod) {
        this.remittancePeriod = remittancePeriod;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getCurrencyOriginal() {
        return currencyOriginal;
    }

    public void setCurrencyOriginal(BigDecimal currencyOriginal) {
        this.currencyOriginal = currencyOriginal;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getWhetherLimitSubject() {
        return null == whetherLimitSubject ? 0 : whetherLimitSubject;
    }

    public void setWhetherLimitSubject(Integer whetherLimitSubject) {
        this.whetherLimitSubject = whetherLimitSubject;
    }

    public Integer getWhetherLimit() {
        return null == whetherLimit ? 0 : whetherLimit;
    }

    public void setWhetherLimit(Integer whetherLimit) {
        this.whetherLimit = whetherLimit;
    }

    public Integer getSettleAccountsPeriod() {

        return settleAccountsPeriod;
    }

    public void setSettleAccountsPeriod(Integer settleAccountsPeriod) {
        this.settleAccountsPeriod = settleAccountsPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VoucherDetail that = (VoucherDetail) o;

        return this.subjectId != null ? this.subjectId.equals(that.subjectId) : that.subjectId == null;

    }

    @Override
    public int hashCode() {
        return this.subjectId != null ? this.subjectId.hashCode() : 0;
    }

    public String getAuxiliary() {
        return auxiliary;
    }

    public void setAuxiliary(String auxiliary) {
        this.auxiliary = auxiliary;
    }

    public Integer getWhetherFinalAdjustment() {
        return whetherFinalAdjustment;
    }

    public void setWhetherFinalAdjustment(Integer whetherFinalAdjustment) {
        this.whetherFinalAdjustment = whetherFinalAdjustment;
    }


    @Override
    public String toString() {
        return "VoucherDetail{" +
                "id='" + id + '\'' +
                ", companyId='" + companyId + '\'' +
                ", voucherId='" + voucherId + '\'' +
                ", word='" + word + '\'' +
                ", wordSort=" + wordSort +
                ", voucherDate='" + voucherDate + '\'' +
                ", voucherTime=" + voucherTime +
                ", summaryId='" + summaryId + '\'' +
                ", summary='" + summary + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", subject='" + subject + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectAuxName='" + subjectAuxName + '\'' +
                ", subjectAuxCode='" + subjectAuxCode + '\'' +
                ", subjectCode='" + subjectCode + '\'' +
                ", debitAmount=" + debitAmount +
                ", creditAmount=" + creditAmount +
                ", debitInSituCurrency=" + debitInSituCurrency +
                ", creditInSituCurrency=" + creditInSituCurrency +
                ", number=" + number +
                ", numberUnits='" + numberUnits + '\'' +
                ", subjectType='" + subjectType + '\'' +
                ", subjectCategory='" + subjectCategory + '\'' +
                ", subjectSeries=" + subjectSeries +
                ", price=" + price +
                ", currencyId='" + currencyId + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", currencyOriginal=" + currencyOriginal +
                ", exchangeRate=" + exchangeRate +
                ", period=" + period +
                ", type='" + type + '\'' +
                ", assistingAccountingList=" + assistingAccountingList +
                ", whetherCount=" + whetherCount +
                ", whetherAuxiliary=" + whetherAuxiliary +
                ", whetherCurrency=" + whetherCurrency +
                ", subjectAuxCombId='" + subjectAuxCombId + '\'' +
                ", receiptNum=" + receiptNum +
                ", status='" + status + '\'' +
                ", singlePerson='" + singlePerson + '\'' +
                ", examinePerson='" + examinePerson + '\'' +
                ", createrSort=" + createrSort +
                ", createrId='" + createrId + '\'' +
                ", createrName='" + createrName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createDate=" + createDate +
                ", updaterId=" + updaterId +
                ", updaterName='" + updaterName + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", auxTypeIds='" + auxTypeIds + '\'' +
                ", auxiliary='" + auxiliary + '\'' +
                ", auxDetailTypeIds='" + auxDetailTypeIds + '\'' +
                ", currencyList=" + currencyList +
                ", remittancePeriod=" + remittancePeriod +
                ", exchangeRateAdjusted='" + exchangeRateAdjusted + '\'' +
                ", whetherSettleAccounts=" + whetherSettleAccounts +
                ", whetherFinalAdjustment=" + whetherFinalAdjustment +
                ", whetherStandardCurrency=" + whetherStandardCurrency +
                ", whetherLimitSubject=" + whetherLimitSubject +
                ", whetherLimit=" + whetherLimit +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                ", ext4='" + ext4 + '\'' +
                ", ext5='" + ext5 + '\'' +
                '}';
    }
}
