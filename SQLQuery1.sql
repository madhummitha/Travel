CREATE TABLE customer (
    ID int NOT NULL,
    userName varchar(50) NOT NULL,
    city varchar(50),
    PRIMARY KEY (ID)
);
Create Table driver ( 
ID int ,
driverName varchar(50) not null ,
gender varchar(50),
age int ,
PRIMARY KEY(ID)
);

Create Table car (
vehicleNo varchar(50),
vehicleModel varchar(50),
vehicleType varchar(50) not null,
vehicleColor varchar(50),
PRIMARY KEY(vehicleNo));

Create Table cityLocations (
city1 varchar(50) not null,
city2 varchar(50) not null,
distance int not null,
);

Create Table booking (
bookingNo int,
pickupFrom varchar(50) not null,
dropAt varchar(50) not null,
customerID int foreign key references customer(ID),
vehicleNo varchar(50) foreign key references car(vehicleNO),
diverID int foreign key references driver(ID),
fare decimal(7,2) not null,
Primary key(bookingNo)
);

Insert into customer values 
    (001,'Shin Chan','Kasukabe'),
    (007,'Chutki','Dholakpur');

INSERT into cityLocations values
    ('Chennai','Kochi',690),
    ('Kochi','Bangalore',548),
    ('Bangalore','Chennai',332);

Insert into car values
('TN01AB1234', '4 Seater','Sedan','White'),
('KA01CD9876','7 Seater','SUV','Red'),
('AP10EF0101', '9 Seater','SUV','Black');

Insert into driver values
(2001,'Chhota Bheem','M',23),
(2002,'Indumati','F',20);

Insert into booking values
(001,'Chennai','Bangalore',007,'TN01AB1234',2002,332),
(002,'Chenai','Kochi',001,'AP10EF0101',2001,667);

select * from customer 
where Id=1;

select * from car 
where vehicleNo='AP10EF0101'

select * from driver 
where Id=2002 

select distance from cityLocations 
where city1='Bangalore' and city2='Chennai' 

select * from booking 
where customerID=7

select * from booking 
where diverID=2002

select * from booking 
where vehicleNo='AP10EF0101'

SELECT booking.bookingNo, booking.pickupFrom, booking.dropAt, customer.userName, driver.driverName, car.vehicleType,
(case when car.vehicleType='4 Seater' then cityLocations.distance*11 
      else cityLocations.distance*1 end) as fare
FROM   booking full JOIN
                  car ON booking.vehicleNo = car.vehicleNo full JOIN
                  customer ON booking.customerID = customer.Id full JOIN
                  driver ON booking.customerID = driver.Id CROSS JOIN
                  cityLocations
where cityLocations.city1=booking.pickupFrom and cityLocations.city2=booking.dropAt;