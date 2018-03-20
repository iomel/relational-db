-- удаляет последние три колонки из таблицы Employees
ALTER TABLE EMPLOYEES
DROP (NOTES, REPORTSTO, PHOTO);

-- измененяет PK таблицы Suppliers с SupplierID на Phone
-- Так как РК нельзя изменить пока на него ссылается FK и РК может быть только один,
-- скрипт состоит из трех действий:
ALTER TABLE PRODUCTS
DROP CONSTRAINT SUPPLIER_FK;
ALTER TABLE SUPPLIERS
DROP CONSTRAINT SUPPLIER_ID;
ALTER TABLE SUPPLIERS
ADD CONSTRAINT PHONE_PK PRIMARY KEY (PHONE);

-- добавляет в таблицу Customers колонку IS_ACTIVE, которая должна принимать одно из двух значений - 0 или 1 и не быть пустой
-- Так как таблица уже создана, то для отсутствия пустых ячеек, мы присваиваем значение по умолчанию
ALTER TABLE CUSTOMERS
ADD IS_ACTIVE NUMBER DEFAULT 0 CHECK(IS_ACTIVE=0 OR IS_ACTIVE=1);

-- Обновите длину поля Picture в таблице Categories до 100 символов
ALTER TABLE CATEGORIES
MODIFY PICTURE VARCHAR2(100);
