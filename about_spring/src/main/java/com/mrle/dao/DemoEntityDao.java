package com.mrle.dao;

import com.mrle.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoEntityDao extends JpaRepository<DemoEntity, Integer> {
}
