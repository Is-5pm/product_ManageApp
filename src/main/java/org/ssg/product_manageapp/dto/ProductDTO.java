package org.ssg.product_manageapp.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Data
@Builder
@ToString
@NoArgsConstructor
public class ProductDTO {
    private Long pno;
    @NotEmpty
    private String pname;
    private Long price;
    private Integer pamount;
}
