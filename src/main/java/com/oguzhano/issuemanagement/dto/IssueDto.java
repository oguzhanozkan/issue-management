package com.oguzhano.issuemanagement.dto;

import com.oguzhano.issuemanagement.entity.IssueStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssueDto {

    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issuseStatus;
    private UserDto asignee;
    private ProjectDto project;

}
