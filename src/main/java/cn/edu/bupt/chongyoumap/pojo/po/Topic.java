package cn.edu.bupt.chongyoumap.pojo.po;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "topic")
@Data
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "topic_id")
    private List<Post> posts;

}
