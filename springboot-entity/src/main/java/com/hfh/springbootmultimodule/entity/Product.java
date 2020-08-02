package com.hfh.springbootmultimodule.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * Created by huangfuhua on 2019/4/25.
 */
@TableName("product")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @TableId(type = IdType.AUTO)
    private Long id;

    @NotBlank(message = "标题不能为空")
    private String name;

    private String price;
}
