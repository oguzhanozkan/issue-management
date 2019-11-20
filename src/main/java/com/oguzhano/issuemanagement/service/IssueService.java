package com.oguzhano.issuemanagement.service;

import com.oguzhano.issuemanagement.dto.IssueDto;
import com.oguzhano.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);
}
