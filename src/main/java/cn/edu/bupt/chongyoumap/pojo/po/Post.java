package cn.edu.bupt.chongyoumap.pojo.po;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "post")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 1024)
    private String content;

    @Column(length = 32)
    private String city;

    @Column(columnDefinition="double(10,6) default '0.000000'")
    private double latitude;

    @Column(columnDefinition = "double(10,6) default '0.000000'")
    private double longitude;

}
