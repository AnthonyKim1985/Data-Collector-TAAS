package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Anthony Jinhyuk Kim on 2017-07-05.
 * @Author Anthony Jinhyuk Kim, Jong-Seon Jang
 */
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AccidentInfo implements Serializable {
    private String acdnt_no;
    private String engn_code;
    private String acdnt_year;
    private String acdnt_dd_dc;
    private String dfk_code;
    private String dfk_dc;
    private String tmzon_div_1_code;
    private String tmzon_div_1_dc;
    private String occrrnc_time_code;
    private String occrrnc_time_dc;
    private String legaldong_code;
    private String legaldong_name;
    private String acdnt_hcode;
    private String acdnt_hdc;
    private String acdnt_mcode;
    private String acdnt_mdc;
    private String acdnt_code;
    private String acdnt_dc;
    private String lrg_violt_1_code;
    private String lrg_violt_1_dc;
    private String x_crdnt;
    private String y_crdnt;
    private String wether_sttus_code;
    private String wether_sttus_dc;
    private String road_stle_code;
    private String road_stle_dc;
    private String hhdgw_at;
    private String acdnt_gae_code;
    private String acdnt_gae_dc;
    private String dprs_cnt;
    private String sep_cnt;
    private String slp_cnt;
    private String inj_aplcnt_cnt;
    private String wrngdo_vhcle_asort_hcode;
    private String wrngdo_vhcle_asort_hdc;
    private String wrngdo_vhcle_asort_code;
    private String wrngdo_vhcle_asort_dc;
    private String injury_dgree_1_hcode;
    private String injury_dgree_1_hdc;
    private String injury_dgree_1_code;
    private String injury_dgree_1_dc;
    private String acdnt_age_1_code;
    private String acdnt_age_1_dc;
    private String sexdstn_div_1_code;
    private String sexdstn_div_1_dc;
    private String dmge_vhcle_asort_hcode;
    private String dmge_vhcle_asort_hdc;
    private String dmge_vhcle_asort_code;
    private String dmge_vhcle_asort_dc;
    private String injury_dgree_2_hcode;
    private String injury_dgree_2_hdc;
    private String injury_dgree_2_code;
    private String injury_dgree_2_dc;
    private String acdnt_age_2_code;
    private String acdnt_age_2_dc;
    private String sexdstn_div_2_code;
    private String sexdstn_div_2_dc;
    private String spt_otlnmap_at;
    private String rdse_sttus_code;
    private String rdse_sttus_dc;
    private String acdnt_pos;
    private String acdnt_des;
    private String road_div;
    private String road_no;
    private String route_nm;
    private String otn_acdnt_no;
    private String city_idt_code;
    private String city_idt_dc;
    private String xCrdnt;
    private String yCrdnt;
    private String acdnt_frm_lv1;
    private String acdnt_frm_lv2;
    private String acdnt_frm_lv3;
    private String acdnt_sta_lv1;
    private String acdnt_sta_lv2;
    private String searchCondition;
    private String pageIndex;
    private String recordCountPerPage;
    private String searchConditionText;
    private String searchKeyword;
    private String pageUnit;
    private String zoneYn;


    @Override
    public String toString() {
        return (acdnt_no == null ? null : acdnt_no.replaceAll("[,]", "")) + "," +
                (engn_code == null ? null : engn_code.replaceAll("[,]", "")) + "," +
                (acdnt_year == null ? null : acdnt_year.replaceAll("[,]", "")) + "," +
                (acdnt_dd_dc == null ? null : acdnt_dd_dc.replaceAll("[,]", "")) + "," +
                (dfk_code == null ? null : dfk_code.replaceAll("[,]", "")) + "," +
                (dfk_dc == null ? null : dfk_dc.replaceAll("[,]", "")) + "," +
                (tmzon_div_1_code == null ? null : tmzon_div_1_code.replaceAll("[,]", "")) + "," +
                (tmzon_div_1_dc == null ? null : tmzon_div_1_dc.replaceAll("[,]", "")) + "," +
                (occrrnc_time_code == null ? null : occrrnc_time_code.replaceAll("[,]", "")) + "," +
                (occrrnc_time_dc == null ? null : occrrnc_time_dc.replaceAll("[,]", "")) + "," +
                (legaldong_code == null ? null : legaldong_code.replaceAll("[,]", "")) + "," +
                (legaldong_name == null ? null : legaldong_name.replaceAll("[,]", "")) + "," +
                (acdnt_hcode == null ? null : acdnt_hcode.replaceAll("[,]", "")) + "," +
                (acdnt_hdc == null ? null : acdnt_hdc.replaceAll("[,]", "")) + "," +
                (acdnt_mcode == null ? null : acdnt_mcode.replaceAll("[,]", "")) + "," +
                (acdnt_mdc == null ? null : acdnt_mdc.replaceAll("[,]", "")) + "," +
                (acdnt_code == null ? null : acdnt_code.replaceAll("[,]", "")) + "," +
                (acdnt_dc == null ? null : acdnt_dc.replaceAll("[,]", "")) + "," +
                (lrg_violt_1_code == null ? null : lrg_violt_1_code.replaceAll("[,]", "")) + "," +
                (lrg_violt_1_dc == null ? null : lrg_violt_1_dc.replaceAll("[,]", "")) + "," +
                (x_crdnt == null ? null : x_crdnt.replaceAll("[,]", "")) + "," +
                (y_crdnt == null ? null : y_crdnt.replaceAll("[,]", "")) + "," +
                (wether_sttus_code == null ? null : wether_sttus_code.replaceAll("[,]", "")) + "," +
                (wether_sttus_dc == null ? null : wether_sttus_dc.replaceAll("[,]", "")) + "," +
                (road_stle_code == null ? null : road_stle_code.replaceAll("[,]", "")) + "," +
                (road_stle_dc == null ? null : road_stle_dc.replaceAll("[,]", "")) + "," +
                (hhdgw_at == null ? null : hhdgw_at.replaceAll("[,]", "")) + "," +
                (acdnt_gae_code == null ? null : acdnt_gae_code.replaceAll("[,]", "")) + "," +
                (acdnt_gae_dc == null ? null : acdnt_gae_dc.replaceAll("[,]", "")) + "," +
                (dprs_cnt == null ? null : dprs_cnt.replaceAll("[,]", "")) + "," +
                (sep_cnt == null ? null : sep_cnt.replaceAll("[,]", "")) + "," +
                (slp_cnt == null ? null : slp_cnt.replaceAll("[,]", "")) + "," +
                (inj_aplcnt_cnt == null ? null : inj_aplcnt_cnt.replaceAll("[,]", "")) + "," +
                (wrngdo_vhcle_asort_hcode == null ? null : wrngdo_vhcle_asort_hcode.replaceAll("[,]", "")) + "," +
                (wrngdo_vhcle_asort_hdc == null ? null : wrngdo_vhcle_asort_hdc.replaceAll("[,]", "")) + "," +
                (wrngdo_vhcle_asort_code == null ? null : wrngdo_vhcle_asort_code.replaceAll("[,]", "")) + "," +
                (wrngdo_vhcle_asort_dc == null ? null : wrngdo_vhcle_asort_dc.replaceAll("[,]", "")) + "," +
                (injury_dgree_1_hcode == null ? null : injury_dgree_1_hcode.replaceAll("[,]", "")) + "," +
                (injury_dgree_1_hdc == null ? null : injury_dgree_1_hdc.replaceAll("[,]", "")) + "," +
                (injury_dgree_1_code == null ? null : injury_dgree_1_code.replaceAll("[,]", "")) + "," +
                (injury_dgree_1_dc == null ? null : injury_dgree_1_dc.replaceAll("[,]", "")) + "," +
                (acdnt_age_1_code == null ? null : acdnt_age_1_code.replaceAll("[,]", "")) + "," +
                (acdnt_age_1_dc == null ? null : acdnt_age_1_dc.replaceAll("[,]", "")) + "," +
                (sexdstn_div_1_code == null ? null : sexdstn_div_1_code.replaceAll("[,]", "")) + "," +
                (sexdstn_div_1_dc == null ? null : sexdstn_div_1_dc.replaceAll("[,]", "")) + "," +
                (dmge_vhcle_asort_hcode == null ? null : dmge_vhcle_asort_hcode.replaceAll("[,]", "")) + "," +
                (dmge_vhcle_asort_hdc == null ? null : dmge_vhcle_asort_hdc.replaceAll("[,]", "")) + "," +
                (dmge_vhcle_asort_code == null ? null : dmge_vhcle_asort_code.replaceAll("[,]", "")) + "," +
                (dmge_vhcle_asort_dc == null ? null : dmge_vhcle_asort_dc.replaceAll("[,]", "")) + "," +
                (injury_dgree_2_hcode == null ? null : injury_dgree_2_hcode.replaceAll("[,]", "")) + "," +
                (injury_dgree_2_hdc == null ? null : injury_dgree_2_hdc.replaceAll("[,]", "")) + "," +
                (injury_dgree_2_code == null ? null : injury_dgree_2_code.replaceAll("[,]", "")) + "," +
                (injury_dgree_2_dc == null ? null : injury_dgree_2_dc.replaceAll("[,]", "")) + "," +
                (acdnt_age_2_code == null ? null : acdnt_age_2_code.replaceAll("[,]", "")) + "," +
                (acdnt_age_2_dc == null ? null : acdnt_age_2_dc.replaceAll("[,]", "")) + "," +
                (sexdstn_div_2_code == null ? null : sexdstn_div_2_code.replaceAll("[,]", "")) + "," +
                (sexdstn_div_2_dc == null ? null : sexdstn_div_2_dc.replaceAll("[,]", "")) + "," +
                (spt_otlnmap_at == null ? null : spt_otlnmap_at.replaceAll("[,]", "")) + "," +
                (rdse_sttus_code == null ? null : rdse_sttus_code.replaceAll("[,]", "")) + "," +
                (rdse_sttus_dc == null ? null : rdse_sttus_dc.replaceAll("[,]", "")) + "," +
                (acdnt_pos == null ? null : acdnt_pos.replaceAll("[,]", "")) + "," +
                (acdnt_des == null ? null : acdnt_des.replaceAll("[,]", "")) + "," +
                (road_div == null ? null : road_div.replaceAll("[,]", "")) + "," +
                (road_no == null ? null : road_no.replaceAll("[,]", "")) + "," +
                (route_nm == null ? null : route_nm.replaceAll("[,]", "")) + "," +
                (otn_acdnt_no == null ? null : otn_acdnt_no.replaceAll("[,]", "")) + "," +
                (city_idt_code == null ? null : city_idt_code.replaceAll("[,]", "")) + "," +
                (city_idt_dc == null ? null : city_idt_dc.replaceAll("[,]", "")) + "," +
                (xCrdnt == null ? null : xCrdnt.replaceAll("[,]", "")) + "," +
                (yCrdnt == null ? null : yCrdnt.replaceAll("[,]", "")) + "," +
                (acdnt_frm_lv1 == null ? null : acdnt_frm_lv1.replaceAll("[,]", "")) + "," +
                (acdnt_frm_lv2 == null ? null : acdnt_frm_lv2.replaceAll("[,]", "")) + "," +
                (acdnt_frm_lv3 == null ? null : acdnt_frm_lv3.replaceAll("[,]", "")) + "," +
                (acdnt_sta_lv1 == null ? null : acdnt_sta_lv1.replaceAll("[,]", "")) + "," +
                (acdnt_sta_lv2 == null ? null : acdnt_sta_lv2.replaceAll("[,]", "")) + "," +
                (searchCondition == null ? null : searchCondition.replaceAll("[,]", "")) + "," +
                (pageIndex == null ? null : pageIndex.replaceAll("[,]", "")) + "," +
                (recordCountPerPage == null ? null : recordCountPerPage.replaceAll("[,]", "")) + "," +
                (searchConditionText == null ? null : searchConditionText.replaceAll("[,]", "")) + "," +
                (searchKeyword == null ? null : searchKeyword.replaceAll("[,]", "")) + "," +
                (pageUnit == null ? null : pageUnit.replaceAll("[,]", "")) + "," +
                (zoneYn == null ? null : zoneYn.replaceAll("[,]", "")) + "\r\n";
    }
}
