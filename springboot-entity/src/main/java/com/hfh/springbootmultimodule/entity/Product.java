package com.hfh.springbootmultimodule.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
