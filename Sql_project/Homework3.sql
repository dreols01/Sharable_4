create database if not exists `FamilyFilm`;

use `FamilyFilm`;

create table `Customer` (
	CID int,
    Fname varchar(25),
    Lname varchar(25),
    Telephone varchar(25),
    primary key(CID)
    );
    
create table `Video` (
	VID int,
    Title varchar(25) not null,
    PurchDate date,
    `Condition` varchar(25),
    primary key(VID)
    ); 
    
create table `Rents` (
	VID int,
    CID int, 
    DateOut date,
    DateIn date, 
    foreign key(VID) references Video(VID),
    foreign key(CID) references Customer(CID),
    primary key(CID, VID, DateOut)
);

insert into `Customer` values(897987, "Ben","Tennyson", "986-294-0000");
insert into `Customer` values(434533, "Shiro","Emiya", "367-279-3433");
insert into `Customer` values(999999, "Kazuto","Kirigaya", "333-333-3333");
insert into `Customer` values(435534, "Ash","Ketchum", "693-256-4333");
insert into `Customer` values(777775, "Goku","Son", "888-888-9999");

insert into `Video` values(88888, "FANT4STIC", '2013-09-23', "Bad");
insert into `Video` values(44444, "Shang Chi", '2022-01-09', "Good");
insert into `Video` values(33333, "Deadpool", '2016-04-12', "Excellent");
insert into `Video` values(22222, "John Wick", '2014-12-5', "Excellent");
insert into `Video` values(11111, "The Hitman's Bodyguard", '2017-10-20', "Ok"); 

insert into `Rents` values(434533, 88888, '2017-09-21', '2017-09-25'); 
insert into `Rents` values(897987, 33333, '2019-10-01', '2020-01-02');
insert into `Rents` values(435534, 11111, '2018-05-01', '2018-05-20');


select `Customer`.`Fname`, `Customer`.`Lname`
from `Customer`, `Rents`, `Video`
where (`Customer`.`CID`=`Rents`.`CID`) & (`Video`.`VID` = `Rents`.`VID`);

alter table `Customer` add `zipcode` varchar(15);

update `Customer` set `zipcode` = "55901";

select *
from `Customer`;

UPDATE `Customer` SET `Telephone` = "783-208-9764" WHERE `Customer`.`Fname` = "Kazuto";

select *
from `Customer`;

select *, `Customer`.`CID` as Customer_ID
from `Customer`;













