# mega_it_javafx_D
팀 프로젝트용
my sql 사용

-- 버스 정보 테이블<br>
create table root.bus_info(<br>
bus_code varchar(50) primary key, -- 차량 번호(<br>
seat varchar(20) not null, -- 좌석(<br>
driver_name varchar(20) not null -- 기사 이름(<br>
);<br>
<br>
-- 버스 현황 테이블<br>
create table root.bus_status(<br>
status_number int primary key auto_increment, -- 현황 번호(<br>
bus_code varchar(50),(<br>
departures varchar(100) not null, -- 출발지<br>
arrivals varchar(100) not null, -- 도착지<br>
departure_time date , -- 출발 시간<br>
arrival_time date, -- 도착 시간<br>
 foreign key(bus_code) references bus_info( bus_code)); -- 버스 정보 테이블의 bus_code를 외래키로 사용할 것임<br>
<br>

-- 발행 테이블<br>
create table root.dispenser( <br>
issuance_number int primary key auto_increment,-- 발행 번호<br>
bus_code varchar(50) not null, <br>
price int not null, -- 가격<br>
personnel int not null, -- 인원 수<br>
foreign key (bus_code) references bus_info(bus_code));-- 버스 정보 테이블의 bus_code를 외래키로 사용할 것임<br>
