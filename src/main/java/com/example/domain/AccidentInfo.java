package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Anthony Jinhyuk Kim on 2017-07-05.
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
        return acdnt_no + "," +
                engn_code + "," +
                acdnt_year + "," +
                acdnt_dd_dc + "," +
                dfk_code + "," +
                dfk_dc + "," +
                tmzon_div_1_code + "," +
                tmzon_div_1_dc + "," +
                occrrnc_time_code + "," +
                occrrnc_time_dc + "," +
                legaldong_code + "," +
                legaldong_name + "," +
                acdnt_hcode + "," +
                acdnt_hdc + "," +
                acdnt_mcode + "," +
                acdnt_mdc + "," +
                acdnt_code + "," +
                acdnt_dc + "," +
                lrg_violt_1_code + "," +
                lrg_violt_1_dc + "," +
                x_crdnt + "," +
                y_crdnt + "," +
                wether_sttus_code + "," +
                wether_sttus_dc + "," +
                road_stle_code + "," +
                road_stle_dc + "," +
                hhdgw_at + "," +
                acdnt_gae_code + "," +
                acdnt_gae_dc + "," +
                dprs_cnt + "," +
                sep_cnt + "," +
                slp_cnt + "," +
                inj_aplcnt_cnt + "," +
                wrngdo_vhcle_asort_hcode + "," +
                wrngdo_vhcle_asort_hdc + "," +
                wrngdo_vhcle_asort_code + "," +
                wrngdo_vhcle_asort_dc + "," +
                injury_dgree_1_hcode + "," +
                injury_dgree_1_hdc + "," +
                injury_dgree_1_code + "," +
                injury_dgree_1_dc + "," +
                acdnt_age_1_code + "," +
                acdnt_age_1_dc + "," +
                sexdstn_div_1_code + "," +
                sexdstn_div_1_dc + "," +
                dmge_vhcle_asort_hcode + "," +
                dmge_vhcle_asort_hdc + "," +
                dmge_vhcle_asort_code + "," +
                dmge_vhcle_asort_dc + "," +
                injury_dgree_2_hcode + "," +
                injury_dgree_2_hdc + "," +
                injury_dgree_2_code + "," +
                injury_dgree_2_dc + "," +
                acdnt_age_2_code + "," +
                acdnt_age_2_dc + "," +
                sexdstn_div_2_code + "," +
                sexdstn_div_2_dc + "," +
                spt_otlnmap_at + "," +
                rdse_sttus_code + "," +
                rdse_sttus_dc + "," +
                acdnt_pos + "," +
                acdnt_des + "," +
                road_div + "," +
                road_no + "," +
                route_nm + "," +
                otn_acdnt_no + "," +
                city_idt_code + "," +
                city_idt_dc + "," +
                xCrdnt + "," +
                yCrdnt + "," +
                acdnt_frm_lv1 + "," +
                acdnt_frm_lv2 + "," +
                acdnt_frm_lv3 + "," +
                acdnt_sta_lv1 + "," +
                acdnt_sta_lv2 + "," +
                searchCondition + "," +
                pageIndex + "," +
                recordCountPerPage + "," +
                searchConditionText + "," +
                searchKeyword + "," +
                pageUnit + "," +
                zoneYn + "\r\n";
    }
}
