package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 기본적인 CRUD 메서드는 JpaRepository에서 제공
    // 추가적인 쿼리 메서드를 정의할 수 있습니다.
}
