package com.yune.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.List;

/**
 *
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode()
public class OrderDto {
    @ApiModelProperty(value = "itemId")
    @Null(message="{id.null}")
    @NotNull(message="{id.require}")
    private Long id;

    @ApiModelProperty(value = "用户")
    private UserDto userDto;

    @ApiModelProperty(value = "菜单")
    private List<ItemDto> itemDtos;
}
