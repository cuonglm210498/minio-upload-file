package com.lecuong.miniospringboot.controller;

import com.lecuong.miniospringboot.modal.request.AttachFileRequest;
import com.lecuong.miniospringboot.modal.response.AttachFileResponse;
import com.lecuong.miniospringboot.service.AttachmentService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author CuongLM18
 * @created 10/11/2022 - 4:37 PM
 * @project minio-springboot
 */
@RestController
@RequestMapping("/file")
public class AttachmentController {

    private final AttachmentService attachmentService;

    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    @PostMapping(value = "/upload")
    public ResponseEntity<Object> upload(@ModelAttribute AttachFileRequest request) {
        return ResponseEntity.ok().body(attachmentService.uploadFile(request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        attachmentService.deleteFile(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InputStreamResource> getFileById(@PathVariable Long id) {
        AttachFileResponse response = attachmentService.getFileById(id);
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachfile;filename=" + response.getFileName())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new InputStreamResource(response.getInputStream()));
    }
}
