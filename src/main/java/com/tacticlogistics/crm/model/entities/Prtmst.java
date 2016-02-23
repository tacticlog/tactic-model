package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Prtmst generated by hbm2java
 */
@Entity
@Table(name = "prtmst", schema = "dbo", catalog = "Tactic")
public class Prtmst implements java.io.Serializable {

	private PrtmstId id;

	public Prtmst() {
	}

	public Prtmst(PrtmstId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "prtnum", column = @Column(name = "prtnum", nullable = false) ),
			@AttributeOverride(name = "prtClientId", column = @Column(name = "prt_client_id", nullable = false) ),
			@AttributeOverride(name = "whIdTmpl", column = @Column(name = "wh_id_tmpl", nullable = false) ),
			@AttributeOverride(name = "comcod", column = @Column(name = "comcod") ),
			@AttributeOverride(name = "subcfg", column = @Column(name = "subcfg") ),
			@AttributeOverride(name = "scfpos", column = @Column(name = "scfpos") ),
			@AttributeOverride(name = "dtlcfg", column = @Column(name = "dtlcfg") ),
			@AttributeOverride(name = "dcfpos", column = @Column(name = "dcfpos") ),
			@AttributeOverride(name = "typcod", column = @Column(name = "typcod") ),
			@AttributeOverride(name = "prtfam", column = @Column(name = "prtfam") ),
			@AttributeOverride(name = "dspPrtnum", column = @Column(name = "dsp_prtnum") ),
			@AttributeOverride(name = "agePflnam", column = @Column(name = "age_pflnam") ),
			@AttributeOverride(name = "lodlvl", column = @Column(name = "lodlvl", nullable = false) ),
			@AttributeOverride(name = "orgflg", column = @Column(name = "orgflg", nullable = false) ),
			@AttributeOverride(name = "revflg", column = @Column(name = "revflg", nullable = false) ),
			@AttributeOverride(name = "lotflg", column = @Column(name = "lotflg", nullable = false) ),
			@AttributeOverride(name = "supLotFlg", column = @Column(name = "sup_lot_flg", nullable = false) ),
			@AttributeOverride(name = "untcst", column = @Column(name = "untcst", scale = 4) ),
			@AttributeOverride(name = "reoqty", column = @Column(name = "reoqty") ),
			@AttributeOverride(name = "reopnt", column = @Column(name = "reopnt") ),
			@AttributeOverride(name = "stkuom", column = @Column(name = "stkuom") ),
			@AttributeOverride(name = "untInsVal", column = @Column(name = "unt_ins_val", scale = 4) ),
			@AttributeOverride(name = "relVal", column = @Column(name = "rel_val", scale = 4) ),
			@AttributeOverride(name = "relValUntTyp", column = @Column(name = "rel_val_unt_typ") ),
			@AttributeOverride(name = "abccod", column = @Column(name = "abccod") ),
			@AttributeOverride(name = "fifwin", column = @Column(name = "fifwin") ),
			@AttributeOverride(name = "timcod", column = @Column(name = "timcod") ),
			@AttributeOverride(name = "velzon", column = @Column(name = "velzon") ),
			@AttributeOverride(name = "rcvsts", column = @Column(name = "rcvsts") ),
			@AttributeOverride(name = "rsvuom", column = @Column(name = "rsvuom") ),
			@AttributeOverride(name = "rcvflg", column = @Column(name = "rcvflg") ),
			@AttributeOverride(name = "prdflg", column = @Column(name = "prdflg") ),
			@AttributeOverride(name = "ltlcls", column = @Column(name = "ltlcls") ),
			@AttributeOverride(name = "wipPrtflg", column = @Column(name = "wip_prtflg") ),
			@AttributeOverride(name = "dtcflg", column = @Column(name = "dtcflg") ),
			@AttributeOverride(name = "cnzflg", column = @Column(name = "cnzflg") ),
			@AttributeOverride(name = "cnzamt", column = @Column(name = "cnzamt", scale = 4) ),
			@AttributeOverride(name = "catchCod", column = @Column(name = "catch_cod") ),
			@AttributeOverride(name = "avgCatch", column = @Column(name = "avg_catch") ),
			@AttributeOverride(name = "catchUnttyp", column = @Column(name = "catch_unttyp") ),
			@AttributeOverride(name = "catchUntwgt", column = @Column(name = "catch_untwgt", scale = 4) ),
			@AttributeOverride(name = "catchUntcst", column = @Column(name = "catch_untcst", scale = 4) ),
			@AttributeOverride(name = "minCatchQty", column = @Column(name = "min_catch_qty", scale = 4) ),
			@AttributeOverride(name = "maxCatchQty", column = @Column(name = "max_catch_qty", scale = 4) ),
			@AttributeOverride(name = "stccod", column = @Column(name = "stccod") ),
			@AttributeOverride(name = "parcelFlg", column = @Column(name = "parcel_flg") ),
			@AttributeOverride(name = "hazmatFlg", column = @Column(name = "hazmat_flg") ),
			@AttributeOverride(name = "insflg", column = @Column(name = "insflg") ),
			@AttributeOverride(name = "nstcls", column = @Column(name = "nstcls") ),
			@AttributeOverride(name = "serTyp", column = @Column(name = "ser_typ") ),
			@AttributeOverride(name = "serLvl", column = @Column(name = "ser_lvl") ),
			@AttributeOverride(name = "prtDisp", column = @Column(name = "prt_disp") ),
			@AttributeOverride(name = "prtDisptn", column = @Column(name = "prt_disptn") ),
			@AttributeOverride(name = "lotFmtId", column = @Column(name = "lot_fmt_id") ),
			@AttributeOverride(name = "wgtcod", column = @Column(name = "wgtcod") ),
			@AttributeOverride(name = "lodTagEncode", column = @Column(name = "lod_tag_encode") ),
			@AttributeOverride(name = "subTagEncode", column = @Column(name = "sub_tag_encode") ),
			@AttributeOverride(name = "coPrefixLen", column = @Column(name = "co_prefix_len") ),
			@AttributeOverride(name = "deptCod", column = @Column(name = "dept_cod") ),
			@AttributeOverride(name = "timeToWarnForExp", column = @Column(name = "time_to_warn_for_exp") ),
			@AttributeOverride(name = "prtadjflg", column = @Column(name = "prtadjflg") ),
			@AttributeOverride(name = "cntbckEnaFlg", column = @Column(name = "cntbck_ena_flg") ),
			@AttributeOverride(name = "cntThrCst", column = @Column(name = "cnt_thr_cst", scale = 4) ),
			@AttributeOverride(name = "cntThrUnit", column = @Column(name = "cnt_thr_unit") ),
			@AttributeOverride(name = "prtstyle", column = @Column(name = "prtstyle") ),
			@AttributeOverride(name = "prtfit", column = @Column(name = "prtfit") ),
			@AttributeOverride(name = "prtcolor", column = @Column(name = "prtcolor") ),
			@AttributeOverride(name = "prtsize", column = @Column(name = "prtsize") ),
			@AttributeOverride(name = "pckStealFlg", column = @Column(name = "pck_steal_flg") ),
			@AttributeOverride(name = "boxPckFlg", column = @Column(name = "box_pck_flg") ),
			@AttributeOverride(name = "moddte", column = @Column(name = "moddte", length = 23) ),
			@AttributeOverride(name = "modUsrId", column = @Column(name = "mod_usr_id") ),
			@AttributeOverride(name = "crncyCode", column = @Column(name = "crncy_code") ),
			@AttributeOverride(name = "htsnum", column = @Column(name = "htsnum") ),
			@AttributeOverride(name = "schedbnum", column = @Column(name = "schedbnum") ),
			@AttributeOverride(name = "UVersion", column = @Column(name = "u_version") ),
			@AttributeOverride(name = "insDt", column = @Column(name = "ins_dt", length = 23) ),
			@AttributeOverride(name = "lastUpdDt", column = @Column(name = "last_upd_dt", length = 23) ),
			@AttributeOverride(name = "insUserId", column = @Column(name = "ins_user_id") ),
			@AttributeOverride(name = "lastUpdUserId", column = @Column(name = "last_upd_user_id") ),
			@AttributeOverride(name = "btoSubstPrtnum", column = @Column(name = "bto_subst_prtnum") ),
			@AttributeOverride(name = "btoObsoFlg", column = @Column(name = "bto_obso_flg", nullable = false) ),
			@AttributeOverride(name = "dspuom", column = @Column(name = "dspuom") ),
			@AttributeOverride(name = "rptuom", column = @Column(name = "rptuom") ),
			@AttributeOverride(name = "ignoreConFlg", column = @Column(name = "ignore_con_flg", nullable = false) ),
			@AttributeOverride(name = "prcForRpsFlg", column = @Column(name = "prc_for_rps_flg", nullable = false) ),
			@AttributeOverride(name = "absOrdinvWin", column = @Column(name = "abs_ordinv_win") ),
			@AttributeOverride(name = "absOrdinvCode", column = @Column(name = "abs_ordinv_code") ),
			@AttributeOverride(name = "threshPckVar", column = @Column(name = "thresh_pck_var", nullable = false, scale = 4) ),
			@AttributeOverride(name = "dteWinTyp", column = @Column(name = "dte_win_typ") ),
			@AttributeOverride(name = "dteCode", column = @Column(name = "dte_code") ),
			@AttributeOverride(name = "attrStr1", column = @Column(name = "attr_str1", nullable = false) ),
			@AttributeOverride(name = "attrStr2", column = @Column(name = "attr_str2", nullable = false) ),
			@AttributeOverride(name = "attrStr3", column = @Column(name = "attr_str3", nullable = false) ),
			@AttributeOverride(name = "attrStr4", column = @Column(name = "attr_str4", nullable = false) ),
			@AttributeOverride(name = "attrStr5", column = @Column(name = "attr_str5", nullable = false) ),
			@AttributeOverride(name = "attrStr6", column = @Column(name = "attr_str6", nullable = false) ),
			@AttributeOverride(name = "attrStr7", column = @Column(name = "attr_str7", nullable = false) ),
			@AttributeOverride(name = "attrStr8", column = @Column(name = "attr_str8", nullable = false) ),
			@AttributeOverride(name = "attrStr9", column = @Column(name = "attr_str9", nullable = false) ),
			@AttributeOverride(name = "attrStr10", column = @Column(name = "attr_str10", nullable = false) ),
			@AttributeOverride(name = "attrStr11", column = @Column(name = "attr_str11", nullable = false) ),
			@AttributeOverride(name = "attrStr12", column = @Column(name = "attr_str12", nullable = false) ),
			@AttributeOverride(name = "attrStr13", column = @Column(name = "attr_str13", nullable = false) ),
			@AttributeOverride(name = "attrStr14", column = @Column(name = "attr_str14", nullable = false) ),
			@AttributeOverride(name = "attrStr15", column = @Column(name = "attr_str15", nullable = false) ),
			@AttributeOverride(name = "attrStr16", column = @Column(name = "attr_str16", nullable = false) ),
			@AttributeOverride(name = "attrStr17", column = @Column(name = "attr_str17", nullable = false) ),
			@AttributeOverride(name = "attrStr18", column = @Column(name = "attr_str18", nullable = false) ),
			@AttributeOverride(name = "attrInt1", column = @Column(name = "attr_int1", nullable = false) ),
			@AttributeOverride(name = "attrInt2", column = @Column(name = "attr_int2", nullable = false) ),
			@AttributeOverride(name = "attrInt3", column = @Column(name = "attr_int3", nullable = false) ),
			@AttributeOverride(name = "attrInt4", column = @Column(name = "attr_int4", nullable = false) ),
			@AttributeOverride(name = "attrInt5", column = @Column(name = "attr_int5", nullable = false) ),
			@AttributeOverride(name = "attrFlt1", column = @Column(name = "attr_flt1", nullable = false) ),
			@AttributeOverride(name = "attrFlt2", column = @Column(name = "attr_flt2", nullable = false) ),
			@AttributeOverride(name = "attrFlt3", column = @Column(name = "attr_flt3", nullable = false) ),
			@AttributeOverride(name = "attrDte1", column = @Column(name = "attr_dte1", nullable = false) ),
			@AttributeOverride(name = "attrDte2", column = @Column(name = "attr_dte2", nullable = false) ),
			@AttributeOverride(name = "cstmsItmTyp", column = @Column(name = "cstms_itm_typ") ),
			@AttributeOverride(name = "cstmsCrncy", column = @Column(name = "cstms_crncy") ),
			@AttributeOverride(name = "dfltOrgcod", column = @Column(name = "dflt_orgcod") ),
			@AttributeOverride(name = "cstmsVatCod", column = @Column(name = "cstms_vat_cod") ),
			@AttributeOverride(name = "dtyStmpTrkFlg", column = @Column(name = "dty_stmp_trk_flg", nullable = false) ),
			@AttributeOverride(name = "cstmsCst", column = @Column(name = "cstms_cst") ),
			@AttributeOverride(name = "cstmsCmmdtyCod", column = @Column(name = "cstms_cmmdty_cod") ),
			@AttributeOverride(name = "altPrtTyp", column = @Column(name = "alt_prt_typ") ),
			@AttributeOverride(name = "velzonRecalcFlg", column = @Column(name = "velzon_recalc_flg", nullable = false) ),
			@AttributeOverride(name = "ordinv", column = @Column(name = "ordinv") ),
			@AttributeOverride(name = "pakflg", column = @Column(name = "pakflg", nullable = false) ),
			@AttributeOverride(name = "shelfLife", column = @Column(name = "shelf_life") ),
			@AttributeOverride(name = "shelfTimecode", column = @Column(name = "shelf_timecode") ) })
	public PrtmstId getId() {
		return this.id;
	}

	public void setId(PrtmstId id) {
		this.id = id;
	}

}