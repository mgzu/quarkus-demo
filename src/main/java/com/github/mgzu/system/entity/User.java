package com.github.mgzu.system.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author MaGuangZu
 * @since 2023-09-27
 */
@Setter
@Getter
@Table(name = "`USER`")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

}
