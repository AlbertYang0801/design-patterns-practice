package com.design.principle.depeInversion.service.impl;

import com.design.principle.depeInversion.service.ITransportationService;
import org.springframework.stereotype.Service;

/**
 * @author Albert
 * @date 2020/11/5 16:40
 */
@Service
public class CarServiceImpl implements ITransportationService {

    @Override
    public String way() {
        return "汽车，出行，走在公路上";
    }


}
