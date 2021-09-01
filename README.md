# mega_it_javafx_D
팀 프로젝트용
my sql 사용

-- 버스 정보 테이블<br>
create table root.bus_info(
bus_code varchar(50) primary key, -- 차량 번호
seat varchar(20) not null, -- 좌석
driver_name varchar(20) not null -- 기사 이름
);

create table root.bus_status(
status_number int primary key auto_increment, -- 현황 번호
bus_code varchar(50),
departures varchar(100) not null, -- 출발지
arrivals varchar(100) not null, -- 도착지
departure_time date , -- 출발 시간
arrival_time date, -- 도착 시간
 foreign key(bus_code) references bus_info( bus_code)); -- 버스 정보 테이블의 bus_code를 외래키로 사용할 것임

create table root.dispenser (
issuance_number int primary key auto_increment,-- 발행 번호
bus_code varchar(50) not null, 
price int not null, -- 가격
personnel int not null, -- 인원 수
foreign key (bus_code) references bus_info(bus_code));-- 버스 정보 테이블의 bus_code를 외래키로 사용할 것임
