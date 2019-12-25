package com.mrle.service.impl;

import com.mrle.dao.DemoEntityDao;
import com.mrle.entity.DemoEntity;
import com.mrle.service.DemoEntityService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoEntityServiceImpl implements DemoEntityService {

    private DemoEntityDao demoEntityDao;

    public DemoEntityServiceImpl(DemoEntityDao demoEntityDao){
        this.demoEntityDao = demoEntityDao;
    }

    @Override
    public Optional<DemoEntity> findBySeq(Integer seq) {
        return demoEntityDao.findById(seq);
    }


    @Override
    public DemoEntity save(DemoEntity demoModel) {
        return demoEntityDao.save(demoModel);
    }
}
