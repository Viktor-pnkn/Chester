insert into salons(address, phone) VALUES ('Новочеремушкинская улица, д.58', '+7(968)774-41-41');
insert into salons(address, phone) VALUES ('Проспект 60-лет Октября, д.16, к.1', '+7(967)774-41-41');

insert into users(type, name, email, phone, salon_id)
VALUES ('G', 'Новикова Ольга', 'novikova@mail.ru', '+7(917)542-45-54', 1);
insert into users(type, name, email, phone, salon_id)
VALUES ('G', 'Краснова Анна', 'krasnova@gmail.ru', '+7(909)612-12-98', 1);
insert into users(type, name, email, phone, salon_id)
VALUES ('G', 'Герасимова Анастасия', 'geranas@yandex.ru', '+7(915)224-51-15', 2);
insert into users(type, name, email, phone, salon_id)
VALUES ('G', 'Овечкина Лариса', 'ovechkalar@gmail.ru', '+7(909)412-59-16', 2);

insert into users(type, name, email, phone)
VALUES ('C', 'Иванов Андрей', 'andrivan@ya.ru', '+7(909)501-00-11');
insert into users(type, name, email, phone)
VALUES ('C', 'Титанов Колизей', 'titanpitan@mail.ru', '+7(999)123-31-87');
insert into users(type, name, email, phone)
VALUES ('C', 'Гордейчик Артем', 'triplelox@gmail.ru', '+7(916)423-99-11');

insert into pets(name, breed, age, category, owner_id)
VALUES ('Пати', 'Вельш-корги пемброк', 1, 2, 5);
insert into pets(name, breed, age, category, owner_id)
VALUES ('Максик', 'Лабрадор', 7, 3, 6);
insert into pets(name, breed, age, category, owner_id)
VALUES ('Роза', 'Йоркширский терьер', 9, 1, 6);
insert into pets(name, breed, age, category, owner_id)
VALUES ('Атос', 'Русский той-терьер', 3, 1, 7);

insert into procedures(name, price)
VALUES ('Вычесывание', 500);
insert into procedures(name, price)
VALUES ('Окантовка', 2000);
insert into procedures(name, price)
VALUES ('Креативный грумминг', 1700);
insert into procedures(name, price)
VALUES ('Стрижка под машинку', 2500);
insert into procedures(name, price)
VALUES ('Мытье с сушкой', 4000);
insert into procedures(name, price)
VALUES ('Окантовка лап', 350);
insert into procedures(name, price)
VALUES ('Пуделиные лапки', 200);

insert into intervals(start_time, end_time, groomer_id, procedure_id)
VALUES ('2021-08-22T12:00', '2021-08-22T12:30', 1, 3);
insert into intervals(start_time, end_time, groomer_id, procedure_id)
VALUES ('2021-08-22T14:00', '2021-08-22T14:30', 2, 1);
insert into intervals(start_time, end_time, groomer_id, procedure_id)
VALUES ('2021-08-22T10:30', '2021-08-22T11:30', 3, 4);
insert into intervals(start_time, end_time, groomer_id, procedure_id)
VALUES ('2021-08-22T15:00', '2021-08-22T16:00', 1, 7);