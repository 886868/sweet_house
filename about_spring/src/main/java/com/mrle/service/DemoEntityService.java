package com.mrle.service;

import com.mrle.entity.DemoEntity;

import java.util.Optional;

public interface DemoEntityService {
    Optional<DemoEntity> findBySeq(Integer seq);
    DemoEntity save(DemoEntity demoModel);
}
