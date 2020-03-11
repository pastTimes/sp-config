package com.yune.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 *
 */
@Data
@Accessors(chain = true)
public class UserDto {
    @ApiModelProperty(value = "itemId")
    @Null(message="{id.null}")
    @NotNull(message="{id.require}")
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

}
