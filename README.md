# Втора лабораториска вежба по Софтверско инженерство

## Виктор Јовев, бр. на индекс 186068

### Група на код: 

Код група: 3

###  Control Flow Graph

![](ControlFlow.jpg) 

### Цикломатска комплексност

Nodes - Edges + 2 = 32 - 24 + 2= 10  
цикломатска комплексност е 10

### Тест случаи според критериумот  Every statement 

function(user=null, allUsers=null)  
function(new User(null,null,null), allUsers = null)  
function(new User(“Viktor”,”viktorjovev”,null), allUsers=null)  
function(new User(“Viktor”,”jovev”,null), allUsers=null)  
function(new User(“Viktor”,”Jovev$456”,null), allUsers=null))  
function(new User(“Viktor”,”Jovev456”,null), allUsers=null))  

### Тест случаи според критериумот Multiplie Condition

function(new User(null,null,null), allUsers=null)  
function(new User(null,”jovev”,null), allUsers=null)  
function(new User(“Viktor”,null,null), allUsers=null)

function(newUser("Viktor","jovevasdasd",null),null));  
function(new User("Viktor","jovev$!@#",null),null));  
function(new User("Viktor","JovevViktorche",null),null));  
function(new User("Viktor","JovevV#$!@#",null),null));  
function(new User("Viktor","jovev45678",null),null));  
function(new User("Viktor","jovev$@456",null),null));  
function(new User("Viktor","Jovev45678",null),null)); 


### Објаснување на напишаните unit tests

`public void testCriteriaEveryStatement()`  
	**Едноставно, со оваа функција сакаме да ги поминиме сите јазли
	во Control Flow Graph.**  
	**-Во првите два случаева ги тестираме исклучоците.**  
	**-Понатаму, правиме тест за што ако името се состои во  
	лозинката и тест за должината на лозинката која треба да биде повеќе од 8 знаци.**  
	**-Последните два тестови се дали ги исполнува дополнителните барања  
	за „добра“ лозинка.**  


`public void testCriteriaMultiplieCondition()`  
**Тука ги проверуваме само if-овите во кои има повеќе услови одвоени со логичките оператори.**  
**Во зависност колку услови има, може однапред да предивидиме   
колку би требало тест случаеви да направиме,а тоа е 2^n - 1. Одзимаме со 1 поради случајот кој го исполнува условот и поминува со остатокот од кодот.**  
**-Првите три случаеви важат за if-от кој проверува дали како параметри името и лозинката на корисникот добиваат null вредности.**  
**-Останатите тест случаеви односно 7, проверуваме најразлични лозинки кои не ги исполнуваат условите како да имаат барем 1 голема буква, барем 1 специјален знак и барем 1 број.**

