package com.oguzhano.issuemanagement.repository;

import com.oguzhano.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
}
