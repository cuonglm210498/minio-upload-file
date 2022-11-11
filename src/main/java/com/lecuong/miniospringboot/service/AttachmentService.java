package com.lecuong.miniospringboot.service;

import com.lecuong.miniospringboot.modal.request.AttachFileRequest;
import com.lecuong.miniospringboot.modal.response.AttachFileResponse;

import java.util.List;

/**
 * @author CuongLM18
 * @created 10/11/2022 - 4:38 PM
 * @project minio-springboot
 */
public interface AttachmentService {

    List<AttachFileResponse> uploadFile(AttachFileRequest request);

    void deleteFile(Long id);

    List<AttachFileResponse> getAllFile();

    AttachFileResponse getFileById(Long id);
}
