package com.ass.responsitory;

import com.ass.model.Depart;
import com.ass.model.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StaffsResponsitory extends JpaRepository<Staffs,Long> {

//  Iterable<Staffs> findAllByDepart(Depart depart);

    @Query(value = "SELECT c FROM Staffs c WHERE c.name LIKE '%' || :keyword || '%'"
            )
    public List<Staffs> search(@Param("keyword") String keyword);
}
