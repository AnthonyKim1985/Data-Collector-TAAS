package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Anthony Jinhyuk Kim on 2017-07-05.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultValue implements Serializable {
    private PaginationInfo paginationInfo;
    private String accidentCriteria;
    private List<AccidentInfo> accidentInfoList;
}
