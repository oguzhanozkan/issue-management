package com.oguzhano.issuemanagement.repository;

import com.oguzhano.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {


}
