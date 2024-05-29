
CREATE TABLE IF NOT EXISTS EXCHANGE_VALUE (
    id BIGINT PRIMARY KEY,
    currency_from VARCHAR(50),
    currency_to VARCHAR(50),
    conversion_multiple DECIMAL(10,2),
    port INT
);

insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port)
values(1001, 'USA', 'INR', 65, 0);

insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port)
values(1002, 'EUR', 'INR', 75, 0);

insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port)
values(1003, 'AUD', 'INR', 25, 0);
