package com.github.hairless.plink.model.dto;

import com.github.hairless.plink.model.common.FlinkConfig;
import com.github.hairless.plink.model.pojo.Job;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;

/**
 * @author: silence
 * @date: 2020/1/17
 */
@Getter
@Setter
@NoArgsConstructor
public class JobDTO extends Job {
    private static final long serialVersionUID = 1L;

    @Valid
    private FlinkConfig config;

}
