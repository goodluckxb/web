package com.entry;

import java.math.BigDecimal;
import java.util.Date;


public class FixedIncome {

	private Long id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 总额
	 */
	private BigDecimal totalAmount;
	/**
	 * 已销售额
	 */
	private BigDecimal soldAmount;
	/**
	 * 状态（0：在售，1：暂停）
	 */
	private String status;
	/**
	 * 是否在线
	 */
	private Integer online;
	/**
	 * 期限
	 */
	private Integer term;
	/**
	 * 预期年化收益
	 */
	private BigDecimal previousIncomeRatio;
	/**
	 * 产品规模
	 */
	private String productScale;
	/**
	 * 回款方式
	 */
	private String cashWay;
	/**
	 * 申购最大限额
	 */
	private Integer maxBuy;
	/**
	 * 申购最低份额
	 */
	private Integer minBuy;
	private Date createTime;
	private Date updateTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 起息日
	 */
	private Date valueDate;
	/**
	 * 开卖时间
	 */
	private Date startTime;
	/**
	 * 产品等级
	 */
	private String rating;
	/**
	 * 投资目的
	 */
	private String purpose;
	/**
	 * 担保方
	 */
	private String secured;
	/**
	 * 融资方
	 */
	private String financingSide;
	/**
	 * 收益权转让
	 */
	private String usufructTransfer;
	/**
	 * 刚性兑付
	 */
	private String rigidCash;
	/**
	 * 投资方向
	 */
	private String investmentOrientation;
	/**
	 * 购买准备
	 */
	private String buyPlan;
	/**
	 * 投资理由
	 */
	private String reason;
	/**
	 * 项目概述
	 */
	private String summary;
	/**
	 * 政信类信托理财产品介绍
	 */
	private String introduce;
	/**
	 * 资金安全
	 */
	private String security;
	/**
	 * 风控保障
	 */
	private String riskMeasure;
	/**
	 * 0.未审核 1.审核通过 2.审核失败
	 */
	private String collectMark;
	/**
	 * 倒计时
	 */
	private Integer countDown;// 秒
	/**
	 * 1.立即抢购 2.已经抢光（募集成功或失败） 3.暂停销售 4.即将开始 5.已兑付 6.开始倒计时 7.待审核 8.募集成功 9.募集失败
	 */
	private String displayStatus;
	
	/**
	 * /排序号：1.立即抢购  2.倒计时  3.即将开始  4.已售光  5.暂停（升序）
	 */
	private Integer sortNo; 
	
	private BigDecimal remainAmount;
	private int progress;
	private int count;
	/**
	 * 倒计时时间
	 */
	private long downDuration;//
	private String productSummaryWeb;
	private String productSummaryMobile;
	private String summaryUrlMobile;
	private int mockTotal;
	
	
	//是否授信  默认是true
	private Boolean credit;
	//授信比例
	private Integer creditRatio;
	
	public Boolean getCredit() {
		if(credit == null){
			return false;
		}
		return credit;
	}

	public Integer getCreditRatio() {
		return creditRatio;
	}

	public void setCreditRatio(Integer creditRatio) {
		this.creditRatio = creditRatio;
	}

	public void setCredit(Boolean credit) {
		this.credit = credit;
	}

	public void Boolean(Boolean credit) {
		this.credit = credit;
	}
	
	/**
	 * 固收类型
	 */
	private Integer fixedType;
	/**
	 * 投资增长幅度
	 */
	private Integer investGrowRate; 
	/**
	 * 协议code
	 */
	private String agrmCodeStr;
	/**
	 * 预计回款日 = 起息日+期限+1天
	 */
	private String expectedCashDate;
	
	


	public String getAgrmCodeStr() {
		return agrmCodeStr;
	}

	public void setAgrmCodeStr(String agrmCodeStr) {
		this.agrmCodeStr = agrmCodeStr;
	}

	public Integer getFixedType() {
		return fixedType;
	}

	public void setFixedType(Integer fixedType) {
		this.fixedType = fixedType;
	}

	public Integer getInvestGrowRate() {
		return investGrowRate;
	}

	public void setInvestGrowRate(Integer investGrowRate) {
		this.investGrowRate = investGrowRate;
	}

	

	public Integer getSortNo() {
		return sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	public String getProductSummaryWeb() {
		return productSummaryWeb;
	}

	public void setProductSummaryWeb(String productSummaryWeb) {
		this.productSummaryWeb = productSummaryWeb;
	}

	public String getProductSummaryMobile() {
		return productSummaryMobile;
	}

	private Date dueDate;

	public void setProductSummaryMobile(String productSummaryMobile) {
		this.productSummaryMobile = productSummaryMobile;
	}

	public Integer getCountDown() {
		return countDown;
	}

	public void setCountDown(Integer countDown) {
		this.countDown = countDown;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getSoldAmount() {
		// if (soldAmount == null)
		// soldAmount = new BigDecimal(0);
		return soldAmount;
	}

	public void setSoldAmount(BigDecimal soldAmount) {
		this.soldAmount = soldAmount;
	}

	public Integer getOnline() {
		return online;
	}

	public void setOnline(Integer online) {
		this.online = online;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public BigDecimal getPreviousIncomeRatio() {
		return previousIncomeRatio;
	}

	public void setPreviousIncomeRatio(BigDecimal previousIncomeRatio) {
		this.previousIncomeRatio = previousIncomeRatio;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getCashWay() {
		return cashWay;
	}

	public void setCashWay(String cashWay) {
		this.cashWay = cashWay;
	}

	public Integer getMaxBuy() {
		return maxBuy;
	}

	public void setMaxBuy(Integer maxBuy) {
		this.maxBuy = maxBuy;
	}

	public Integer getMinBuy() {
		return minBuy;
	}

	public void setMinBuy(Integer minBuy) {
		this.minBuy = minBuy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getSecured() {
		return secured;
	}

	public void setSecured(String secured) {
		this.secured = secured;
	}

	public String getFinancingSide() {
		return financingSide;
	}

	public void setFinancingSide(String financingSide) {
		this.financingSide = financingSide;
	}

	public String getUsufructTransfer() {
		return usufructTransfer;
	}

	public void setUsufructTransfer(String usufructTransfer) {
		this.usufructTransfer = usufructTransfer;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRigidCash() {
		return rigidCash;
	}

	public void setRigidCash(String rigidCash) {
		this.rigidCash = rigidCash;
	}

	public String getInvestmentOrientation() {
		return investmentOrientation;
	}

	public void setInvestmentOrientation(String investmentOrientation) {
		this.investmentOrientation = investmentOrientation;
	}

	public String getBuyPlan() {
		return buyPlan;
	}

	public void setBuyPlan(String buyPlan) {
		this.buyPlan = buyPlan;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getRiskMeasure() {
		return riskMeasure;
	}

	public void setRiskMeasure(String riskMeasure) {
		this.riskMeasure = riskMeasure;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCollectMark() {
		return collectMark;
	}

	public void setCollectMark(String collectMark) {
		this.collectMark = collectMark;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public void setDisplayStatus(String displayStatus) {
		this.displayStatus = displayStatus;
	}

	

	public void setRemainAmount(BigDecimal remainAmount) {
		this.remainAmount = remainAmount;
	}


	public void setProgress(int progress) {
		this.progress = progress;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	public long getDownDuration() {
		downDuration = (this.startTime.getTime() - new Date().getTime()) / 1000;
		return downDuration;
	}

	public void setDownDuration(long downDuration) {
		this.downDuration = downDuration;
	}



	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getSummaryUrlMobile() {
		return summaryUrlMobile;
	}

	public void setSummaryUrlMobile(String summaryUrlMobile) {
		this.summaryUrlMobile = summaryUrlMobile;
	}

	public void addSummaryMobile(String detailMobile) {
		this.setSummaryUrlMobile(detailMobile + this.id);
	}

	public int getMockTotal() {
		return mockTotal;
	}

	public void setMockTotal(int mockTotal) {
		this.mockTotal = mockTotal;
	}

}
