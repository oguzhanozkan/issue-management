package com.oguzhano.issuemanagement.service.impl;

import com.oguzhano.issuemanagement.entity.IssueHistory;
import com.oguzhano.issuemanagement.repository.IssueHistoryRepository;
import com.oguzhano.issuemanagement.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    private final IssueHistoryRepository issueHistoryRepository;

    private IssueHistoryServiceImpl(IssueHistoryRepository issueHistoryRepository){
        this.issueHistoryRepository = issueHistoryRepository;
    }


    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        //Business Logic
        if (issueHistory.getDate() == null){
            throw new IllegalArgumentException("issue date can not be null");
        }

        return issueHistoryRepository.save(issueHistory);
    }

    @Override
    public IssueHistory getById(Long id) {
        return issueHistoryRepository.getOne(id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return issueHistoryRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
        issueHistoryRepository.delete(issueHistory);
        return Boolean.TRUE;
    }
}
