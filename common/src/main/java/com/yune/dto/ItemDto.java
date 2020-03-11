package com.yune.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 *
 */
@Data
public class ItemDto {
    @ApiModelProperty(value = "itemId")
//    @Null(message="{id.null}")
//    @NotNull(message="{id.require}")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "数量")
    private Integer number;

    public ItemDto(Long id, String name, Integer number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
}
