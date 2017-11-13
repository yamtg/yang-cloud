package cn.codeyang.pojo;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * Created by yangzhongyang on 17/11/11
 */
@Data
public class Authority implements GrantedAuthority{
    private Long id;
    private String authority;
}
