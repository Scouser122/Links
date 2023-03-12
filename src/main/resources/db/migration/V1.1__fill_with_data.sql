insert into page (id, title)
values
    (1, 'Главная'),
    (2, 'Новости');

insert into link (id, title, url, page_id)
values
    (nextval('link_seq'), 'Новости', '/page?name=news', 1),
    (nextval('link_seq'), 'Риа - новости Крыма', 'https://crimea.ria.ru/', 2),
    (nextval('link_seq'), 'Риа', 'https://ria.ru/', 2),
    (nextval('link_seq'), 'Корреспондент', 'https://ua.korrespondent.net/', 2);