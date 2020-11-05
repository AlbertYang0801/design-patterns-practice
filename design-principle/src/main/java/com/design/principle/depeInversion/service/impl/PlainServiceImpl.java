package com.design.principle.depeInversion.service.impl;

import com.design.principle.depeInversion.service.ITransportationService;
import org.springframework.stereotype.Service;

/**
 * @author Albert
 * @date 2020/11/5 16:40
 */
@Service
public class PlainServiceImpl implements ITransportationService {
    @Override
    public String way() {
        return "飞机，在天上飞";
    }
}
