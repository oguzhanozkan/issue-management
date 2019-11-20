package com.oguzhano.issuemanagement.service.impl;

import com.oguzhano.issuemanagement.dto.IssueDto;
import com.oguzhano.issuemanagement.entity.Issue;
import com.oguzhano.issuemanagement.repository.IssueRepository;
import com.oguzhano.issuemanagement.service.IssueService;
import com.oguzhano.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;


public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    private IssueServiceImpl(IssueRepository issueRepository,
                             ModelMapper modelMapper){
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issue) {

        if (issue.getDate() == null){
            throw new IllegalArgumentException("issue date can not be null");
        }
        Issue issueDb = modelMapper.map(issue, Issue.class);

        issueDb = issueRepository.save(issueDb);

        //issueDb issueDto yapiliyor

        return modelMapper.map(issueDb, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {

        Page<Issue> data = issueRepository.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(), IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
