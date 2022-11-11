package com.lecuong.miniospringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author CuongLM18
 * @created 10/11/2022 - 5:02 PM
 * @project minio-springboot
 */
@Entity
@Table(name = "attach_file")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttachFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "file_name", length = 200)
    private String fileName;

    @Column(name = "url", length = 200)
    private String uri;

    @Column(name = "size")
    private Long size;
}
