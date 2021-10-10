select Distinct R.Sal_name from  (select t.ID,t.Name Sal_name, d.cust_id, c.Name Cust_name 
from  dbo.Salesperson t  right join dbo.Orders d  on t.ID=d.salesperson_id 
full join dbo.Customer c on c.ID=d.cust_id) R where R.Cust_name='Seamens'

select Name Sal_name  from Salesperson
EXCEPT  
select Distinct R.Sal_name from  (select t.ID,t.Name Sal_name, d.cust_id, c.Name Cust_name 
from  dbo.Salesperson t  right join dbo.Orders d  on t.ID=d.salesperson_id 
full join dbo.Customer c on c.ID=d.cust_id) R where R.Cust_name='Seamens'



select S.Name from (select  salesperson_id, count(*) count_order from dbo.Orders
group by  salesperson_id having count(*)>=2) R left join dbo.Salesperson S on  R.salesperson_id=S.ID
select distinct Name, Age INTO  dbo.TopSales from Salesperson where Salary>100000