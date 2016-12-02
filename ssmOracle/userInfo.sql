create table userInfo
(
       userId int primary key,
       userName varchar2(20),
       userPwd varchar2(20)
);

create sequence seq_userId start with 1;

insert into userInfo values(seq_userId.Nextval,'admin','123456');
insert into userInfo values(seq_userId.Nextval,'admin2','123456');
insert into userInfo values(seq_userId.Nextval,'admin3','123456');

select * from userInfo;
