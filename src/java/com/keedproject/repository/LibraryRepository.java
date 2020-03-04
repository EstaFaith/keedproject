package com.keedproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keedproject.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, String>{

}
