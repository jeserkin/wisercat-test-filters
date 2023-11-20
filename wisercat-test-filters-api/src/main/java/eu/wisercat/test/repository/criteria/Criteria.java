package eu.wisercat.test.repository.criteria;

import eu.wisercat.test.repository.filter.Filter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "criteria")
public class Criteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "filter_id")
    private Filter filter;

    @Column(nullable = false, name = "criteria_type")
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(nullable = false, name = "criteria_parameter")
    @Enumerated(EnumType.STRING)
    private Parameter parameter;

    @Column(nullable = false, name = "criteria_value")
    private String value;

    public enum Type {
        AMOUNT,
        TITLE,
        DATE
    }

    public enum Parameter {
        MORE,
        LESS,
        FROM,
        TO,
        STARTS_WITH,
        ENDS_WITH
    }
}
