package org.dubbo.api.dto;

import java.io.Serializable;


/**
 * <p>
 * 用户DTO
 * </p>
 *
 * @author author
 * @since 2020-04-21
 */
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 登陆名称
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
        "}";
    }
}
