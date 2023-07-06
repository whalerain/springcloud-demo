package com.github.whalerain.springbootkata.pojo.modelvo;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 *
 *
 * @author ZhangXi
 */
@Data
public class JsonData {

    private String strVal;

    private Integer intVal;

    private Boolean booleanVal;

    private Float floatVal;

    private Double doubleVal;

    private String[] strArrayVal;

    private List<String> strListVal;

    private Date dateVal;

    private Timestamp timestampVal;

    private LocalDate localDateVal;

    private LocalTime localTimeVal;

    private LocalDateTime localDateTimeVal;

    private Inner objVal;

    private List<Inner> objArrayVal;

    @Data
    public static class Inner {
        private Integer key;
        private String value;
    }

}
