package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Prtftp generated by hbm2java
 */
@Entity
@Table(name = "prtftp", schema = "dbo", catalog = "Tactic")
public class Prtftp implements java.io.Serializable {

	private PrtftpId id;

	public Prtftp() {
	}

	public Prtftp(PrtftpId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "prtnum", column = @Column(name = "prtnum", nullable = false) ),
			@AttributeOverride(name = "ftpcod", column = @Column(name = "ftpcod", nullable = false) ),
			@AttributeOverride(name = "prtClientId", column = @Column(name = "prt_client_id", nullable = false) ),
			@AttributeOverride(name = "whId", column = @Column(name = "wh_id", nullable = false) ),
			@AttributeOverride(name = "caslvl", column = @Column(name = "caslvl") ),
			@AttributeOverride(name = "nstlen", column = @Column(name = "nstlen", scale = 4) ),
			@AttributeOverride(name = "nstwid", column = @Column(name = "nstwid", scale = 4) ),
			@AttributeOverride(name = "nsthgt", column = @Column(name = "nsthgt", scale = 4) ),
			@AttributeOverride(name = "palStckHgt", column = @Column(name = "pal_stck_hgt", nullable = false) ),
			@AttributeOverride(name = "defAssetTyp", column = @Column(name = "def_asset_typ") ),
			@AttributeOverride(name = "defftpFlg", column = @Column(name = "defftp_flg", nullable = false) ),
			@AttributeOverride(name = "stkmtd", column = @Column(name = "stkmtd") ),
			@AttributeOverride(name = "loadAttr1Cfg", column = @Column(name = "load_attr1_cfg") ),
			@AttributeOverride(name = "loadAttr2Cfg", column = @Column(name = "load_attr2_cfg") ),
			@AttributeOverride(name = "loadAttr3Cfg", column = @Column(name = "load_attr3_cfg") ),
			@AttributeOverride(name = "loadAttr4Cfg", column = @Column(name = "load_attr4_cfg") ),
			@AttributeOverride(name = "loadAttr5Cfg", column = @Column(name = "load_attr5_cfg") ),
			@AttributeOverride(name = "insDt", column = @Column(name = "ins_dt", length = 23) ),
			@AttributeOverride(name = "lastUpdDt", column = @Column(name = "last_upd_dt", length = 23) ),
			@AttributeOverride(name = "insUserId", column = @Column(name = "ins_user_id") ),
			@AttributeOverride(name = "lastUpdUserId", column = @Column(name = "last_upd_user_id") ) })
	public PrtftpId getId() {
		return this.id;
	}

	public void setId(PrtftpId id) {
		this.id = id;
	}

}
