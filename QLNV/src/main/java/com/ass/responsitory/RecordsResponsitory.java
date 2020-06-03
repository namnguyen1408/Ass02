package com.ass.responsitory;

import com.ass.model.Records;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RecordsResponsitory extends CrudRepository<Records, Long> {
}
