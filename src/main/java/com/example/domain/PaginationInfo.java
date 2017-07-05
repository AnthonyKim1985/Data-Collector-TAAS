package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Anthony Jinhyuk Kim on 2017-07-05.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaginationInfo implements Serializable {
    private String firstPageNo;
    private String totalPageCount;
    private String currentPageNo;
    private String lastPageNo;
    private String totalRecordCount;
}
