package com.lecuong.miniospringboot.modal.response;

import lombok.Builder;
import lombok.Data;

import java.io.InputStream;

/**
 * @author CuongLM18
 * @created 11/11/2022 - 11:01 AM
 * @project minio-springboot
 */
@Data
public class AttachFileResponse {

    private Long id;
    private String title;
    private String description;
    private String fileName;
    private String uri;
    private long size;
    private InputStream inputStream;
}
