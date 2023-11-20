package eu.wisercat.test.repository.filter;

import eu.wisercat.test.repository.criteria.Criteria;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "filter")
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filter", fetch = FetchType.EAGER)
    private List<Criteria> criteria;

    @Column(nullable = false, name = "filter_name")
    private String name;

    @Column(nullable = false, name = "filter_selection")
    private Integer selection;
}
