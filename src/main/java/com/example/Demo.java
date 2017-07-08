package com.example;

import com.example.domain.AccidentInfo;
import com.example.domain.ResultValue;
import com.example.domain.Taas;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * Created by Anthony Jinhyuk Kim on 2017-07-05.
 * @Author Anthony Jinhyuk Kim, Jong-Seon Jang
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        final String targetUrl = "http://taas.koroad.or.kr/gis/srh/ash/selectAccidentInfo.do";

        for (int year = 2007; year <= 2016; year++) {
            final String fileName = String.format("result/%d.csv", year);
            write(fileName, getHeader());

            System.out.println(fileName + " Started.");

            final int LastPageIndex = writeResultValue(targetUrl, fileName, year, 1);
            for (int pageIndex = 2; pageIndex <= LastPageIndex; ++pageIndex)
                writeResultValue(targetUrl, fileName, year, pageIndex);
        }
    }

    private static String getHeader() {
        return "acdnt_no,engn_code,acdnt_year,acdnt_dd_dc,dfk_code,dfk_dc,tmzon_div_1_code,tmzon_div_1_dc,occrrnc_time_code,occrrnc_time_dc,legaldong_code,legaldong_name,acdnt_hcode,acdnt_hdc,acdnt_mcode,acdnt_mdc,acdnt_code,acdnt_dc,lrg_violt_1_code,lrg_violt_1_dc,x_crdnt,y_crdnt,wether_sttus_code,wether_sttus_dc,road_stle_code,road_stle_dc,hhdgw_at,acdnt_gae_code,acdnt_gae_dc,dprs_cnt,sep_cnt,slp_cnt,inj_aplcnt_cnt,wrngdo_vhcle_asort_hcode,wrngdo_vhcle_asort_hdc,wrngdo_vhcle_asort_code,wrngdo_vhcle_asort_dc,injury_dgree_1_hcode,injury_dgree_1_hdc,injury_dgree_1_code,injury_dgree_1_dc,acdnt_age_1_code,acdnt_age_1_dc,sexdstn_div_1_code,sexdstn_div_1_dc,dmge_vhcle_asort_hcode,dmge_vhcle_asort_hdc,dmge_vhcle_asort_code,dmge_vhcle_asort_dc,injury_dgree_2_hcode,injury_dgree_2_hdc,injury_dgree_2_code,injury_dgree_2_dc,acdnt_age_2_code,acdnt_age_2_dc,sexdstn_div_2_code,sexdstn_div_2_dc,spt_otlnmap_at,rdse_sttus_code,rdse_sttus_dc,acdnt_pos,acdnt_des,road_div,road_no,route_nm,otn_acdnt_no,city_idt_code,city_idt_dc,xCrdnt,yCrdnt,acdnt_frm_lv1,acdnt_frm_lv2,acdnt_frm_lv3,acdnt_sta_lv1,acdnt_sta_lv2\r\n";
    }

    private static int writeResultValue(String targetUrl, String fileName, int year, int pageIndex) throws Exception {
        HttpURLConnection httpURLConnection = getHttpURLConnection(targetUrl);

        Gson gson = new Gson();
        sendJson(httpURLConnection, pageIndex, year, year);
        String json = receiveJson(httpURLConnection);
        ResultValue resultValue = gson.fromJson(json, Taas.class).getResultValue();

        List<AccidentInfo> accidentInfoList = resultValue.getAccidentInfoList();

        StringBuilder accidentInfoBuilder = new StringBuilder();
        for (AccidentInfo accidentInfo : accidentInfoList)
            accidentInfoBuilder.append(accidentInfo.toString());

        write(fileName, accidentInfoBuilder.toString());

        return Integer.parseInt(resultValue.getPaginationInfo().getLastPageNo());
    }

    private static void write(String fileName, String text) throws Exception {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(text);
            fileWriter.flush();
        }
    }

    private static String receiveJson(HttpURLConnection httpURLConnection) throws Exception {
        String line;
        StringBuilder responseBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((httpURLConnection.getInputStream())))) {
            while ((line = bufferedReader.readLine()) != null)
                responseBuilder.append(line);
        }

        return responseBuilder.toString();
    }

    private static void sendJson(HttpURLConnection httpURLConnection, int pageIndex, int startAcdntYear, int endAcdntYear) throws Exception {
        final String StringFormat = "{\"searchType\":\"00\",\"pageIndex\":%d,\"zoneYn\":false,\"engnCode\":\"00\",\"startAcdntYear\":\"%d\",\"endAcdntYear\":\"%d\",\"roadDiv\":\"101\",\"routeName\":\"88올림픽고속도로,경부고속도로,경인고속도로,고속도로동로,고창담양고속도로,구암로1,금만로,남해고속도로,남해고속도로진입로,대전남부순환고속도로,대전당진고속도로,동해고속도로,마산외곽고속도로,마성로,무안-광주고속도로,부산울산고속도로,서변로,서울-춘천고속도로,서울외곽순환고속도로,서울외곽순환고속도로인접로,서천공주고속도로,서해안고속도로,수도권제2순환고속도로,순천완주고속도로,신천대로,영동고속도로,영동고속도로우회진입로,오산-화성고속도로,용인-서울고속도로,울산고속도로,익산포항고속도로,인천국제공항고속도로,일산IC,제2경인고속도로,제2남해고속도로,제2중부고속도로,중부고속도로,중부내륙고속도로,중부내륙고속도로지선,중부내륙고속도로진입로,중부내륙고속도로진출로,중앙고속도로,중앙고속도로지선,천안논산고속도로,청주-상주고속도로,평택-화성고속도로,평택음성간고속도로,호남고속도로,호남고속도로지선,호남고속도로지선-1,호성로\",\"acdntGaeCode\":\"01\"}";

        try (OutputStream outputStream = httpURLConnection.getOutputStream()) {
            outputStream.write(String.format(StringFormat, pageIndex, startAcdntYear, endAcdntYear).getBytes());
            outputStream.flush();
        }
    }

    private static HttpURLConnection getHttpURLConnection(String url) throws Exception {
        URL targetURL = new URL(url);
        URLConnection urlConnection = targetURL.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

        httpURLConnection.setRequestProperty("Host", "taas.koroad.or.kr");
        httpURLConnection.setRequestProperty("Connection", "keep-alive");
        httpURLConnection.setRequestProperty("Content-Length", "179");
        httpURLConnection.setRequestProperty("Accept", "application/json, text/javascript, */*; q=0.01");
        httpURLConnection.setRequestProperty("Origin", "http://taas.koroad.or.kr");
        httpURLConnection.setRequestProperty("X-Requested-With", "XMLHttpRequest");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36");
        httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
        httpURLConnection.setRequestProperty("Referer", "http://taas.koroad.or.kr/gis/mcm/mcl/initMap.do?menuId=GIS_GMP_STS_NTS");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
        httpURLConnection.setRequestProperty("Accept-Language", "ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4");
        httpURLConnection.setRequestMethod("POST");

        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDefaultUseCaches(false);

        return httpURLConnection;
    }
}