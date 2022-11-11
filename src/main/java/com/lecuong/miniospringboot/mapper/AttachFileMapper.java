package com.lecuong.miniospringboot.mapper;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * @author CuongLM18
 * @created 10/11/2022 - 5:20 PM
 * @project minio-springboot
 */
@Component
@AllArgsConstructor
public class AttachFileMapper {

    private ModelMapper modelMapper;

    public com.lecuong.miniospringboot.entity.AttachFile to(AttachFileDTO attachFileRequest) {
        return modelMapper.map(attachFileRequest, com.lecuong.miniospringboot.entity.AttachFile.class);
    }
}
