package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrtftpDtlId generated by hbm2java
 */
@Embeddable
public class PrtftpDtlId implements java.io.Serializable {

	private Serializable prtnum;
	private Serializable ftpcod;
	private Serializable prtClientId;
	private Serializable whId;
	private Serializable uomcod;
	private Integer uomlvl;
	private BigDecimal len;
	private BigDecimal wid;
	private BigDecimal hgt;
	private BigDecimal grswgt;
	private BigDecimal netwgt;
	private Integer palFlg;
	private Integer casFlg;
	private Integer pakFlg;
	private Integer stkFlg;
	private Integer rcvFlg;
	private Integer untqty;
	private Integer ctnFlg;
	private BigDecimal threshPct;
	private Integer ctnDstrFlg;
	private Integer bulkPckFlg;
	private Date insDt;
	private Date lastUpdDt;
	private Serializable insUserId;
	private Serializable lastUpdUserId;

	public PrtftpDtlId() {
	}

	public PrtftpDtlId(Serializable prtnum, Serializable ftpcod, Serializable prtClientId, Serializable whId,
			Serializable uomcod, Integer uomlvl, BigDecimal len, BigDecimal wid, BigDecimal hgt, BigDecimal grswgt,
			BigDecimal netwgt, Integer palFlg, Integer casFlg, Integer pakFlg, Integer stkFlg, Integer rcvFlg,
			Integer untqty, Integer ctnFlg, BigDecimal threshPct, Integer ctnDstrFlg, Integer bulkPckFlg) {
		this.prtnum = prtnum;
		this.ftpcod = ftpcod;
		this.prtClientId = prtClientId;
		this.whId = whId;
		this.uomcod = uomcod;
		this.uomlvl = uomlvl;
		this.len = len;
		this.wid = wid;
		this.hgt = hgt;
		this.grswgt = grswgt;
		this.netwgt = netwgt;
		this.palFlg = palFlg;
		this.casFlg = casFlg;
		this.pakFlg = pakFlg;
		this.stkFlg = stkFlg;
		this.rcvFlg = rcvFlg;
		this.untqty = untqty;
		this.ctnFlg = ctnFlg;
		this.threshPct = threshPct;
		this.ctnDstrFlg = ctnDstrFlg;
		this.bulkPckFlg = bulkPckFlg;
	}

	public PrtftpDtlId(Serializable prtnum, Serializable ftpcod, Serializable prtClientId, Serializable whId,
			Serializable uomcod, Integer uomlvl, BigDecimal len, BigDecimal wid, BigDecimal hgt, BigDecimal grswgt,
			BigDecimal netwgt, Integer palFlg, Integer casFlg, Integer pakFlg, Integer stkFlg, Integer rcvFlg,
			Integer untqty, Integer ctnFlg, BigDecimal threshPct, Integer ctnDstrFlg, Integer bulkPckFlg, Date insDt,
			Date lastUpdDt, Serializable insUserId, Serializable lastUpdUserId) {
		this.prtnum = prtnum;
		this.ftpcod = ftpcod;
		this.prtClientId = prtClientId;
		this.whId = whId;
		this.uomcod = uomcod;
		this.uomlvl = uomlvl;
		this.len = len;
		this.wid = wid;
		this.hgt = hgt;
		this.grswgt = grswgt;
		this.netwgt = netwgt;
		this.palFlg = palFlg;
		this.casFlg = casFlg;
		this.pakFlg = pakFlg;
		this.stkFlg = stkFlg;
		this.rcvFlg = rcvFlg;
		this.untqty = untqty;
		this.ctnFlg = ctnFlg;
		this.threshPct = threshPct;
		this.ctnDstrFlg = ctnDstrFlg;
		this.bulkPckFlg = bulkPckFlg;
		this.insDt = insDt;
		this.lastUpdDt = lastUpdDt;
		this.insUserId = insUserId;
		this.lastUpdUserId = lastUpdUserId;
	}

	@Column(name = "prtnum", nullable = false)
	public Serializable getPrtnum() {
		return this.prtnum;
	}

	public void setPrtnum(Serializable prtnum) {
		this.prtnum = prtnum;
	}

	@Column(name = "ftpcod", nullable = false)
	public Serializable getFtpcod() {
		return this.ftpcod;
	}

	public void setFtpcod(Serializable ftpcod) {
		this.ftpcod = ftpcod;
	}

	@Column(name = "prt_client_id", nullable = false)
	public Serializable getPrtClientId() {
		return this.prtClientId;
	}

	public void setPrtClientId(Serializable prtClientId) {
		this.prtClientId = prtClientId;
	}

	@Column(name = "wh_id", nullable = false)
	public Serializable getWhId() {
		return this.whId;
	}

	public void setWhId(Serializable whId) {
		this.whId = whId;
	}

	@Column(name = "uomcod", nullable = false)
	public Serializable getUomcod() {
		return this.uomcod;
	}

	public void setUomcod(Serializable uomcod) {
		this.uomcod = uomcod;
	}

	@Column(name = "uomlvl", nullable = false)
	public Integer getUomlvl() {
		return this.uomlvl;
	}

	public void setUomlvl(Integer uomlvl) {
		this.uomlvl = uomlvl;
	}

	@Column(name = "len", nullable = false, scale = 4)
	public BigDecimal getLen() {
		return this.len;
	}

	public void setLen(BigDecimal len) {
		this.len = len;
	}

	@Column(name = "wid", nullable = false, scale = 4)
	public BigDecimal getWid() {
		return this.wid;
	}

	public void setWid(BigDecimal wid) {
		this.wid = wid;
	}

	@Column(name = "hgt", nullable = false, scale = 4)
	public BigDecimal getHgt() {
		return this.hgt;
	}

	public void setHgt(BigDecimal hgt) {
		this.hgt = hgt;
	}

	@Column(name = "grswgt", nullable = false, precision = 23, scale = 8)
	public BigDecimal getGrswgt() {
		return this.grswgt;
	}

	public void setGrswgt(BigDecimal grswgt) {
		this.grswgt = grswgt;
	}

	@Column(name = "netwgt", nullable = false, precision = 23, scale = 8)
	public BigDecimal getNetwgt() {
		return this.netwgt;
	}

	public void setNetwgt(BigDecimal netwgt) {
		this.netwgt = netwgt;
	}

	@Column(name = "pal_flg", nullable = false)
	public Integer getPalFlg() {
		return this.palFlg;
	}

	public void setPalFlg(Integer palFlg) {
		this.palFlg = palFlg;
	}

	@Column(name = "cas_flg", nullable = false)
	public Integer getCasFlg() {
		return this.casFlg;
	}

	public void setCasFlg(Integer casFlg) {
		this.casFlg = casFlg;
	}

	@Column(name = "pak_flg", nullable = false)
	public Integer getPakFlg() {
		return this.pakFlg;
	}

	public void setPakFlg(Integer pakFlg) {
		this.pakFlg = pakFlg;
	}

	@Column(name = "stk_flg", nullable = false)
	public Integer getStkFlg() {
		return this.stkFlg;
	}

	public void setStkFlg(Integer stkFlg) {
		this.stkFlg = stkFlg;
	}

	@Column(name = "rcv_flg", nullable = false)
	public Integer getRcvFlg() {
		return this.rcvFlg;
	}

	public void setRcvFlg(Integer rcvFlg) {
		this.rcvFlg = rcvFlg;
	}

	@Column(name = "untqty", nullable = false)
	public Integer getUntqty() {
		return this.untqty;
	}

	public void setUntqty(Integer untqty) {
		this.untqty = untqty;
	}

	@Column(name = "ctn_flg", nullable = false)
	public Integer getCtnFlg() {
		return this.ctnFlg;
	}

	public void setCtnFlg(Integer ctnFlg) {
		this.ctnFlg = ctnFlg;
	}

	@Column(name = "thresh_pct", nullable = false, scale = 4)
	public BigDecimal getThreshPct() {
		return this.threshPct;
	}

	public void setThreshPct(BigDecimal threshPct) {
		this.threshPct = threshPct;
	}

	@Column(name = "ctn_dstr_flg", nullable = false)
	public Integer getCtnDstrFlg() {
		return this.ctnDstrFlg;
	}

	public void setCtnDstrFlg(Integer ctnDstrFlg) {
		this.ctnDstrFlg = ctnDstrFlg;
	}

	@Column(name = "bulk_pck_flg", nullable = false)
	public Integer getBulkPckFlg() {
		return this.bulkPckFlg;
	}

	public void setBulkPckFlg(Integer bulkPckFlg) {
		this.bulkPckFlg = bulkPckFlg;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrtftpDtlId))
			return false;
		PrtftpDtlId castOther = (PrtftpDtlId) other;

		return ((this.getPrtnum() == castOther.getPrtnum()) || (this.getPrtnum() != null
				&& castOther.getPrtnum() != null && this.getPrtnum().equals(castOther.getPrtnum())))
				&& ((this.getFtpcod() == castOther.getFtpcod()) || (this.getFtpcod() != null
						&& castOther.getFtpcod() != null && this.getFtpcod().equals(castOther.getFtpcod())))
				&& ((this.getPrtClientId() == castOther.getPrtClientId())
						|| (this.getPrtClientId() != null && castOther.getPrtClientId() != null
								&& this.getPrtClientId().equals(castOther.getPrtClientId())))
				&& ((this.getWhId() == castOther.getWhId()) || (this.getWhId() != null && castOther.getWhId() != null
						&& this.getWhId().equals(castOther.getWhId())))
				&& ((this.getUomcod() == castOther.getUomcod()) || (this.getUomcod() != null
						&& castOther.getUomcod() != null && this.getUomcod().equals(castOther.getUomcod())))
				&& ((this.getUomlvl() == castOther.getUomlvl()) || (this.getUomlvl() != null
						&& castOther.getUomlvl() != null && this.getUomlvl().equals(castOther.getUomlvl())))
				&& ((this.getLen() == castOther.getLen()) || (this.getLen() != null && castOther.getLen() != null
						&& this.getLen().equals(castOther.getLen())))
				&& ((this.getWid() == castOther.getWid()) || (this.getWid() != null && castOther.getWid() != null
						&& this.getWid().equals(castOther.getWid())))
				&& ((this.getHgt() == castOther.getHgt()) || (this.getHgt() != null && castOther.getHgt() != null
						&& this.getHgt().equals(castOther.getHgt())))
				&& ((this.getGrswgt() == castOther.getGrswgt()) || (this.getGrswgt() != null
						&& castOther.getGrswgt() != null && this.getGrswgt().equals(castOther.getGrswgt())))
				&& ((this.getNetwgt() == castOther.getNetwgt()) || (this.getNetwgt() != null
						&& castOther.getNetwgt() != null && this.getNetwgt().equals(castOther.getNetwgt())))
				&& ((this.getPalFlg() == castOther.getPalFlg()) || (this.getPalFlg() != null
						&& castOther.getPalFlg() != null && this.getPalFlg().equals(castOther.getPalFlg())))
				&& ((this.getCasFlg() == castOther.getCasFlg()) || (this.getCasFlg() != null
						&& castOther.getCasFlg() != null && this.getCasFlg().equals(castOther.getCasFlg())))
				&& ((this.getPakFlg() == castOther.getPakFlg()) || (this.getPakFlg() != null
						&& castOther.getPakFlg() != null && this.getPakFlg().equals(castOther.getPakFlg())))
				&& ((this.getStkFlg() == castOther.getStkFlg()) || (this.getStkFlg() != null
						&& castOther.getStkFlg() != null && this.getStkFlg().equals(castOther.getStkFlg())))
				&& ((this.getRcvFlg() == castOther.getRcvFlg()) || (this.getRcvFlg() != null
						&& castOther.getRcvFlg() != null && this.getRcvFlg().equals(castOther.getRcvFlg())))
				&& ((this.getUntqty() == castOther.getUntqty()) || (this.getUntqty() != null
						&& castOther.getUntqty() != null && this.getUntqty().equals(castOther.getUntqty())))
				&& ((this.getCtnFlg() == castOther.getCtnFlg()) || (this.getCtnFlg() != null
						&& castOther.getCtnFlg() != null && this.getCtnFlg().equals(castOther.getCtnFlg())))
				&& ((this.getThreshPct() == castOther.getThreshPct()) || (this.getThreshPct() != null
						&& castOther.getThreshPct() != null && this.getThreshPct().equals(castOther.getThreshPct())))
				&& ((this.getCtnDstrFlg() == castOther.getCtnDstrFlg()) || (this.getCtnDstrFlg() != null
						&& castOther.getCtnDstrFlg() != null && this.getCtnDstrFlg().equals(castOther.getCtnDstrFlg())))
				&& ((this.getBulkPckFlg() == castOther.getBulkPckFlg()) || (this.getBulkPckFlg() != null
						&& castOther.getBulkPckFlg() != null && this.getBulkPckFlg().equals(castOther.getBulkPckFlg())))
				&& ((this.getInsDt() == castOther.getInsDt()) || (this.getInsDt() != null
						&& castOther.getInsDt() != null && this.getInsDt().equals(castOther.getInsDt())))
				&& ((this.getLastUpdDt() == castOther.getLastUpdDt()) || (this.getLastUpdDt() != null
						&& castOther.getLastUpdDt() != null && this.getLastUpdDt().equals(castOther.getLastUpdDt())))
				&& ((this.getInsUserId() == castOther.getInsUserId()) || (this.getInsUserId() != null
						&& castOther.getInsUserId() != null && this.getInsUserId().equals(castOther.getInsUserId())))
				&& ((this.getLastUpdUserId() == castOther.getLastUpdUserId())
						|| (this.getLastUpdUserId() != null && castOther.getLastUpdUserId() != null
								&& this.getLastUpdUserId().equals(castOther.getLastUpdUserId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPrtnum() == null ? 0 : this.getPrtnum().hashCode());
		result = 37 * result + (getFtpcod() == null ? 0 : this.getFtpcod().hashCode());
		result = 37 * result + (getPrtClientId() == null ? 0 : this.getPrtClientId().hashCode());
		result = 37 * result + (getWhId() == null ? 0 : this.getWhId().hashCode());
		result = 37 * result + (getUomcod() == null ? 0 : this.getUomcod().hashCode());
		result = 37 * result + (getUomlvl() == null ? 0 : this.getUomlvl().hashCode());
		result = 37 * result + (getLen() == null ? 0 : this.getLen().hashCode());
		result = 37 * result + (getWid() == null ? 0 : this.getWid().hashCode());
		result = 37 * result + (getHgt() == null ? 0 : this.getHgt().hashCode());
		result = 37 * result + (getGrswgt() == null ? 0 : this.getGrswgt().hashCode());
		result = 37 * result + (getNetwgt() == null ? 0 : this.getNetwgt().hashCode());
		result = 37 * result + (getPalFlg() == null ? 0 : this.getPalFlg().hashCode());
		result = 37 * result + (getCasFlg() == null ? 0 : this.getCasFlg().hashCode());
		result = 37 * result + (getPakFlg() == null ? 0 : this.getPakFlg().hashCode());
		result = 37 * result + (getStkFlg() == null ? 0 : this.getStkFlg().hashCode());
		result = 37 * result + (getRcvFlg() == null ? 0 : this.getRcvFlg().hashCode());
		result = 37 * result + (getUntqty() == null ? 0 : this.getUntqty().hashCode());
		result = 37 * result + (getCtnFlg() == null ? 0 : this.getCtnFlg().hashCode());
		result = 37 * result + (getThreshPct() == null ? 0 : this.getThreshPct().hashCode());
		result = 37 * result + (getCtnDstrFlg() == null ? 0 : this.getCtnDstrFlg().hashCode());
		result = 37 * result + (getBulkPckFlg() == null ? 0 : this.getBulkPckFlg().hashCode());
		result = 37 * result + (getInsDt() == null ? 0 : this.getInsDt().hashCode());
		result = 37 * result + (getLastUpdDt() == null ? 0 : this.getLastUpdDt().hashCode());
		result = 37 * result + (getInsUserId() == null ? 0 : this.getInsUserId().hashCode());
		result = 37 * result + (getLastUpdUserId() == null ? 0 : this.getLastUpdUserId().hashCode());
		return result;
	}

}