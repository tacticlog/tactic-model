package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Prtfam generated by hbm2java
 */
@Entity
@Table(name = "prtfam", schema = "dbo", catalog = "Tactic")
public class Prtfam implements java.io.Serializable {

	private PrtfamId id;

	public Prtfam() {
	}

	public Prtfam(PrtfamId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "prtfam", column = @Column(name = "prtfam", nullable = false) ),
			@AttributeOverride(name = "brkStopSeqCod", column = @Column(name = "brk_stop_seq_cod") ),
			@AttributeOverride(name = "palThreshPct", column = @Column(name = "pal_thresh_pct") ),
			@AttributeOverride(name = "prtfamgrp", column = @Column(name = "prtfamgrp") ),
			@AttributeOverride(name = "moddte", column = @Column(name = "moddte", length = 23) ),
			@AttributeOverride(name = "modUsrId", column = @Column(name = "mod_usr_id") ) })
	public PrtfamId getId() {
		return this.id;
	}

	public void setId(PrtfamId id) {
		this.id = id;
	}

}
