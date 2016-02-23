package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrtfamId generated by hbm2java
 */
@Embeddable
public class PrtfamId implements java.io.Serializable {

	private Serializable prtfam;
	private Serializable brkStopSeqCod;
	private Integer palThreshPct;
	private Serializable prtfamgrp;
	private Date moddte;
	private Serializable modUsrId;

	public PrtfamId() {
	}

	public PrtfamId(Serializable prtfam) {
		this.prtfam = prtfam;
	}

	public PrtfamId(Serializable prtfam, Serializable brkStopSeqCod, Integer palThreshPct, Serializable prtfamgrp,
			Date moddte, Serializable modUsrId) {
		this.prtfam = prtfam;
		this.brkStopSeqCod = brkStopSeqCod;
		this.palThreshPct = palThreshPct;
		this.prtfamgrp = prtfamgrp;
		this.moddte = moddte;
		this.modUsrId = modUsrId;
	}

	@Column(name = "prtfam", nullable = false)
	public Serializable getPrtfam() {
		return this.prtfam;
	}

	public void setPrtfam(Serializable prtfam) {
		this.prtfam = prtfam;
	}

	@Column(name = "brk_stop_seq_cod")
	public Serializable getBrkStopSeqCod() {
		return this.brkStopSeqCod;
	}

	public void setBrkStopSeqCod(Serializable brkStopSeqCod) {
		this.brkStopSeqCod = brkStopSeqCod;
	}

	@Column(name = "pal_thresh_pct")
	public Integer getPalThreshPct() {
		return this.palThreshPct;
	}

	public void setPalThreshPct(Integer palThreshPct) {
		this.palThreshPct = palThreshPct;
	}

	@Column(name = "prtfamgrp")
	public Serializable getPrtfamgrp() {
		return this.prtfamgrp;
	}

	public void setPrtfamgrp(Serializable prtfamgrp) {
		this.prtfamgrp = prtfamgrp;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrtfamId))
			return false;
		PrtfamId castOther = (PrtfamId) other;

		return ((this.getPrtfam() == castOther.getPrtfam()) || (this.getPrtfam() != null
				&& castOther.getPrtfam() != null && this.getPrtfam().equals(castOther.getPrtfam())))
				&& ((this.getBrkStopSeqCod() == castOther.getBrkStopSeqCod())
						|| (this.getBrkStopSeqCod() != null && castOther.getBrkStopSeqCod() != null
								&& this.getBrkStopSeqCod().equals(castOther.getBrkStopSeqCod())))
				&& ((this.getPalThreshPct() == castOther.getPalThreshPct())
						|| (this.getPalThreshPct() != null && castOther.getPalThreshPct() != null
								&& this.getPalThreshPct().equals(castOther.getPalThreshPct())))
				&& ((this.getPrtfamgrp() == castOther.getPrtfamgrp()) || (this.getPrtfamgrp() != null
						&& castOther.getPrtfamgrp() != null && this.getPrtfamgrp().equals(castOther.getPrtfamgrp())))
				&& ((this.getModdte() == castOther.getModdte()) || (this.getModdte() != null
						&& castOther.getModdte() != null && this.getModdte().equals(castOther.getModdte())))
				&& ((this.getModUsrId() == castOther.getModUsrId()) || (this.getModUsrId() != null
						&& castOther.getModUsrId() != null && this.getModUsrId().equals(castOther.getModUsrId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPrtfam() == null ? 0 : this.getPrtfam().hashCode());
		result = 37 * result + (getBrkStopSeqCod() == null ? 0 : this.getBrkStopSeqCod().hashCode());
		result = 37 * result + (getPalThreshPct() == null ? 0 : this.getPalThreshPct().hashCode());
		result = 37 * result + (getPrtfamgrp() == null ? 0 : this.getPrtfamgrp().hashCode());
		result = 37 * result + (getModdte() == null ? 0 : this.getModdte().hashCode());
		result = 37 * result + (getModUsrId() == null ? 0 : this.getModUsrId().hashCode());
		return result;
	}

}