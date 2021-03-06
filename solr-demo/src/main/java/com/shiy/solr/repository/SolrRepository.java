package com.shiy.solr.repository;

import com.shiy.solr.entity.TestEntity;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DebugSy on 2017/11/24.
 */
public interface SolrRepository extends SolrCrudRepository<TestEntity, Integer> {

	@Transactional
	TestEntity findEntityByName(String name);

	List<TestEntity> findEntitysByDescendent(String descendent);

}
