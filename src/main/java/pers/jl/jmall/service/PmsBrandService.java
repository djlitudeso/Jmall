package pers.jl.jmall.service;

import pers.jl.jmall.mbg.entity.PmsBrand;

import java.util.List;

/**
 * @ClassName: PmsBrandService.java
 * @Description: TODO
 * @author: JL Du
 * @date: 2022/2/26 15:06
 * @version: 1.0.0
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}