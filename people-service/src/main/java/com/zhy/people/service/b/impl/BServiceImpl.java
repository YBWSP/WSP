package com.zhy.people.service.b.impl;

import com.zhy.people.beans.B;
import com.zhy.people.beans.BExample;
import com.zhy.people.mappers.BMapper;
import com.zhy.people.mappers.BMapperExt;
import com.zhy.people.service.b.IBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BServiceImpl implements IBService {

    @Autowired
    private BMapperExt bMapperExt;

    @Override
    public List<B> getAllB() {
        BExample bExample=new BExample();
        bExample.createCriteria().andIdEqualTo(1);
        return bMapperExt.selectByExample(bExample);
    }

}