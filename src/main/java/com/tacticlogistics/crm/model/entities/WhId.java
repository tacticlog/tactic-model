package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WhId generated by hbm2java
 */
@Embeddable
public class WhId implements java.io.Serializable {

	private Serializable whId;
	private Serializable adrId;
	private Integer defWhFlg;
	private Serializable whTypCd;
	private Serializable lensSitnam;
	private Serializable lensCustomerId;
	private Serializable lensCustClientId;
	private Integer lensEnaFlg;
	private Serializable dfltHldpfx;
	private Serializable orgcod;
	private Serializable permCreLod;
	private Serializable permAdjLod;
	private Serializable permCreSub;
	private Serializable permAdjSub;
	private Date moddte;
	private Serializable modUsrId;
	private Serializable sgln;
	private Integer rfidEnaFlg;
	private Serializable transWhId;
	private BigDecimal autoPlayCstThr;
	private Integer cntThrUnit;
	private BigDecimal cntThrCst;
	private Integer UVersion;
	private Date insDt;
	private Date lastUpdDt;
	private Serializable insUserId;
	private Serializable lastUpdUserId;
	private Integer aisleMax;
	private Integer bayMax;
	private Integer slotMax;
	private Integer concatOrder;
	private Integer recalcDistFlag;
	private Date recalcDate;
	private Serializable lastRegenTime;
	private Integer wmpLeftX;
	private Integer wmpRightX;
	private Integer wmpUpperY;
	private Integer wmpLowerY;
	private Integer active;
	private Serializable crncyCode;
	private Serializable lstRttnId;
	private Serializable rttnIdMinValue;
	private Serializable rttnIdMaxValue;
	private BigDecimal adjThrCst;
	private Integer adjThrUnit;
	private Serializable cnsgCod;
	private Integer cnsgPeriod;

	public WhId() {
	}

	public WhId(Serializable whId, Serializable adrId, Serializable whTypCd) {
		this.whId = whId;
		this.adrId = adrId;
		this.whTypCd = whTypCd;
	}

	public WhId(Serializable whId, Serializable adrId, Integer defWhFlg, Serializable whTypCd, Serializable lensSitnam,
			Serializable lensCustomerId, Serializable lensCustClientId, Integer lensEnaFlg, Serializable dfltHldpfx,
			Serializable orgcod, Serializable permCreLod, Serializable permAdjLod, Serializable permCreSub,
			Serializable permAdjSub, Date moddte, Serializable modUsrId, Serializable sgln, Integer rfidEnaFlg,
			Serializable transWhId, BigDecimal autoPlayCstThr, Integer cntThrUnit, BigDecimal cntThrCst,
			Integer UVersion, Date insDt, Date lastUpdDt, Serializable insUserId, Serializable lastUpdUserId,
			Integer aisleMax, Integer bayMax, Integer slotMax, Integer concatOrder, Integer recalcDistFlag,
			Date recalcDate, Serializable lastRegenTime, Integer wmpLeftX, Integer wmpRightX, Integer wmpUpperY,
			Integer wmpLowerY, Integer active, Serializable crncyCode, Serializable lstRttnId,
			Serializable rttnIdMinValue, Serializable rttnIdMaxValue, BigDecimal adjThrCst, Integer adjThrUnit,
			Serializable cnsgCod, Integer cnsgPeriod) {
		this.whId = whId;
		this.adrId = adrId;
		this.defWhFlg = defWhFlg;
		this.whTypCd = whTypCd;
		this.lensSitnam = lensSitnam;
		this.lensCustomerId = lensCustomerId;
		this.lensCustClientId = lensCustClientId;
		this.lensEnaFlg = lensEnaFlg;
		this.dfltHldpfx = dfltHldpfx;
		this.orgcod = orgcod;
		this.permCreLod = permCreLod;
		this.permAdjLod = permAdjLod;
		this.permCreSub = permCreSub;
		this.permAdjSub = permAdjSub;
		this.moddte = moddte;
		this.modUsrId = modUsrId;
		this.sgln = sgln;
		this.rfidEnaFlg = rfidEnaFlg;
		this.transWhId = transWhId;
		this.autoPlayCstThr = autoPlayCstThr;
		this.cntThrUnit = cntThrUnit;
		this.cntThrCst = cntThrCst;
		this.UVersion = UVersion;
		this.insDt = insDt;
		this.lastUpdDt = lastUpdDt;
		this.insUserId = insUserId;
		this.lastUpdUserId = lastUpdUserId;
		this.aisleMax = aisleMax;
		this.bayMax = bayMax;
		this.slotMax = slotMax;
		this.concatOrder = concatOrder;
		this.recalcDistFlag = recalcDistFlag;
		this.recalcDate = recalcDate;
		this.lastRegenTime = lastRegenTime;
		this.wmpLeftX = wmpLeftX;
		this.wmpRightX = wmpRightX;
		this.wmpUpperY = wmpUpperY;
		this.wmpLowerY = wmpLowerY;
		this.active = active;
		this.crncyCode = crncyCode;
		this.lstRttnId = lstRttnId;
		this.rttnIdMinValue = rttnIdMinValue;
		this.rttnIdMaxValue = rttnIdMaxValue;
		this.adjThrCst = adjThrCst;
		this.adjThrUnit = adjThrUnit;
		this.cnsgCod = cnsgCod;
		this.cnsgPeriod = cnsgPeriod;
	}

	@Column(name = "wh_id", nullable = false)
	public Serializable getWhId() {
		return this.whId;
	}

	public void setWhId(Serializable whId) {
		this.whId = whId;
	}

	@Column(name = "adr_id", nullable = false)
	public Serializable getAdrId() {
		return this.adrId;
	}

	public void setAdrId(Serializable adrId) {
		this.adrId = adrId;
	}

	@Column(name = "def_wh_flg")
	public Integer getDefWhFlg() {
		return this.defWhFlg;
	}

	public void setDefWhFlg(Integer defWhFlg) {
		this.defWhFlg = defWhFlg;
	}

	@Column(name = "wh_typ_cd", nullable = false)
	public Serializable getWhTypCd() {
		return this.whTypCd;
	}

	public void setWhTypCd(Serializable whTypCd) {
		this.whTypCd = whTypCd;
	}

	@Column(name = "lens_sitnam")
	public Serializable getLensSitnam() {
		return this.lensSitnam;
	}

	public void setLensSitnam(Serializable lensSitnam) {
		this.lensSitnam = lensSitnam;
	}

	@Column(name = "lens_customer_id")
	public Serializable getLensCustomerId() {
		return this.lensCustomerId;
	}

	public void setLensCustomerId(Serializable lensCustomerId) {
		this.lensCustomerId = lensCustomerId;
	}

	@Column(name = "lens_cust_client_id")
	public Serializable getLensCustClientId() {
		return this.lensCustClientId;
	}

	public void setLensCustClientId(Serializable lensCustClientId) {
		this.lensCustClientId = lensCustClientId;
	}

	@Column(name = "lens_ena_flg")
	public Integer getLensEnaFlg() {
		return this.lensEnaFlg;
	}

	public void setLensEnaFlg(Integer lensEnaFlg) {
		this.lensEnaFlg = lensEnaFlg;
	}

	@Column(name = "dflt_hldpfx")
	public Serializable getDfltHldpfx() {
		return this.dfltHldpfx;
	}

	public void setDfltHldpfx(Serializable dfltHldpfx) {
		this.dfltHldpfx = dfltHldpfx;
	}

	@Column(name = "orgcod")
	public Serializable getOrgcod() {
		return this.orgcod;
	}

	public void setOrgcod(Serializable orgcod) {
		this.orgcod = orgcod;
	}

	@Column(name = "perm_cre_lod")
	public Serializable getPermCreLod() {
		return this.permCreLod;
	}

	public void setPermCreLod(Serializable permCreLod) {
		this.permCreLod = permCreLod;
	}

	@Column(name = "perm_adj_lod")
	public Serializable getPermAdjLod() {
		return this.permAdjLod;
	}

	public void setPermAdjLod(Serializable permAdjLod) {
		this.permAdjLod = permAdjLod;
	}

	@Column(name = "perm_cre_sub")
	public Serializable getPermCreSub() {
		return this.permCreSub;
	}

	public void setPermCreSub(Serializable permCreSub) {
		this.permCreSub = permCreSub;
	}

	@Column(name = "perm_adj_sub")
	public Serializable getPermAdjSub() {
		return this.permAdjSub;
	}

	public void setPermAdjSub(Serializable permAdjSub) {
		this.permAdjSub = permAdjSub;
	}

	@Column(name = "moddte", length = 23)
	public Date getModdte() {
		return this.moddte;
	}

	public void setModdte(Date moddte) {
		this.moddte = moddte;
	}

	@Column(name = "mod_usr_id")
	public Serializable getModUsrId() {
		return this.modUsrId;
	}

	public void setModUsrId(Serializable modUsrId) {
		this.modUsrId = modUsrId;
	}

	@Column(name = "sgln")
	public Serializable getSgln() {
		return this.sgln;
	}

	public void setSgln(Serializable sgln) {
		this.sgln = sgln;
	}

	@Column(name = "rfid_ena_flg")
	public Integer getRfidEnaFlg() {
		return this.rfidEnaFlg;
	}

	public void setRfidEnaFlg(Integer rfidEnaFlg) {
		this.rfidEnaFlg = rfidEnaFlg;
	}

	@Column(name = "trans_wh_id")
	public Serializable getTransWhId() {
		return this.transWhId;
	}

	public void setTransWhId(Serializable transWhId) {
		this.transWhId = transWhId;
	}

	@Column(name = "auto_play_cst_thr", scale = 4)
	public BigDecimal getAutoPlayCstThr() {
		return this.autoPlayCstThr;
	}

	public void setAutoPlayCstThr(BigDecimal autoPlayCstThr) {
		this.autoPlayCstThr = autoPlayCstThr;
	}

	@Column(name = "cnt_thr_unit")
	public Integer getCntThrUnit() {
		return this.cntThrUnit;
	}

	public void setCntThrUnit(Integer cntThrUnit) {
		this.cntThrUnit = cntThrUnit;
	}

	@Column(name = "cnt_thr_cst", scale = 4)
	public BigDecimal getCntThrCst() {
		return this.cntThrCst;
	}

	public void setCntThrCst(BigDecimal cntThrCst) {
		this.cntThrCst = cntThrCst;
	}

	@Column(name = "u_version")
	public Integer getUVersion() {
		return this.UVersion;
	}

	public void setUVersion(Integer UVersion) {
		this.UVersion = UVersion;
	}

	@Column(name = "ins_dt", length = 23)
	public Date getInsDt() {
		return this.insDt;
	}

	public void setInsDt(Date insDt) {
		this.insDt = insDt;
	}

	@Column(name = "last_upd_dt", length = 23)
	public Date getLastUpdDt() {
		return this.lastUpdDt;
	}

	public void setLastUpdDt(Date lastUpdDt) {
		this.lastUpdDt = lastUpdDt;
	}

	@Column(name = "ins_user_id")
	public Serializable getInsUserId() {
		return this.insUserId;
	}

	public void setInsUserId(Serializable insUserId) {
		this.insUserId = insUserId;
	}

	@Column(name = "last_upd_user_id")
	public Serializable getLastUpdUserId() {
		return this.lastUpdUserId;
	}

	public void setLastUpdUserId(Serializable lastUpdUserId) {
		this.lastUpdUserId = lastUpdUserId;
	}

	@Column(name = "aisle_max")
	public Integer getAisleMax() {
		return this.aisleMax;
	}

	public void setAisleMax(Integer aisleMax) {
		this.aisleMax = aisleMax;
	}

	@Column(name = "bay_max")
	public Integer getBayMax() {
		return this.bayMax;
	}

	public void setBayMax(Integer bayMax) {
		this.bayMax = bayMax;
	}

	@Column(name = "slot_max")
	public Integer getSlotMax() {
		return this.slotMax;
	}

	public void setSlotMax(Integer slotMax) {
		this.slotMax = slotMax;
	}

	@Column(name = "concat_order")
	public Integer getConcatOrder() {
		return this.concatOrder;
	}

	public void setConcatOrder(Integer concatOrder) {
		this.concatOrder = concatOrder;
	}

	@Column(name = "recalc_dist_flag")
	public Integer getRecalcDistFlag() {
		return this.recalcDistFlag;
	}

	public void setRecalcDistFlag(Integer recalcDistFlag) {
		this.recalcDistFlag = recalcDistFlag;
	}

	@Column(name = "recalc_date", length = 23)
	public Date getRecalcDate() {
		return this.recalcDate;
	}

	public void setRecalcDate(Date recalcDate) {
		this.recalcDate = recalcDate;
	}

	@Column(name = "last_regen_time")
	public Serializable getLastRegenTime() {
		return this.lastRegenTime;
	}

	public void setLastRegenTime(Serializable lastRegenTime) {
		this.lastRegenTime = lastRegenTime;
	}

	@Column(name = "wmp_left_x")
	public Integer getWmpLeftX() {
		return this.wmpLeftX;
	}

	public void setWmpLeftX(Integer wmpLeftX) {
		this.wmpLeftX = wmpLeftX;
	}

	@Column(name = "wmp_right_x")
	public Integer getWmpRightX() {
		return this.wmpRightX;
	}

	public void setWmpRightX(Integer wmpRightX) {
		this.wmpRightX = wmpRightX;
	}

	@Column(name = "wmp_upper_y")
	public Integer getWmpUpperY() {
		return this.wmpUpperY;
	}

	public void setWmpUpperY(Integer wmpUpperY) {
		this.wmpUpperY = wmpUpperY;
	}

	@Column(name = "wmp_lower_y")
	public Integer getWmpLowerY() {
		return this.wmpLowerY;
	}

	public void setWmpLowerY(Integer wmpLowerY) {
		this.wmpLowerY = wmpLowerY;
	}

	@Column(name = "active")
	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Column(name = "crncy_code")
	public Serializable getCrncyCode() {
		return this.crncyCode;
	}

	public void setCrncyCode(Serializable crncyCode) {
		this.crncyCode = crncyCode;
	}

	@Column(name = "lst_rttn_id")
	public Serializable getLstRttnId() {
		return this.lstRttnId;
	}

	public void setLstRttnId(Serializable lstRttnId) {
		this.lstRttnId = lstRttnId;
	}

	@Column(name = "rttn_id_min_value")
	public Serializable getRttnIdMinValue() {
		return this.rttnIdMinValue;
	}

	public void setRttnIdMinValue(Serializable rttnIdMinValue) {
		this.rttnIdMinValue = rttnIdMinValue;
	}

	@Column(name = "rttn_id_max_value")
	public Serializable getRttnIdMaxValue() {
		return this.rttnIdMaxValue;
	}

	public void setRttnIdMaxValue(Serializable rttnIdMaxValue) {
		this.rttnIdMaxValue = rttnIdMaxValue;
	}

	@Column(name = "adj_thr_cst", scale = 4)
	public BigDecimal getAdjThrCst() {
		return this.adjThrCst;
	}

	public void setAdjThrCst(BigDecimal adjThrCst) {
		this.adjThrCst = adjThrCst;
	}

	@Column(name = "adj_thr_unit")
	public Integer getAdjThrUnit() {
		return this.adjThrUnit;
	}

	public void setAdjThrUnit(Integer adjThrUnit) {
		this.adjThrUnit = adjThrUnit;
	}

	@Column(name = "cnsg_cod")
	public Serializable getCnsgCod() {
		return this.cnsgCod;
	}

	public void setCnsgCod(Serializable cnsgCod) {
		this.cnsgCod = cnsgCod;
	}

	@Column(name = "cnsg_period")
	public Integer getCnsgPeriod() {
		return this.cnsgPeriod;
	}

	public void setCnsgPeriod(Integer cnsgPeriod) {
		this.cnsgPeriod = cnsgPeriod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WhId))
			return false;
		WhId castOther = (WhId) other;

		return ((this.getWhId() == castOther.getWhId()) || (this.getWhId() != null && castOther.getWhId() != null
				&& this.getWhId().equals(castOther.getWhId())))
				&& ((this.getAdrId() == castOther.getAdrId()) || (this.getAdrId() != null
						&& castOther.getAdrId() != null && this.getAdrId().equals(castOther.getAdrId())))
				&& ((this.getDefWhFlg() == castOther.getDefWhFlg()) || (this.getDefWhFlg() != null
						&& castOther.getDefWhFlg() != null && this.getDefWhFlg().equals(castOther.getDefWhFlg())))
				&& ((this.getWhTypCd() == castOther.getWhTypCd()) || (this.getWhTypCd() != null
						&& castOther.getWhTypCd() != null && this.getWhTypCd().equals(castOther.getWhTypCd())))
				&& ((this.getLensSitnam() == castOther.getLensSitnam()) || (this.getLensSitnam() != null
						&& castOther.getLensSitnam() != null && this.getLensSitnam().equals(castOther.getLensSitnam())))
				&& ((this.getLensCustomerId() == castOther.getLensCustomerId())
						|| (this.getLensCustomerId() != null && castOther.getLensCustomerId() != null
								&& this.getLensCustomerId().equals(castOther.getLensCustomerId())))
				&& ((this.getLensCustClientId() == castOther.getLensCustClientId())
						|| (this.getLensCustClientId() != null && castOther.getLensCustClientId() != null
								&& this.getLensCustClientId().equals(castOther.getLensCustClientId())))
				&& ((this.getLensEnaFlg() == castOther.getLensEnaFlg()) || (this.getLensEnaFlg() != null
						&& castOther.getLensEnaFlg() != null && this.getLensEnaFlg().equals(castOther.getLensEnaFlg())))
				&& ((this.getDfltHldpfx() == castOther.getDfltHldpfx()) || (this.getDfltHldpfx() != null
						&& castOther.getDfltHldpfx() != null && this.getDfltHldpfx().equals(castOther.getDfltHldpfx())))
				&& ((this.getOrgcod() == castOther.getOrgcod()) || (this.getOrgcod() != null
						&& castOther.getOrgcod() != null && this.getOrgcod().equals(castOther.getOrgcod())))
				&& ((this.getPermCreLod() == castOther.getPermCreLod()) || (this.getPermCreLod() != null
						&& castOther.getPermCreLod() != null && this.getPermCreLod().equals(castOther.getPermCreLod())))
				&& ((this.getPermAdjLod() == castOther.getPermAdjLod()) || (this.getPermAdjLod() != null
						&& castOther.getPermAdjLod() != null && this.getPermAdjLod().equals(castOther.getPermAdjLod())))
				&& ((this.getPermCreSub() == castOther.getPermCreSub()) || (this.getPermCreSub() != null
						&& castOther.getPermCreSub() != null && this.getPermCreSub().equals(castOther.getPermCreSub())))
				&& ((this.getPermAdjSub() == castOther.getPermAdjSub()) || (this.getPermAdjSub() != null
						&& castOther.getPermAdjSub() != null && this.getPermAdjSub().equals(castOther.getPermAdjSub())))
				&& ((this.getModdte() == castOther.getModdte()) || (this.getModdte() != null
						&& castOther.getModdte() != null && this.getModdte().equals(castOther.getModdte())))
				&& ((this.getModUsrId() == castOther.getModUsrId()) || (this.getModUsrId() != null
						&& castOther.getModUsrId() != null && this.getModUsrId().equals(castOther.getModUsrId())))
				&& ((this.getSgln() == castOther.getSgln()) || (this.getSgln() != null && castOther.getSgln() != null
						&& this.getSgln().equals(castOther.getSgln())))
				&& ((this.getRfidEnaFlg() == castOther.getRfidEnaFlg()) || (this.getRfidEnaFlg() != null
						&& castOther.getRfidEnaFlg() != null && this.getRfidEnaFlg().equals(castOther.getRfidEnaFlg())))
				&& ((this.getTransWhId() == castOther.getTransWhId()) || (this.getTransWhId() != null
						&& castOther.getTransWhId() != null && this.getTransWhId().equals(castOther.getTransWhId())))
				&& ((this.getAutoPlayCstThr() == castOther.getAutoPlayCstThr())
						|| (this.getAutoPlayCstThr() != null && castOther.getAutoPlayCstThr() != null
								&& this.getAutoPlayCstThr().equals(castOther.getAutoPlayCstThr())))
				&& ((this.getCntThrUnit() == castOther.getCntThrUnit()) || (this.getCntThrUnit() != null
						&& castOther.getCntThrUnit() != null && this.getCntThrUnit().equals(castOther.getCntThrUnit())))
				&& ((this.getCntThrCst() == castOther.getCntThrCst()) || (this.getCntThrCst() != null
						&& castOther.getCntThrCst() != null && this.getCntThrCst().equals(castOther.getCntThrCst())))
				&& ((this.getUVersion() == castOther.getUVersion()) || (this.getUVersion() != null
						&& castOther.getUVersion() != null && this.getUVersion().equals(castOther.getUVersion())))
				&& ((this.getInsDt() == castOther.getInsDt()) || (this.getInsDt() != null
						&& castOther.getInsDt() != null && this.getInsDt().equals(castOther.getInsDt())))
				&& ((this.getLastUpdDt() == castOther.getLastUpdDt()) || (this.getLastUpdDt() != null
						&& castOther.getLastUpdDt() != null && this.getLastUpdDt().equals(castOther.getLastUpdDt())))
				&& ((this.getInsUserId() == castOther.getInsUserId()) || (this.getInsUserId() != null
						&& castOther.getInsUserId() != null && this.getInsUserId().equals(castOther.getInsUserId())))
				&& ((this.getLastUpdUserId() == castOther.getLastUpdUserId())
						|| (this.getLastUpdUserId() != null && castOther.getLastUpdUserId() != null
								&& this.getLastUpdUserId().equals(castOther.getLastUpdUserId())))
				&& ((this.getAisleMax() == castOther.getAisleMax()) || (this.getAisleMax() != null
						&& castOther.getAisleMax() != null && this.getAisleMax().equals(castOther.getAisleMax())))
				&& ((this.getBayMax() == castOther.getBayMax()) || (this.getBayMax() != null
						&& castOther.getBayMax() != null && this.getBayMax().equals(castOther.getBayMax())))
				&& ((this.getSlotMax() == castOther.getSlotMax()) || (this.getSlotMax() != null
						&& castOther.getSlotMax() != null && this.getSlotMax().equals(castOther.getSlotMax())))
				&& ((this.getConcatOrder() == castOther.getConcatOrder())
						|| (this.getConcatOrder() != null && castOther.getConcatOrder() != null
								&& this.getConcatOrder().equals(castOther.getConcatOrder())))
				&& ((this.getRecalcDistFlag() == castOther.getRecalcDistFlag())
						|| (this.getRecalcDistFlag() != null && castOther.getRecalcDistFlag() != null
								&& this.getRecalcDistFlag().equals(castOther.getRecalcDistFlag())))
				&& ((this.getRecalcDate() == castOther.getRecalcDate()) || (this.getRecalcDate() != null
						&& castOther.getRecalcDate() != null && this.getRecalcDate().equals(castOther.getRecalcDate())))
				&& ((this.getLastRegenTime() == castOther.getLastRegenTime())
						|| (this.getLastRegenTime() != null && castOther.getLastRegenTime() != null
								&& this.getLastRegenTime().equals(castOther.getLastRegenTime())))
				&& ((this.getWmpLeftX() == castOther.getWmpLeftX()) || (this.getWmpLeftX() != null
						&& castOther.getWmpLeftX() != null && this.getWmpLeftX().equals(castOther.getWmpLeftX())))
				&& ((this.getWmpRightX() == castOther.getWmpRightX()) || (this.getWmpRightX() != null
						&& castOther.getWmpRightX() != null && this.getWmpRightX().equals(castOther.getWmpRightX())))
				&& ((this.getWmpUpperY() == castOther.getWmpUpperY()) || (this.getWmpUpperY() != null
						&& castOther.getWmpUpperY() != null && this.getWmpUpperY().equals(castOther.getWmpUpperY())))
				&& ((this.getWmpLowerY() == castOther.getWmpLowerY()) || (this.getWmpLowerY() != null
						&& castOther.getWmpLowerY() != null && this.getWmpLowerY().equals(castOther.getWmpLowerY())))
				&& ((this.getActive() == castOther.getActive()) || (this.getActive() != null
						&& castOther.getActive() != null && this.getActive().equals(castOther.getActive())))
				&& ((this.getCrncyCode() == castOther.getCrncyCode()) || (this.getCrncyCode() != null
						&& castOther.getCrncyCode() != null && this.getCrncyCode().equals(castOther.getCrncyCode())))
				&& ((this.getLstRttnId() == castOther.getLstRttnId()) || (this.getLstRttnId() != null
						&& castOther.getLstRttnId() != null && this.getLstRttnId().equals(castOther.getLstRttnId())))
				&& ((this.getRttnIdMinValue() == castOther.getRttnIdMinValue())
						|| (this.getRttnIdMinValue() != null && castOther.getRttnIdMinValue() != null
								&& this.getRttnIdMinValue().equals(castOther.getRttnIdMinValue())))
				&& ((this.getRttnIdMaxValue() == castOther.getRttnIdMaxValue())
						|| (this.getRttnIdMaxValue() != null && castOther.getRttnIdMaxValue() != null
								&& this.getRttnIdMaxValue().equals(castOther.getRttnIdMaxValue())))
				&& ((this.getAdjThrCst() == castOther.getAdjThrCst()) || (this.getAdjThrCst() != null
						&& castOther.getAdjThrCst() != null && this.getAdjThrCst().equals(castOther.getAdjThrCst())))
				&& ((this.getAdjThrUnit() == castOther.getAdjThrUnit()) || (this.getAdjThrUnit() != null
						&& castOther.getAdjThrUnit() != null && this.getAdjThrUnit().equals(castOther.getAdjThrUnit())))
				&& ((this.getCnsgCod() == castOther.getCnsgCod()) || (this.getCnsgCod() != null
						&& castOther.getCnsgCod() != null && this.getCnsgCod().equals(castOther.getCnsgCod())))
				&& ((this.getCnsgPeriod() == castOther.getCnsgPeriod())
						|| (this.getCnsgPeriod() != null && castOther.getCnsgPeriod() != null
								&& this.getCnsgPeriod().equals(castOther.getCnsgPeriod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getWhId() == null ? 0 : this.getWhId().hashCode());
		result = 37 * result + (getAdrId() == null ? 0 : this.getAdrId().hashCode());
		result = 37 * result + (getDefWhFlg() == null ? 0 : this.getDefWhFlg().hashCode());
		result = 37 * result + (getWhTypCd() == null ? 0 : this.getWhTypCd().hashCode());
		result = 37 * result + (getLensSitnam() == null ? 0 : this.getLensSitnam().hashCode());
		result = 37 * result + (getLensCustomerId() == null ? 0 : this.getLensCustomerId().hashCode());
		result = 37 * result + (getLensCustClientId() == null ? 0 : this.getLensCustClientId().hashCode());
		result = 37 * result + (getLensEnaFlg() == null ? 0 : this.getLensEnaFlg().hashCode());
		result = 37 * result + (getDfltHldpfx() == null ? 0 : this.getDfltHldpfx().hashCode());
		result = 37 * result + (getOrgcod() == null ? 0 : this.getOrgcod().hashCode());
		result = 37 * result + (getPermCreLod() == null ? 0 : this.getPermCreLod().hashCode());
		result = 37 * result + (getPermAdjLod() == null ? 0 : this.getPermAdjLod().hashCode());
		result = 37 * result + (getPermCreSub() == null ? 0 : this.getPermCreSub().hashCode());
		result = 37 * result + (getPermAdjSub() == null ? 0 : this.getPermAdjSub().hashCode());
		result = 37 * result + (getModdte() == null ? 0 : this.getModdte().hashCode());
		result = 37 * result + (getModUsrId() == null ? 0 : this.getModUsrId().hashCode());
		result = 37 * result + (getSgln() == null ? 0 : this.getSgln().hashCode());
		result = 37 * result + (getRfidEnaFlg() == null ? 0 : this.getRfidEnaFlg().hashCode());
		result = 37 * result + (getTransWhId() == null ? 0 : this.getTransWhId().hashCode());
		result = 37 * result + (getAutoPlayCstThr() == null ? 0 : this.getAutoPlayCstThr().hashCode());
		result = 37 * result + (getCntThrUnit() == null ? 0 : this.getCntThrUnit().hashCode());
		result = 37 * result + (getCntThrCst() == null ? 0 : this.getCntThrCst().hashCode());
		result = 37 * result + (getUVersion() == null ? 0 : this.getUVersion().hashCode());
		result = 37 * result + (getInsDt() == null ? 0 : this.getInsDt().hashCode());
		result = 37 * result + (getLastUpdDt() == null ? 0 : this.getLastUpdDt().hashCode());
		result = 37 * result + (getInsUserId() == null ? 0 : this.getInsUserId().hashCode());
		result = 37 * result + (getLastUpdUserId() == null ? 0 : this.getLastUpdUserId().hashCode());
		result = 37 * result + (getAisleMax() == null ? 0 : this.getAisleMax().hashCode());
		result = 37 * result + (getBayMax() == null ? 0 : this.getBayMax().hashCode());
		result = 37 * result + (getSlotMax() == null ? 0 : this.getSlotMax().hashCode());
		result = 37 * result + (getConcatOrder() == null ? 0 : this.getConcatOrder().hashCode());
		result = 37 * result + (getRecalcDistFlag() == null ? 0 : this.getRecalcDistFlag().hashCode());
		result = 37 * result + (getRecalcDate() == null ? 0 : this.getRecalcDate().hashCode());
		result = 37 * result + (getLastRegenTime() == null ? 0 : this.getLastRegenTime().hashCode());
		result = 37 * result + (getWmpLeftX() == null ? 0 : this.getWmpLeftX().hashCode());
		result = 37 * result + (getWmpRightX() == null ? 0 : this.getWmpRightX().hashCode());
		result = 37 * result + (getWmpUpperY() == null ? 0 : this.getWmpUpperY().hashCode());
		result = 37 * result + (getWmpLowerY() == null ? 0 : this.getWmpLowerY().hashCode());
		result = 37 * result + (getActive() == null ? 0 : this.getActive().hashCode());
		result = 37 * result + (getCrncyCode() == null ? 0 : this.getCrncyCode().hashCode());
		result = 37 * result + (getLstRttnId() == null ? 0 : this.getLstRttnId().hashCode());
		result = 37 * result + (getRttnIdMinValue() == null ? 0 : this.getRttnIdMinValue().hashCode());
		result = 37 * result + (getRttnIdMaxValue() == null ? 0 : this.getRttnIdMaxValue().hashCode());
		result = 37 * result + (getAdjThrCst() == null ? 0 : this.getAdjThrCst().hashCode());
		result = 37 * result + (getAdjThrUnit() == null ? 0 : this.getAdjThrUnit().hashCode());
		result = 37 * result + (getCnsgCod() == null ? 0 : this.getCnsgCod().hashCode());
		result = 37 * result + (getCnsgPeriod() == null ? 0 : this.getCnsgPeriod().hashCode());
		return result;
	}

}
