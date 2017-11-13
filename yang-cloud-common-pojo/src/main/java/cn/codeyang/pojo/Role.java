package cn.codeyang.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangzhongyang on 17/11/11
 */
@Data
public class Role implements Serializable{
    private Long id;
    private String name;

    private List<Authority> authorities;
    private List<User> users;

}
