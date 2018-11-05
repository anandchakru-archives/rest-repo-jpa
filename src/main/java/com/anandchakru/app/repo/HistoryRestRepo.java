package com.anandchakru.app.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.anandchakru.app.entity.History;

@RepositoryRestResource(path = "history")
public interface HistoryRestRepo extends PagingAndSortingRepository<History, Long> {
}