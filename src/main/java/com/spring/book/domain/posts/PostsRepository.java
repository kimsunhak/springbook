package com.spring.book.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Repository interface 와 Entity Class 위치는 같아야 한다.
// JpaRepository<Entity Class, PK Type>
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
