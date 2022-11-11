package com.lecuong.miniospringboot.repository;

import com.lecuong.miniospringboot.entity.AttachFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author CuongLM18
 * @created 11/11/2022 - 11:11 AM
 * @project minio-springboot
 */
@Repository
public interface AttachFileRepository extends JpaRepository<AttachFile, Long> {
}
