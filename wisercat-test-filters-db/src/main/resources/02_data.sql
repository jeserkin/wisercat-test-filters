-- Fill all tables with test data here

INSERT INTO FILTER(id, filter_name, filter_selection)
VALUES (nextval('filter_id_seq'), 'Filter 1', 1),
       (nextval('filter_id_seq'), 'Filter 2', 3);

INSERT
INTO CRITERIA(id, filter_id, criteria_type, criteria_parameter, criteria_value)
VALUES (nextval('criteria_id_seq'), 1, 'AMOUNT', 'MORE', '35');

INSERT
INTO CRITERIA(id, filter_id, criteria_type, criteria_parameter, criteria_value)
VALUES (nextval('criteria_id_seq'), 2, 'DATE', 'FROM', '1912995045'),
       (nextval('criteria_id_seq'), 2, 'TITLE', 'ENDS_WITH', 'abc');