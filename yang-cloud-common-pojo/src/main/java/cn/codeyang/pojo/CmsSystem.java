package cn.codeyang.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangzhongyang on 17/11/13
 */
@Data
public class CmsSystem implements Serializable{
    private Long systemId;

    private String name;

    private String code;

    private String description;

    private Date createTime;

    private Integer orderNum;
}
