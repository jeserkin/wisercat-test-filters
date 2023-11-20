CREATE TABLE FILTER
(
    id               BIGSERIAL PRIMARY KEY,
    filter_name      VARCHAR(255),
    filter_selection SMALLINT
);

CREATE TABLE CRITERIA
(
    id                 BIGSERIAL PRIMARY KEY,
    filter_id          INTEGER     NOT NULL,
    criteria_type      VARCHAR(10) NOT NULL, -- 'Amount', 'Title', 'Date'
    criteria_parameter VARCHAR(20) NOT NULL, -- ['More', 'Less'], ['Starts with', 'Ends with'], ['From', 'To']
    criteria_value     VARCHAR(100),
    FOREIGN KEY (filter_id) REFERENCES FILTER (id)
);