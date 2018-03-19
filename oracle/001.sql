--������ ����ֱ�
INSERT INTO T_MENU(MENU_NUM, TITLE, PRICE)
VALUES(1, '¥���', 5000);

INSERT INTO T_MENU(MENU_NUM, TITLE, PRICE)
VALUES(2, '«��', 6000);

INSERT INTO T_MENU(MENU_NUM, TITLE, PRICE)
VALUES(3, '������', 5000);

INSERT INTO T_MENU(MENU_NUM, TITLE, PRICE)
VALUES(4, '������', 10000);

INSERT INTO T_MENU(MENU_NUM, TITLE, PRICE)
VALUES(5, '������', 6000);

--���� ���� Ȯ���غ���
SELECT *
FROM T_MENU
order by menu_num;

--���� �Ͱ� �ٸ� ������� RECEIPT�� ������ �־��
--SYSDATE�� ���� ��¥���� ��Ÿ����. ���� char�� �ý�����Ʈ�� 'yyyy~'�� ���� �ٲ�
SELECT SYSDATE, TO_CHAR(SYSDATE, 'yyyy-mm-dd hh24:mi:ss')
FROM DUAL;

--RECEIPT ���� �־��
INSERT INTO T_RECEIPT(RECEIPT_NUM, RECEIPT_DATETIME)
VALUES (1, TO_DATE('2017-07-26 09:30:45', 'yyyy-mm-dd hh24:mi:ss'));


INSERT INTO T_RECEIPT(RECEIPT_NUM, RECEIPT_DATETIME)
VALUES (2, TO_DATE('2017-07-26 09:40:42', 'yyyy-mm-dd hh24:mi:ss'));

INSERT INTO T_RECEIPT(RECEIPT_NUM, RECEIPT_DATETIME)
VALUES (3, TO_DATE('2017-07-26 09:53:04', 'yyyy-mm-dd hh24:mi:ss'));

--��� ���� *�� ���� ���� NUM, TO_CHAR�� ���� ���ϰ� �ؾ� �ð������� ��ٰ� ��
SELECT RECEIPT_NUM, TO_CHAR(RECEIPT_DATETIME, 'yyyy-mm-dd hh24:mi:ss') "RECEIPT_DTIME"
FROM T_RECEIPT;

--Ŀ���� select�� ��� Ȯ�� �Ŀ� �ϱ�
COMMIT;

--RECEIPT_DETAIL�� ù��° �ֹ��� ���� ���� �ֱ�
INSERT INTO T_RECEIPT_DETAIL(RECEIPT_NUM, MENU_NUM, QTY)
VALUES(1, 1, 2);

INSERT INTO T_RECEIPT_DETAIL(RECEIPT_NUM, MENU_NUM, QTY)
VALUES(1, 2, 1);

SELECT *
FROM T_RECEIPT_DETAIL;

COMMIT;

--T_MENU�� T_RECEIPT_DETAIL�� ������ ��� �����

--�÷����(*�� ��ü, ����ó�� ���̰� ������� ���� �ִ�. a.RECEIPT~�̷���)
SELECT  a.RECEIPT_NUM, a.MENU_NUM, a.QTY, b.TITLE, b.PRICE, 
a.QTY * b.PRICE "AMOUNT"
FROM T_RECEIPT_DETAIL a JOIN T_MENU b ON (a.MENU_NUM = B.MENU_NUM);  --���̺� �Ǵ� ��������..�������� a, �޴��� b�� �ٿ�����

--���� �� �ð� ������ 2�� ������ 1�� ¥��� 1���� �Ծ���. ��?
INSERT INTO T_RECEIPT(RECEIPT_NUM, RECEIPT_DATETIME)
VALUES (4, SYSDATE);

--�Է� �Ŀ� �׻� SELECT�� Ȯ���ϱ�
SELECT RECEIPT_NUM, TO_CHAR(RECEIPT_DATETIME, 'yyyy-mm-dd hh24:mi:ss') "RECEIPT_DTIME"
FROM T_RECEIPT;

INSERT INTO T_RECEIPT_DETAIL(RECEIPT_NUM, MENU_NUM, QTY)
VALUES(4, 5, 2);

INSERT INTO T_RECEIPT_DETAIL(RECEIPT_NUM, MENU_NUM, QTY)
VALUES(4, 4, 1);

INSERT INTO T_RECEIPT_DETAIL(RECEIPT_NUM, MENU_NUM, QTY)
VALUES(4, 1, 1);

SELECT *
FROM T_RECEIPT_DETAIL;

COMMIT;

--������ �����Ͽ��� ���������� 4�� ������ �ϱ� ���ؼ� WHERE ��. �׸��� �����ϰ� T_MENU�� ����
SELECT a.RECEIPT_NUM, b.TITLE, b.PRICE, a.QTY, b.PRICE * a.QTY "AMOUNT"
FROM T_RECEIPT_DETAIL a JOIN T_MENU b ON (a.MENU_NUM = b.MENU_NUM)
WHERE a.RECEIPT_NUM = 4;

--��ü ���ݰ� �ΰ������� ���غ���... ���� ���� ������� SUM�Լ�
SELECT a.RECEIPT_NUM, SUM(b.PRICE * a.QTY) "TOTAL"
FROM T_RECEIPT_DETAIL a JOIN T_MENU b ON (a.MENU_NUM = b.MENU_NUM)
GROUP BY a.RECEIPT_NUM; --�׷��Լ� ���Ҷ��� ���� �̷��� �ϸ� �ֹ���ȣ�� �ջ�ݾ�.
--���� group by a.RECEIPT_NUM, b.TITLE;�� �Ѵٸ� �ֹ���ȣ��+�޴��� �Ի�ݾ��� ��
--T_RECEIPT�� ���� ���� �ִ� �� �̿��� �����ϰ� 
SELECT a.RECEIPT_NUM, TO_CHAR(c.RECEIPT_DATETIME, 'yyyy-mm-dd hh24:mi:ss') "RECEIPT_DTIME", 
SUM(b.PRICE * a.QTY) "TOTAL", SUM(b.PRICE * a.QTY) * 0.1 "VAT"
FROM T_RECEIPT_DETAIL a JOIN T_MENU b ON (a.MENU_NUM = b.MENU_NUM)
                        JOIN T_RECEIPT c ON (a.RECEIPT_NUM = c.RECEIPT_NUM)
GROUP BY a.RECEIPT_NUM, c.RECEIPT_DATETIME --�׷���̽� RECEIPT_DTIME���� �ϸ� �ȵ�.
HAVING a.RECEIPT_NUM= 4; --WHERE a.RECEIPT_NUM = 4�� ���� �������� WHERE�� SELECT �Ŀ� �� ����. 
--HAVING�� GROUPING �Ŀ� �� ����. WHERE�� �� �����⿡ WHERE �ֿ켱



--����: �޴��� ������Ȳ�� ���غ��� (����: ������ ���� ������)
--1 �������� Ȯ��
SELECT MENU_NUM, QTY
FROM T_RECEIPT_DETAIL; 
--2 PK�� FK�� �����ϱ�
SELECT a.MENU_NUM, a.QTY, b.PRICE
FROM T_RECEIPT_DETAIL a JOIN T_MENU b ON (a.MENU_NUM = b.MENU_NUM);
--3 ��� ������ ���� ����
SELECT a.MENU_NUM, a.QTY * b.PRICE
FROM T_RECEIPT_DETAIL a JOIN T_MENU b ON (a.MENU_NUM = b.MENU_NUM);
--4 SUM���� �׷���
SELECT b.TITLE, SUM(a.QTY * b.PRICE) "AMOUNT" 
FROM T_RECEIPT_DETAIL a JOIN T_MENU b ON (a.MENU_NUM = b.MENU_NUM)
GROUP BY b.TITLE
ORDER BY AMOUNT DESC; --ORDER BY�� ���� ���������. 