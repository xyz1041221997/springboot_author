package cn.xyz.springboot_author.dao;

import cn.xyz.springboot_author.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public interface UserDao extends JpaRepository<User,Integer> {

    public User findByUsernameAndAndPassword(User user);
}
