-- 뷰티몰 DB 스키마
-- Oracle 기준

-- =====================
-- 기존 테이블 삭제 (재실행 대비)
-- =====================
DROP TABLE Delivery        CASCADE CONSTRAINTS;
DROP TABLE Order_Item      CASCADE CONSTRAINTS;
DROP TABLE Orders          CASCADE CONSTRAINTS;
DROP TABLE Product_Ingredient CASCADE CONSTRAINTS;
DROP TABLE Product         CASCADE CONSTRAINTS;
DROP TABLE Ingredient      CASCADE CONSTRAINTS;
DROP TABLE Customer        CASCADE CONSTRAINTS;

-- =====================
-- 테이블 생성
-- =====================

CREATE TABLE Customer (
    customer_id   VARCHAR2(10) PRIMARY KEY,
    name          VARCHAR2(50)  NOT NULL,
    email         VARCHAR2(100) NOT NULL UNIQUE,
    phone         VARCHAR2(11)  NOT NULL,
    skin_type     VARCHAR2(20),
    skin_concern  VARCHAR2(50)
);

CREATE TABLE Product (
    product_id  VARCHAR2(10) PRIMARY KEY,
    name        VARCHAR2(100) NOT NULL,
    brand       VARCHAR2(50)  NOT NULL,
    category    VARCHAR2(50)  NOT NULL,
    price       NUMBER           NOT NULL,
    stock       NUMBER           NOT NULL
);

CREATE TABLE Ingredient (
    ingredient_id  VARCHAR2(10) PRIMARY KEY,
    name           VARCHAR2(100) NOT NULL,
    function       VARCHAR2(50)    
);

CREATE TABLE Product_Ingredient (
    product_id     VARCHAR2(10),
    ingredient_id  VARCHAR2(10),
    PRIMARY KEY (product_id, ingredient_id),
    FOREIGN KEY (product_id)    REFERENCES Product(product_id),
    FOREIGN KEY (ingredient_id) REFERENCES Ingredient(ingredient_id)
);

CREATE TABLE Orders (
    order_id     VARCHAR2(10) PRIMARY KEY,
    customer_id  VARCHAR2(10)           NOT NULL,
    order_date   TIMESTAMP     DEFAULT SYSTIMESTAMP NOT NULL,
    total_price  NUMBER           NOT NULL,
    status       VARCHAR2(20)  DEFAULT '주문완료' NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
);

CREATE TABLE Order_Item (
    order_id    VARCHAR2(10),
    product_id  VARCHAR2(10),
    quantity    NUMBER NOT NULL,
    unit_price  NUMBER NOT NULL,
    PRIMARY KEY (order_id, product_id),
    FOREIGN KEY (order_id)   REFERENCES Orders(order_id),
    FOREIGN KEY (product_id) REFERENCES Product(product_id)
);

CREATE TABLE Delivery (
    delivery_id      VARCHAR2(10)         PRIMARY KEY,
    order_id        VARCHAR2(10)           NOT NULL,
    status           VARCHAR2(20)  DEFAULT '준비중' NOT NULL,
    delivered_at     TIMESTAMP,
    FOREIGN KEY (order_id) REFERENCES Orders(order_id)
);

COMMIT;

SELECT * FROM Customer;
SELECT * FROM order_item;
SELECT * FROM Product;
SELECT * FROM Product_INGREDIENT;
SELECT * FROM INGREDIENT;
SELECT * FROM ORDERS;
SELECT * FROM Delivery;

-- CUSTOMER
INSERT INTO Customer (customer_id, name, email, phone, skin_type, skin_concern) VALUES ('C001', '김민지', 'minji01@test.com', '01012345678', '건성', '미백');
INSERT INTO Customer (customer_id, name, email, phone, skin_type, skin_concern) VALUES ('C002', '이서연', 'seoyeon02@test.com', '01023456789', '지성', '트러블');
INSERT INTO Customer (customer_id, name, email, phone, skin_type, skin_concern) VALUES ('C003', '박지후', 'jihuu03@test.com', '01034567890', '복합성', '모공');
INSERT INTO Customer (customer_id, name, email, phone, skin_type, skin_concern) VALUES ('C004', '최유나', 'yuna04@test.com', '01045678901', '민감성', '진정');
INSERT INTO Customer (customer_id, name, email, phone, skin_type, skin_concern) VALUES ('C005', '정하늘', 'sky05@test.com', '01056789012', '건성', '주름');

-- PRODUCT
INSERT INTO Product (product_id, name, brand, category, price, stock) VALUES ('P001', '수분 진정 토너', '라운드랩', '스킨케어', 18000, 50);
INSERT INTO Product (product_id, name, brand, category, price, stock) VALUES ('P002', '비타민 세럼', '닥터지', '스킨케어', 25000, 30);
INSERT INTO Product (product_id, name, brand, category, price, stock) VALUES ('P003', '시카 크림', '메디힐', '스킨케어', 22000, 40);
INSERT INTO Product (product_id, name, brand, category, price, stock) VALUES ('P004', '쿠션 파운데이션', '롬앤', '메이크업', 27000, 25);
INSERT INTO Product (product_id, name, brand, category, price, stock) VALUES ('P005', '데일리 샴푸', '려', '헤어케어', 15000, 60);

-- INGREDIENT
INSERT INTO Ingredient (ingredient_id, name, function) VALUES ('I001', '히알루론산', '보습');
INSERT INTO Ingredient (ingredient_id, name, function) VALUES ('I002', '나이아신아마이드', '미백');
INSERT INTO Ingredient (ingredient_id, name, function) VALUES ('I003', '살리실산', '각질제거');
INSERT INTO Ingredient (ingredient_id, name, function) VALUES ('I004', '시카', '진정');
INSERT INTO Ingredient (ingredient_id, name, function) VALUES ('I005', '판테놀', '장벽강화');

-- PRODUCT_INGREDIENT
INSERT INTO Product_Ingredient VALUES ('P001', 'I001');
INSERT INTO Product_Ingredient VALUES ('P001', 'I004');
INSERT INTO Product_Ingredient VALUES ('P002', 'I002');
INSERT INTO Product_Ingredient VALUES ('P003', 'I004');
INSERT INTO Product_Ingredient VALUES ('P003', 'I005');
INSERT INTO Product_Ingredient VALUES ('P004', 'I002');
INSERT INTO Product_Ingredient VALUES ('P005', 'I005');

-- ORDERS
INSERT INTO Orders (order_id, customer_id, total_price, status) VALUES ('O001', 'C001', 43000, '주문완료');
INSERT INTO Orders (order_id, customer_id, total_price, status) VALUES ('O002', 'C002',  25000, '배송중');
INSERT INTO Orders (order_id, customer_id, total_price, status) VALUES ('O003', 'C003',  54000, '주문완료');

-- ORDER_ITEM
INSERT INTO Order_Item VALUES ('O001', 'P001', 1, 18000);
INSERT INTO Order_Item VALUES ('O001', 'P003', 1, 22000);
INSERT INTO Order_Item VALUES ('O002', 'P002', 1, 25000);
INSERT INTO Order_Item VALUES ('O003', 'P004', 2, 27000);

-- DELIVERY
INSERT INTO Delivery (delivery_id, order_id, status, delivered_at)
VALUES ('D001', 'O001','배송중', SYSDATE + 2);

INSERT INTO Delivery (delivery_id, order_id, status, delivered_at)
VALUES ('D002', 'O002','배송완료', SYSDATE + 1);

INSERT INTO Delivery (delivery_id, order_id, status, delivered_at)
VALUES ('D003', 'O003','준비중', SYSDATE + 3);
COMMIT;

SELECT * FROM Customer;
SELECT * FROM order_item;
SELECT * FROM Product;
SELECT * FROM Product_INGREDIENT;
SELECT * FROM INGREDIENT;
SELECT * FROM ORDERS;
SELECT * FROM Delivery;

DESC INGREDIENT;
DESC CUSTOMER;

-- =====================
-- 1. 주문 결과 출력
-- =====================
SELECT C.NAME 고객명, P.NAME 주문상품,
       I.QUANTITY 주문수량,
       TO_CHAR(I.UNIT_PRICE, '999,999') 가격,
       O.STATUS 주문상태, D.STATUS 배송상태
FROM CUSTOMER C
JOIN ORDERS O       ON C.CUSTOMER_ID = O.CUSTOMER_ID
JOIN ORDER_ITEM I   ON O.ORDER_ID = I.ORDER_ID
JOIN PRODUCT P      ON I.PRODUCT_ID = P.PRODUCT_ID
JOIN DELIVERY D     ON O.ORDER_ID = D.ORDER_ID;

-- =====================
-- 2. 상품 재고 관련
-- =====================
SELECT P.NAME 상품명, P.STOCK 현재재고,
       NVL(SUM(I.QUANTITY), 0) 판매수량,
       CASE WHEN P.STOCK <= 30 THEN 'Y' ELSE 'N' END 발주요망
FROM PRODUCT P
LEFT JOIN ORDER_ITEM I  ON P.PRODUCT_ID = I.PRODUCT_ID
LEFT JOIN ORDERS O      ON I.ORDER_ID = O.ORDER_ID
GROUP BY P.NAME, P.STOCK
HAVING NVL(SUM(I.QUANTITY), 0) <= 2
ORDER BY 판매수량 DESC;

-- =====================
-- 3. 피부타입별 많이 산 상품
-- =====================
SELECT C.SKIN_TYPE 피부타입, P.NAME 상품명, COUNT(*) 구매횟수
FROM CUSTOMER C
JOIN ORDERS O       ON C.CUSTOMER_ID = O.CUSTOMER_ID
JOIN ORDER_ITEM I   ON O.ORDER_ID = I.ORDER_ID
JOIN PRODUCT P      ON I.PRODUCT_ID = P.PRODUCT_ID
GROUP BY C.SKIN_TYPE, P.NAME
ORDER BY 구매횟수 DESC;