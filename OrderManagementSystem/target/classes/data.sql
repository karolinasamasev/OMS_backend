-- create sequence "cus-gen" start with 1 increment by 50;
-- create sequence "ol-gen" start with 1 increment by 50;
-- create sequence "ord-gen" start with 1 increment by 50;
-- create sequence "prod-gen" start with 1 increment by 50;
--
--     create table customers (
--        id bigint not null,
--         email varchar(255),
--         full_name varchar(255),
--         registration_code varchar(255),
--         telephone varchar(255),
--         primary key (id)
--     );
--
--     create table orderlines (
--        id bigint not null,
--         quantity integer not null,
--         order_id bigint,
--         product_id bigint,
--         primary key (id)
--     );
--
--     create table orders (
--        id bigint not null,
--         date_of_submission date,
--         customer_id bigint,
--         primary key (id)
--     );
--
--     create table products (
--        id bigint not null,
--         name varchar(255),
--         sku_code varchar(255),
--         unit_price numeric(38,2),
--         primary key (id)
--     );
--
--     alter table if exists orderlines
--        add constraint FK34cuiq9mwpj5kg9kohioq7yth
--        foreign key (order_id)
--        references orders;
--
--     alter table if exists orderlines
--        add constraint FKnqge9l2xfbsjh03ju3nilbg5o
--        foreign key (product_id)
--        references products;
--
--     alter table if exists orders
--        add constraint FKpxtb8awmi0dk6smoh2vp1litg
--        foreign key (customer_id)
--        references customers;

insert into customers (id, full_name, email, telephone, registration_code)
values (1, 'Skipp Tointon', 'stointon0@newsvine.com', '2122435660', '64117-531'),
       (2, 'Adele Gallagher', 'amet@protonmail.couk', '105-843', '148'),
       (3, 'Neve Sanders', 'eget.varius@icloud.net', '451-057', '917'),
       (4, 'Leilani Bates', 'aliquet.metus@icloud.net', '275-737', '872'),
       (5, 'Kiara Mcdonald', 'felis.orci.adipiscing@protonmail.org', '636-181', '232'),
       (6, 'Elaine Watson', 'sociis@yahoo.org', '381-562', '136'),
       (7, 'Charissa Riley', 'aenean.eget@aol.couk', '346-158', '668'),
       (8, 'Shaine Ortega', 'nibh.donec.est@outlook.ca', '713-253', '275'),
       (9, 'Ann Velasquez', 'elit@aol.com', '522-331', '424'),
       (10, 'Tanek West', 'sit@google.edu', '393-641', '314'),
       (11, 'Omar Sullivan', 'etiam@icloud.couk', '622-737', '617'),
       (12, 'Kasimir Johnson', 'orci.luctus@hotmail.ca', '533-936', '637'),
       (13, 'Donna Jordan', 'pellentesque.sed.dictum@hotmail.net', '150-175', '696'),
       (14, 'Hasad Norman', 'luctus.et@yahoo.org', '684-122', '111'),
       (15, 'Cade Hull', 'nibh.quisque.nonummy@aol.com', '846-674', '370'),
        (16, 'Oki Sullan', 'etm@icloud.couk', '699-737', '689'),
       (17, 'Karina Johnson', 'orci.l@hotmail.ca', '533-736', '638'),
       (18, 'Donn Jorda', 'pellen.sed.dictum@hotmail.net', '151-176', '698'),
       (19, 'Hasadishka Normanki', 'luc.et@yahoo.org', '684-111', '112'),
       (20, 'Cadet Hullinet', 'nib.quis.nonummy@aol.com', '845-694', '371')
;


insert into products (id, name, sku_code, unit_price)
values (1, 'KBS Fashion Group Limited', '36987-3097', 72),
       (2, 'Cohen & Steers Quality Income Realty Fund Inc', '48951-1163', 75),
       (3, 'Genius Brands International, Inc.', '48951-1090', 42),
       (4, 'Lennar Corporation', '55154-6725', 98),
       (5, 'ESCO Technologies Inc.', '48433-322', 35),
       (6, 'Twitter, Inc.', '10742-0204', 13),
       (7, 'Park Sterling Corporation', '52125-877', 94),
       (8, 'Turtle Beach Corporation', '43199-016', 47),
       (9, 'Aegean Marine Petroleum Network Inc.', '68988-060', 77),
       (10, 'First Trust', '0597-0029', 37),
       (11, 'OFG Bancorp', '0054-0245', 58),
       (12, 'SodaStream International Ltd.', '49969-002', 40),
       (13, 'Meritage Corporation', '67938-1397', 19),
       (14, 'Accuray Incorporated', '58232-0603', 2),
       (15, 'Bio-Rad Laboratories, Inc.', '0363-5460', 71),
       (16, 'PowerShares S&P SmallCap Energy Portfolio', '0091-3715', 84),
       (17, 'Danaos Corporation', '0463-8000', 80),
       (18, 'Aratana Therapeutics, Inc.', '60429-725', 95),
       (19, 'Netshoes (Cayman) Limited', '43063-324', 88),
       (20, 'Five Below, Inc.', '44567-706', 54)
;

insert into orders (id, date_of_submission, customer_id)
values (1, '2022-10-14', 14),
       (2, '2022-09-15', 14),
       (3, '2022-06-21', 2),
       (4, '2023-02-14', 1),
       (5, '2022-06-19', 1),
       (6, '2023-01-30', 3),
       (7, '2022-11-11', 6),
       (8, '2022-08-19', 19),
       (9, '2022-06-04', 20),
       (10, '2023-01-24', 14),
       (11, '2023-02-25', 3),
       (12, '2022-10-05', 7),
       (13, '2022-11-21', 5),
       (14, '2023-03-29', 20),
       (15, '2022-11-26', 7),
       (16, '2022-05-17', 17),
       (17, '2022-11-29', 14),
       (18, '2022-11-24', 18),
       (19, '2022-07-27', 6),
       (20, '2022-08-23', 14)
;

insert into orderlines (id, quantity, order_id, product_id)
values (1, 10, 16, 1),
       (2, 18, 11, 9),
       (3, 18, 15, 12),
       (4, 5, 2, 15),
       (5, 9, 16, 6),
       (6, 13, 4, 2),
       (7, 8, 2, 7),
       (8, 6, 2, 4),
       (9, 5, 3, 12),
       (10, 11, 7, 15),
       (11, 4, 11, 16),
       (12, 19, 7, 18),
       (13, 10, 10, 11),
       (14, 20, 8, 13),
       (15, 8, 6, 19),
       (16, 5, 5, 1),
       (17, 16, 6, 5),
       (18, 1, 17, 16),
       (19, 13, 18, 9),
       (20, 5, 12, 16)
;
