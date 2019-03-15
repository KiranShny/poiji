package com.poiji.util;

import java.time.format.DateTimeFormatter;

/**
 * Created by hakan on 15/10/2017
 */
public final class PoijiConstants {

    public static final String DEFAULT_DATE_PATTERN = "dd/M/yyyy";
    public static final DateTimeFormatter DEFAULT_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/M/yyyy");
    public static final String XLS_EXTENSION = ".csv";
    public static final String XLSX_EXTENSION = ".xlsx";

    private PoijiConstants() {
    }

}
