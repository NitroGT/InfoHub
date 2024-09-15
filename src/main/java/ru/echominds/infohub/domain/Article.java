package ru.echominds.infohub.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Article extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Long views;

    // Хз как сделаем теги

    // +1 и -1
    @OneToMany(mappedBy = "article")
    private List<Rating> rating;

}
