
CREATE TABLE t_user
(
	name varchar2(20) NOT NULL,
	phone varchar2(20),
	birth number(4)
);

insert into t_user(name, phone, birth)
values('김기열', '010-111-1111', 1989);

insert into t_user(name, phone, birth)
values('조니뎁', '010-111-1112', 1970);

insert into t_user(name, phone, birth)
values('원빈', '010-111-1112', 1978);

select * from t_user;
commit

