package com.dgg.repair.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.dgg.accountingtools.models.settings.contant.SubjectBalanceDirection;
import net.dgg.framework.tac.elasticsearch.annotation.DggEsIdentify;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @author 孙上峰
 * @ClassName <VoucherAux>
 * @despriction 凭证明细辅助核算表
 * @create 2019/02/26 11:08
 **/
@ApiModel("凭证明细辅助核算")
@Document(collection = "voucher_aux")
public class VoucherAux {

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

    /**
     * 科目名称
     */
    @ApiModelProperty("科目名称")
    private String subjectName;

    @ApiModelProperty("科目名称+辅助核算名称")
    private String subjectAuxName;

    @ApiModelProperty("科目code")
    private String subjectCode;

    @ApiModelProperty("科目类别")
    private String subjectCategory;

    /**
     * 科目类型(借、贷)
     */
    @ApiModelProperty("科目类型")
    private String subjectType;

    @ApiModelProperty("科目级数")
    private Integer subjectSeries;

    /**
     * 借贷方向
     */
    @ApiModelProperty("借贷方向")
    private SubjectBalanceDirection balanceDirection;

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

    @ApiModelProperty("辅助核算id")
    private String auxId;

    @ApiModelProperty("辅助核算类别id")
    private String auxTypeId;

    @ApiModelProperty("辅助核算code")
    private String auxCode;

    @ApiModelProperty("辅助核算名称")
    private String auxName;

    /**
     * 是否数量核算
     */
    @ApiModelProperty("是否数量核算")
    private Integer whetherCount;

    @ApiModelProperty("是否币别")
    private Integer whetherCurrency;

    @ApiModelProperty("创建人ID")
    private String createrId;

    @ApiModelProperty("创建人")
    private String createrName;

    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("更新人ID")
    private String updaterId;

    @ApiModelProperty("更新人")
    private String updaterName;

    @ApiModelProperty("更新时间")
    private String updateTime;

    /**
     * 备用字段1
     */
    @ApiModelProperty(name = "备用字段1")
    private String ext1;

    /**
     * 备用字段2
     */
    @ApiModelProperty(name = "备用字段2")
    private String ext2;

    /**
     * 备用字段3
     */
    @ApiModelProperty(name = "备用字段3")
    private String ext3;

    /**
     * 备用字段4
     */
    @ApiModelProperty(name = "备用字段4")
    private String ext4;

    /**
     * 备用字段5
     */
    @ApiModelProperty(name = "备用字段5")
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

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public SubjectBalanceDirection getBalanceDirection() {
        return balanceDirection;
    }

    public void setBalanceDirection(SubjectBalanceDirection balanceDirection) {
        this.balanceDirection = balanceDirection;
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

    public String getAuxId() {
        return auxId;
    }

    public void setAuxId(String auxId) {
        this.auxId = auxId;
    }

    public String getAuxCode() {
        return auxCode;
    }

    public void setAuxCode(String auxCode) {
        this.auxCode = auxCode;
    }

    public String getAuxName() {
        return auxName;
    }

    public void setAuxName(String auxName) {
        this.auxName = auxName;
    }

    public Integer getWhetherCount() {
        return whetherCount;
    }

    public void setWhetherCount(Integer whetherCount) {
        this.whetherCount = whetherCount;
    }

    public Integer getWhetherCurrency() {
        return whetherCurrency;
    }

    public void setWhetherCurrency(Integer whetherCurrency) {
        this.whetherCurrency = whetherCurrency;
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

    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
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

    public String getAuxTypeId() {
        return auxTypeId;
    }

    public void setAuxTypeId(String auxTypeId) {
        this.auxTypeId = auxTypeId;
    }

    public String getSubjectCategory() {
        return subjectCategory;
    }

    public void setSubjectCategory(String subjectCategory) {
        this.subjectCategory = subjectCategory;
    }

    public Integer getSubjectSeries() {
        return subjectSeries;
    }

    public void setSubjectSeries(Integer subjectSeries) {
        this.subjectSeries = subjectSeries;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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
}
