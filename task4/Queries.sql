--Напишіть запит, де буде account id, customer id і доступний залишок всіх рахунків,
--маючий статус 'ACTIVE' (активний) і доступний залишок понад 1000.

SELECT account_id, cust_id, avail_balance
FROM account
WHERE status = 'ACTIVE'
AND avail_balance > 1000;


--Напишіть запит, за яким для кожного клієнта фізичної особи (customer.cust_type_cd = 'I')
--повертаються ID рахунку,
--федеральний ID (Customer.fed_id) і тип створеного рахунку (product.name).

SELECT acc.account_id, cust.fed_id, prod.name
FROM account acc INNER JOIN customer cust ON acc.cust_id = cust.cust_id
INNER JOIN product prod ON acc.product_cd = prod.product_cd
WHERE cust.cust_type_cd = 'I';

