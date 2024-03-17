package org.ssg.product_manageapp.domain;

import lombok.*;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Getter
@Builder
@ToString
@NoArgsConstructor
public class ProductVO {
    private Long pno;
    private String pname;
    private Long price;
    private Integer pamount;
}
