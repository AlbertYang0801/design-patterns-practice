package com.design.prototype.prototype.unsolved;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Albert
 * @date 2020/11/26 下午5:22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Sheep {

    private String name;
    private Integer age;
    private String color;

}
