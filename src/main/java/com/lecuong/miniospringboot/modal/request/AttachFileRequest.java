package com.lecuong.miniospringboot.modal.request;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author CuongLM18
 * @created 11/11/2022 - 11:00 AM
 * @project minio-springboot
 */
@Data
public class AttachFileRequest {

    private String title;

    private String description;

    @SuppressWarnings("java:S1948")
    private MultipartFile[] file;
}
